package Scripts_Contacts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.ObjectRepositoryUtils.ContactListpage;
import com.crm.vtiger.ObjectRepositoryUtils.CreateContactPage;
import com.crm.vtiger.ObjectRepositoryUtils.Home_pageTest;
import com.crm.vtiger.ObjectRepositoryUtils.ReportWindowPage;

import Generics.Base;
import Generics.ExcelUtils;
import Generics.WebDriverUtils;

/**
 * 
 * @author Suhasini
 *
 */

public class DeleteContactTc_7 extends Base {
	ExcelUtils exc=new ExcelUtils();
	WebDriverUtils wutil1=new WebDriverUtils();
	
@Test
public void contact() throws EncryptedDocumentException, IOException{
	
	Home_pageTest home = new Home_pageTest(driver);
	CreateContactPage create = new CreateContactPage(driver);
	ContactListpage clst = new ContactListpage(driver);
	ReportWindowPage report = new ReportWindowPage(driver);

	//click on contact link
	home.getcontactLink().click();
	
	//click on create plus button
	home.getcreatePlusButton().click();
	
	//enter last name
	create.getLastnameText();
	
	//click on report plus
	create.getReportToimg().click();
	
	//open child window
	wutil1.switchToBrowser(driver,"Contacts&action");
	
	//select contact
	report.getReportWindow().click();
	
	//switch to parent
	wutil1.switchToBrowser(driver,"Contacts");
	
	//click on contact link
	create.getContactLink().click();
	
	//click on last name from the column
	clst.getLastNameColumn().click();

	//delete the contact
	clst.getDeletebtn().click();
	
	//click ok for alert pop=up
	wutil1.acceptAlert(driver);

}
}
