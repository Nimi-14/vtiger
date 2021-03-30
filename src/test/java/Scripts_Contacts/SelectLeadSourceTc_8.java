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
 * @author Suhasini
 *
 */

public class SelectLeadSourceTc_8 extends Base{
	WebDriverUtils wutil=new WebDriverUtils();
	ExcelUtils exc=new ExcelUtils();
@Test(groups="smokeTest")
public void createContactLeadSourceTest() throws EncryptedDocumentException, IOException{
	
	Home_pageTest home = new Home_pageTest(driver);
	CreateContactPage create = new CreateContactPage(driver);
	
	//click on contact link
	home.getcontactLink();
	
	//click on create plus button
	home.getcreatePlusButton().click();
	
	//enter last name
	create.getLastnameText();
	
	//select lead source 
	create.getLeadSource();
	}
}

