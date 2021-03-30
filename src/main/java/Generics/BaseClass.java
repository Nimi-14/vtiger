package Generics;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.seleniumhq.jetty9.util.log.JavaUtilLog;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.PropertyUtils;

import com.crm.vtiger.ObjectRepositoryUtils.Home_pageTest;
import com.crm.vtiger.ObjectRepositoryUtils.LoginPageTest;

public class BaseClass {

	
		/*Object creation*/
		public PropertyFileUtils fLib = new PropertyFileUtils();
		public ExcelUtils excel = new ExcelUtils();
		public JavaUtils jLib = new JavaUtils();
		public WebDriverUtils wlib = new WebDriverUtils();
		public DatabaseUtils dbLb = new DatabaseUtils();
		public WebDriver driver;
		
	
		
		@BeforeClass
		public void configBeforeClass() throws Throwable {
			/* launch the Browser*/
			/*read Common Data*/
			
			System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
			String URL = fLib.propFileUtils("url");

			String BROWSER = fLib.propFileUtils("browser");
			
			 if(BROWSER.equals("firefox")) {
			    driver = new FirefoxDriver();
			 }else if(BROWSER.equals("chrome")) {
				 driver = new ChromeDriver();
			 }else if(BROWSER.equals("ie")) {
				 driver = new InternetExplorerDriver();
			 }else {
				 driver = new ChromeDriver();
			 }
			
			 wlib.waitForPageToLoad(driver);
			 driver.get(URL);
		}
		
		
		@BeforeMethod
		public void configBeforeMtd() throws Throwable {
			/*step-1 : login to Application*/
			LoginPageTest lp = new LoginPageTest(driver);
			WebElement user = lp.getLoginUsername();
			user.sendKeys(fLib.propFileUtils("Username"));
			WebElement pwd = lp.getLoginPassword();
			pwd.sendKeys(fLib.propFileUtils("Password"));
			lp.getLoginButton().click();
			
		}
		
		@AfterMethod
		public void configAfterMethod() throws Throwable {
			LoginPageTest lp = new LoginPageTest(driver);
			lp.getLogoutbtn().click();
			lp.getSignout().click();
	    }
		
		
		@AfterClass
		public void configAfterClass() {
			driver.close();
		}
		
		
	}


