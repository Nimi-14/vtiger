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
 * @author 
 *
 */

public class SelectGroupSupportSaveTc_11 extends Base {
	WebDriverUtils wutil=new WebDriverUtils();
	ExcelUtils exc=new ExcelUtils();
@Test
public void contactGroupDropTest() throws EncryptedDocumentException, IOException{
	Home_pageTest home = new Home_pageTest(driver);
	CreateContactPage create = new CreateContactPage(driver);
	
	//click on contact link
	home.getcontactLink().click();;
	
	//click on create plus button
	home.getcreatePlusButton().click();
	
	//enter last name
	create.getLastnameText();
	
	//click on group radio btn
	create.getGroupRadio().click();
	
	//select as Supportting Group
	create.getGroupDrop(1);
	
	//click on save
	create.getSaveBtn().click();
}
}

