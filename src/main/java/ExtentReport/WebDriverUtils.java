package ExtentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.google.common.io.Files;

public class WebDriverUtils {
	
	WebDriver driver;
public String takeScreenShot(String methodname) throws IOException{
	
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	String path = System.getProperty("user.dir")+"/ScreenShots.html"+methodname;
	File src = screenshot.getScreenshotAs(OutputType.FILE);
	File dst = new File(path);
	Files.copy(src, dst);
	return path;
}
}
