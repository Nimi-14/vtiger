package Sample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Assign {
	@Test(dataProvider="data")
	public void bookTicket(String src, String dst){
		System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
		WebDriver driver=(WebDriver) new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10);
		driver.get("https://www.makemytrip.com/flights");
		
		driver.findElement(By.xpath("//span[.='From']")).click();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(src);
		driver.findElement(By.xpath("//span[.='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(dst);
		
	}

	@DataProvider
	public Object[][] data() throws EncryptedDocumentException, IOException,NullPointerException{
		Exxl ex=new Exxl();
		int rowindex = ex.getRowCount("Sheet1");
		Object[][] objarr=new Object[rowindex][2];
		for(int i=0;i<rowindex;i++){
			objarr[i][0]=ex.getData("Sheet1", i, 0);
			objarr[i][1]=ex.getData("Sheet1", i, 1);
		}
		return objarr;
		}

	}


