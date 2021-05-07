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

public class ContactListpage {
	
	WebDriver driver;
	
@FindBy(xpath="//table[@class='lvt small']/tbody/tr[3]/td[4]/a[@title='Contacts']")
private WebElement LastNameColumn;

@FindBy(xpath="(//input[@title='Delete [Alt+D]'])[1]")
private WebElement Deletebtn;

public ContactListpage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getLastNameColumn() {
	return LastNameColumn;
}

public WebElement getDeletebtn() {
	return Deletebtn;
}

}
