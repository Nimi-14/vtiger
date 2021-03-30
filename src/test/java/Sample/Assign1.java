package Sample;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assign1 {
@Test(dataProvider="data")
public void vtger(String dta) throws EncryptedDocumentException, IOException, InterruptedException{
	System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost:8888/index.php");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Organizations")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(dta);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	Random r=new Random();
	int x = r.nextInt();
	
}
	
	
	
@DataProvider
public Object[][] data() throws EncryptedDocumentException, IOException{
	Exxl exc=new Exxl();
	int rowindex = exc.getRowCount("Sheet1");
	Object[][] objarr=new Object[rowindex][1];
	for(int i=0;i<rowindex;i++){
		objarr[i][0]= exc.getData("Sheet1", i,0);
		}
	return objarr;
	
}
}
