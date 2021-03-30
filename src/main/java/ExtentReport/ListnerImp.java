package ExtentReport;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImp implements ITestListener{
	
	ExtentReports report;
	ExtentTest test;

	public void onFinish(ITestContext context) {
		report.flush();
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./test-output/ExtentReport.html");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setDocumentTitle("Vtiger App");
		htmlreport.config().setReportName("Smoke Test");
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Platform", "Windows");
    	report.setSystemInfo("OS", "Windows 10");
    	report.setSystemInfo("Environment", "Testing Environment");
    	report.setSystemInfo("Reporter", "Suhasini");
        		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+" is failed");
    	test.log(Status.FAIL, result.getThrowable());
		WebDriverUtils wutil = new WebDriverUtils();
		try {
			wutil.takeScreenShot(result.getMethod().getMethodName());
			//test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" is skipped");
        test.log(Status.SKIP,result.getThrowable());
		
	}

	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");
		
	}
	
	
}