package com.crm.vtiger.ObjectRepositoryUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportWindowPage {
	WebDriver driver;
@FindBy(xpath="//table[@class='small']/tbody/tr[2]/td[1]/a[@href='javascript:window.close();']")
private WebElement ReportWindow;

public ReportWindowPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getReportWindow() {
	return ReportWindow;
}

}
