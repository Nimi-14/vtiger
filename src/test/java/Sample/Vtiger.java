package Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Vtiger {

	ArrayList<String> l1;
	
@Test
public void organize() throws Throwable{
	System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	driver.get("http://localhost:8888/index.php");
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.linkText("Organizations")).click();
	List<WebElement> data = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
	ArrayList<String> l1=new ArrayList<String>();
	
	for(WebElement wb : data){
		String value = wb.getText();
		l1.add(value);
	}
	Collections.sort(l1);
	System.out.println("****Collection sorted data****");
	for(String d:l1){
	System.out.println(d);
	}
	
	
	driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[1]/td[3]/a")).click();
	Thread.sleep(1000);
	List<WebElement> data2 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
	ArrayList<String> l2=new ArrayList<String>();
	
	for(WebElement wb1 : data2){
		String value1 = wb1.getText();
		l2.add(value1);
	}
	System.out.println("****App sorted data****");
	for(String d1:l2){
		System.out.println(d1);
		}
		
	
	Assert.assertEquals(l1, l2);
	if(l1==l2){
		System.out.println("Pass");
	}
	else{
		System.out.println("Fail");
	}
	
	
	
}
}
