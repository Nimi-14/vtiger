package com.crm.vtiger.ObjectRepositoryUtils;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.ExcelUtils;
import Generics.WebDriverUtils;

/**
 * 
 * @author Suhasini
 *
 */

public class CreateContactPage {
	
	WebDriver driver;
	WebDriverUtils wutil = new WebDriverUtils();
	ExcelUtils exc = new ExcelUtils();
	
@FindBy(xpath="//table[@cellpadding='0']/tbody/tr[4]/td[2]/input[@name='lastname']")
private WebElement LastnameText;

@FindBy(xpath="//img[@title='Export Contacts']")
private WebElement Exportimg;

@FindBy(xpath="//table[@class='small']/tbody/tr[10]/td[4]/img")
private WebElement ReportToimg;

@FindBy(xpath="//table[@class='small']/tbody/tr[2]/td[1]/a")
private WebElement ParentWindow;

@FindBy(xpath="//table[@class='small']/tbody/tr[6]/td[2]/select[@name='leadsource']")
private WebElement LeadSource;

@FindBy(xpath="//input[@class='crmButton small save']")
private WebElement SaveBtn;

@FindBy(xpath="//input[@value='U']")
private WebElement UserRadio;

@FindBy(xpath="//select[@name='assigned_user_id']")
private WebElement UserDrop;

@FindBy(xpath="//input[@value='T']")
private WebElement GroupRadio;

@FindBy(xpath="//select[@name='assigned_group_id']")
private WebElement GroupDrop; 

@FindBy(xpath="(//a[text()='Contacts'])[1]")
private WebElement ContactLink;


public CreateContactPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void getLastnameText() throws EncryptedDocumentException, IOException{
	LastnameText.sendKeys(exc.getSheetData());
}


public WebElement getExportimg() {
	return Exportimg;
}


public WebElement getReportToimg() {
	return ReportToimg;
}


public WebElement getParentWindow() {
	return ParentWindow;
}


public WebElement getLeadSource() {
	wutil.dropDownHandler(LeadSource, 1);
	return LeadSource;
}


public WebElement getSaveBtn() {
	return SaveBtn;
}


public WebElement getUserRadio() {
	return UserRadio;
}


public WebElement getUserDrop(int ind) {
	wutil.dropDownHandler(UserDrop, ind);
	return UserDrop;
}

public WebElement getUserDrop(String Text) {
	wutil.dropDownHandler(UserDrop, Text);
	return UserDrop;
}


public WebElement getGroupRadio() {
	return GroupRadio;
}


public WebElement getGroupDrop(int ind) {
	
	wutil.dropDownHandler(GroupDrop, ind);
	return GroupDrop;
}

public WebElement getGroupDrop(String Text) {
	
	wutil.dropDownHandler(GroupDrop, Text);
	return GroupDrop;
}


public WebElement getContactLink() {
	return ContactLink;
}

}
