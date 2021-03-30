package com.crm.vtiger.ObjectRepositoryUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generics.ExcelUtils;
import Generics.PropertyFileUtils;
import Generics.WebDriverUtils;

/**
 * 
 * @author Suhasini
 *
 */
public class LoginPageTest {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement LoginUsername;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement LoginPassword;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Logoutbtn;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement Signout;
	
	public LoginPageTest(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginUsername() {
		
		return LoginUsername;
	}

	public WebElement getLoginPassword() {
		
		return LoginPassword;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getLogoutbtn() {
		return Logoutbtn;
	}

	public WebElement getSignout() {
		return Signout;
	}
	
	
	
	
	
	
	
}

