package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
  //Declaration
	@FindBy(id="Email") private WebElement LoginEmailTB;
	@FindBy(id="Password") private WebElement LoginPasswordTB;
	@FindBy(id="RememberMe") private WebElement remeberMeCheckbox;
	@FindBy(linkText ="Forgot password?") private WebElement forgotPasswordLink;
	@FindBy(xpath="//input[@value='Log in']") private WebElement loginButton;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLoginEmailTB() {
		return LoginEmailTB;
	}

	public WebElement getLoginPasswordTB() {
		return LoginPasswordTB;
	}

	public WebElement getRemeberMeCheckbox() {
		return remeberMeCheckbox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	
	
}
