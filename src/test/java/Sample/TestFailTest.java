package Sample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentReport.ListnerImp.class)
public class TestFailTest {

				

	// Test to pass as to verify listeners .		
	@Test		
	public void Login()				
	{		
	    	System.out.println("Suhasini");	
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}		
}
