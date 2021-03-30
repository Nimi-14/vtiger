package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.vtiger.ObjectRepositoryUtils.LoginPageTest;

public class Base {
	PropertyFileUtils putil = new PropertyFileUtils();
	WebDriverUtils wutil = new WebDriverUtils();
	public WebDriver driver;
	//public EventFiringWebDriver driver;
	public static WebDriver staticDriver;
	
@BeforeClass(groups={"smokeTest","regressionTest"})
public void configure() throws Throwable{
	
	System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
	String url = putil.propFileUtils("url");
	String browser = putil.propFileUtils("browser");
	
	if(browser.equals("firefox")){
		 driver = new FirefoxDriver();
	}else if(browser.equals("chrome")){
		driver = new ChromeDriver();
	}
	else{
		driver = new FirefoxDriver();
	}
	
	wutil.waitForPageToLoad(driver);
	driver.get(url);
}
	
@BeforeMethod(groups={"smokeTest","regressionTest"})
public void login() throws Throwable{
	LoginPageTest login = new LoginPageTest(driver);
	WebElement user = login.getLoginUsername();
	user.sendKeys(putil.propFileUtils("username"));
	WebElement pwd = login.getLoginPassword();
	pwd.sendKeys(putil.propFileUtils("password"));
	login.getLoginButton().click();
}

@AfterMethod(groups={"smokeTest","regressionTest"})
	public void logout(){
		LoginPageTest lout = new LoginPageTest(driver);
		WebElement log=lout.getLogoutbtn();
		wutil.moveToExpectedElement(driver, log);
		lout.getSignout().click();
	}

@AfterClass(groups={"smokeTest","regressionTest"})
public void close(){
	driver.close();
  }
}

