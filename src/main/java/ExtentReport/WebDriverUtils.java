package ExtentReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

import Generics.Base;
import Generics.ConstantPath;

public class WebDriverUtils extends Base {
	
	
public String takeScreenShot(String methodname) throws IOException{
	
	/*EventFiringWebDriver event = new EventFiringWebDriver(Base.staticDriver);
	String path = ConstantPath.ExtentRprt+methodname+".jpeg";
	 File src = event.getScreenshotAs(OutputType.FILE);
	 File dst = new File(path);
	 Files.copy(src, dst);
	 return path;
}
}*/
	 
	 TakesScreenshot screen = (TakesScreenshot) driver;
	String path = ConstantPath.ExtentRprt+methodname+".jpeg";
	File src = screen.getScreenshotAs(OutputType.FILE);
	File dst = new File(path);
	Files.copy(src, dst);
	return path;
	
}
}	/*TakesScreenshot screenshot = (TakesScreenshot) driver;
String path = System.getProperty("user.dir")+"/ScreenShots"+methodname;
File src = screenshot.getScreenshotAs(OutputType.FILE);
File dst = new File(path);
Files.copy(src, dst);
return path;*/
