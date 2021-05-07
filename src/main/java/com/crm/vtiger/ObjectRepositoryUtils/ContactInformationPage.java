package com.crm.vtiger.ObjectRepositoryUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Nirmala
 *
 */

public class ContactInformationPage {
	
	WebDriver driver;
	
@FindBy(xpath="//table[@class='small']/tbody/tr[1]/td[5]/input[@name='Delete'])[1]")
private WebElement Deletebtn;

@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement actualMsg;

public ContactInformationPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getDeletebtn() {
	return Deletebtn;
}

public WebElement getActualMsg() {
	return actualMsg;
}




}
