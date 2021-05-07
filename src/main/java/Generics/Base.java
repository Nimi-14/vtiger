package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.vtiger.ObjectRepositoryUtils.LoginPageTest;

public class Base {
	PropertyFileUtils putil = new PropertyFileUtils();
	WebDriverUtils wutil = new WebDriverUtils();
	public WebDriver driver;
//public EventFiringWebDriver driver;
	public static WebDriver staticDriver;
	
	
@BeforeClass
public void configure() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		String url = putil.propFileUtils("url");
		
	
	wutil.waitForPageToLoad(driver);
	driver.get(url);
}
	
@BeforeMethod
public void login() throws Throwable{
	LoginPageTest login = new LoginPageTest(driver);
	WebElement user = login.getLoginUsername();
	user.sendKeys(putil.propFileUtils("userName"));
	WebElement pwd = login.getLoginPassword();
	pwd.sendKeys(putil.propFileUtils("password"));
	login.getLoginButton().click();
}

@AfterMethod
	public void logout(){
		LoginPageTest lout = new LoginPageTest(driver);
		WebElement log=lout.getLogoutbtn();
		wutil.moveToExpectedElement(driver, log);
		lout.getSignout().click();
	}

@AfterClass
public void close(){
	driver.close();
  }  
}

