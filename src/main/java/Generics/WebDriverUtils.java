package Generics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Suhasini
 *
 */

public class WebDriverUtils {
	

public void dropDownHandler(WebElement dropdown, String Text){
	Select slct = new Select(dropdown);
	slct.selectByValue(Text);
	}

public void dropDownHandler(WebElement dropdown, int index){
	Select slct = new Select(dropdown);
	slct.selectByIndex(index);
	}

/**
 *  used to switch to another browser window based on browser partial / complete title
 * @param driver
 * @param browserTitle
 */
public void switchToBrowser(WebDriver driver, String browserTitle) {
	 Set<String> set = driver.getWindowHandles();
	  
	  for(String act : set) {
		  driver.switchTo().window(act);
		  String actPageTile = driver.getTitle();
		  System.out.println(actPageTile);
		  if(actPageTile.contains(browserTitle)) {
			  break;
		  }
	  }
}

/**
 * used to Switch to Alert Popup & click on OK button
 * @param driver
 */
public void alerttOK(WebDriver driver) {
	
	driver.switchTo().alert().accept();
}

/**
 * used to Switch to Alert Popup & click on cancel button
 * @param driver
 */
public void alerttCancel(WebDriver driver) {
	
	driver.switchTo().alert().dismiss();
}


public void moveToExpectedElement(WebDriver driver1,WebElement mouhoverelement){
	Actions act = new Actions(driver1);
	act.moveToElement(mouhoverelement).perform();
}

public void acceptAlert(WebDriver driver1){
	driver1.switchTo().alert().accept();
}

public void dismisAlert(WebDriver driver1){
	driver1.switchTo().alert().dismiss();
}

/**
 * 
 * @param driver
 */
	public void waitForPageToLoad(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	/**
	 *  used to wait for expected element visibility in GUI
	 * @param driver
	 * @param element
	 */
	/*public void waitForElemnetVisibality(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	**
	 * used to wait & click for expected element in GUI
	 * @param element
	 * @throws Throwable
	 */
	public void waitAndClick( WebElement element) throws Throwable {
		  int count = 0;
	        while(count < 40) {
			   try {
				   element.click();
			     break;
			   }catch (Throwable e) {
				Thread.sleep(500);
				count++;
			   }
	        }
	}
	
	/**
	 * used to wait for expected element in GUI
	 * @param element
	 * @throws Throwable
	 */
	public void waitforElement( WebElement element) throws Throwable {
		  int count = 0;
	        while(count < 40) {
			   try {
				   element.isDisplayed();
			     break;
			   }catch (Throwable e) {
				Thread.sleep(500);
				count++;
			   }
	        }
	}
	
	/**
	 * used to take mouse cursor on expected element on the browser
	 * @param driver
	 * @param element
	 */
	public void moveToExpectedElemnet(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/*public void takeScreenShot(String methodName) throws IOException{
		 EventFiringWebDriver event = new EventFiringWebDriver(Login_Close.staticDriver);
		 File src = event.getScreenshotAs(OutputType.FILE);
		 File dst = new File(ConstantPath.ListPath+methodName+".PNG");
		 FileHandler.copy(src,dst);
		}
		*/

}








