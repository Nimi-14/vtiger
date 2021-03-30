package Sample;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PropertFetch {
@Test
public void fetch() throws Throwable{
	FileInputStream fis=new FileInputStream("./EXCEL/assign.properties");
	Properties p=new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	String User = p.getProperty("Username");
	String Pass = p.getProperty("Password");
	
	System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get(URL);
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(User);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Pass);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	
	
}
}
