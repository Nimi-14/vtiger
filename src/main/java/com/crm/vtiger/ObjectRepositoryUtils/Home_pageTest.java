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

public class Home_pageTest {
	
	WebDriver driver;
	
@FindBy(xpath="//table[@cellspacing='0']/tbody/tr[1]/td[8]/a")
private WebElement ContactLink;

//@FindBy(xpath="//table[@cellspacing='0']/tbody/tr[1]/td[1]/a/img[@alt='Create Contact...']")
@FindBy(xpath="//img[@title='Create Contact...']")
private WebElement createPlusButton;

@FindBy(xpath="//table[@class='lvt small']/tbody/tr[3]/td[4]/a")
private WebElement LastNameColumn;

public WebElement getcontactLink() {
	 return ContactLink;
}

public WebElement getcreatePlusButton(){
	return createPlusButton;
}

public Home_pageTest(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getLastNameColumn() {
	return LastNameColumn;
}

}

