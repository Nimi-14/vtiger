/*package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generics.ExcelUtils;
import Generics.JavaUtils;
import Generics.PropertyFileUtils;
import Generics.WebDriverUtils;

public class Assignment2 {
	public static WebDriver driver;
	JavaUtils util=new JavaUtils();
	ExcelUtils xutil=new ExcelUtils();
	PropertyFileUtils putil=new PropertyFileUtils();
	WebDriverUtils dutil=new WebDriverUtils();
	
@Test
public void vTiger() throws Throwable {
	
	int value = util.randomValue();
	String name = xutil.getSheetData();
	String name1 = name+value;
	
	
	System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get(putil.propFileUtils("url"));
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(putil.propFileUtils("Username"));
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(putil.propFileUtils("Password"));
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.xpath("//table[@class='small']/tbody/tr[3]/td[2]/input")).sendKeys(name1);
	
	driver.findElement(By.xpath("//table[@class='small']/tbody/tr[6]/td[2]/img")).click();
	dutil.switchToChildWindow(driver);
	
	WebElement d1 = driver.findElement(By.xpath("//table[@class='small']/tbody/tr[9]/td[2]/select"));
	WebElement d2 = driver.findElement(By.xpath("//table[@class='small']/tbody/tr[9]/td[4]/select"));
	WebElement d3 = driver.findElement(By.xpath("//table[@class='small']/tbody/tr[10]/td[2]/select"));
	dutil.dropDownHandler(d1, "Apparel");
	dutil.dropDownHandler(d2, "Active");
	dutil.dropDownHandler(d3, "Analyst");

  }
	
}
*/

