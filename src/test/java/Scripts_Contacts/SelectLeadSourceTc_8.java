package Scripts_Contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.vtiger.ObjectRepositoryUtils.CreateContactPage;
import com.crm.vtiger.ObjectRepositoryUtils.Home_pageTest;

import Generics.Base;
import Generics.ExcelUtils;
import Generics.WebDriverUtils;

/**
 * 
 * @author Nirmala
 *
 */

public class SelectLeadSourceTc_8 extends Base{
	WebDriverUtils wutil=new WebDriverUtils();
	ExcelUtils exc=new ExcelUtils();
@Test
public void createContactLeadSourceTest() throws EncryptedDocumentException, IOException, InterruptedException{
	
	Home_pageTest home = new Home_pageTest(driver);
	CreateContactPage create = new CreateContactPage(driver);
	Thread.sleep(2000);
	//click on contact link
	home.getcontactLink().click();
	
	//click on create plus button
	home.getcreatePlusButton().click();
	
	//enter last name
	create.getLastnameText();
	
	//select lead source 
	create.getLeadSource();
	}
}

