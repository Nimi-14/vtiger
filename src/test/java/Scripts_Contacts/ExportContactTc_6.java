package Scripts_Contacts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.ObjectRepositoryUtils.CreateContactPage;
import com.crm.vtiger.ObjectRepositoryUtils.Home_pageTest;
import Generics.Base;
import Generics.ExcelUtils;

/**
 * 
 * @author Nirmala
 *
 */
@Listeners(ExtentReport.ListnerImpPgm.class)
public class ExportContactTc_6 extends Base{
ExcelUtils exc=new ExcelUtils();
@Test
public void createContactTest() throws Throwable {
	Home_pageTest home = new Home_pageTest(driver);
	CreateContactPage create = new CreateContactPage(driver);
	
	//click on contact link
	home.getcontactLink().click();
	
	
	//click on create plus button
	home.getcreatePlusButton().click();
	
	//enter last name
	create.getLastnameText();
	
	//click on export img
	create.getExportimg().click();
	
	}
}
