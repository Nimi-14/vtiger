package Sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Vtiger1 {
@Test
public void tiger() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	
	driver.get("http://localhost:8888/index.php");
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//table[@class='searchUIBasic small']/tbody/tr[1]/td[3]")).sendKeys("ACC4");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='crmbutton small delete'])[2]")).click();
	Thread.sleep(1000);
	Alert alrt = driver.switchTo().alert();
	alrt.accept();
	
	
}
}
