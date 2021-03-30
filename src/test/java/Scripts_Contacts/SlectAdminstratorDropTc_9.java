package Scripts_Contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.ObjectRepositoryUtils.ContactInformationPage;
import com.crm.vtiger.ObjectRepositoryUtils.CreateContactPage;
import com.crm.vtiger.ObjectRepositoryUtils.Home_pageTest;

import Generics.Base;
import Generics.ExcelUtils;
import Generics.WebDriverUtils;

/**
 * 
 * @author Suhasini
 *
 */
@Listeners(ExtentReport.ListnerImp.class)
public class SlectAdminstratorDropTc_9  extends Base {
	WebDriverUtils wutil=new WebDriverUtils();
	ExcelUtils exc=new ExcelUtils();
@Test(groups="smokeTest")
public void contactUserRadioTest() throws EncryptedDocumentException, IOException{
	
	Home_pageTest home = new Home_pageTest(driver);
	CreateContactPage create = new CreateContactPage(driver);
	
	//click on contact link
	home.getcontactLink().click();
	
	//click on create plus button
	home.getcreatePlusButton().click();
	
	//enter last name
	create.getLastnameText();
	
	//click on user radio btn
	create.getUserRadio().click();
	
	//select as administrator from the dropdown
	create.getUserDrop(0);

  }

@Test(groups="regressionTest")
public void contactRadioGroupTest() throws EncryptedDocumentException, IOException{
	Home_pageTest home = new Home_pageTest(driver);
	CreateContactPage create = new CreateContactPage(driver);
	ContactInformationPage cinfo = new ContactInformationPage(driver);
	
	String ExpectedMsg = "aaj Singh";
	
	//click on contact link
	home.getcontactLink().click();
	
	//click on create plus button
	home.getcreatePlusButton().click();
	
	//enter last name
	create.getLastnameText();
	
	//click on group radio btn
	create.getGroupRadio().click();
	
	//select as Marketting Group
	create.getGroupDrop(0);
	
	
	//click on save
	create.getSaveBtn().click();
	
	String actualMsg = cinfo.getActualMsg().getText();
	
	Assert.assertTrue(actualMsg.contains(ExpectedMsg));
	
}

@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}
