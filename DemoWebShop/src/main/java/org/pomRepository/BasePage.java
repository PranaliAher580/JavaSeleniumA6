package org.pomRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
	//Declaration
  @FindBy(linkText = "Register") private WebElement registerLink;
  @FindBy(linkText = "Log in") private WebElement loginLink;
  @FindBy(xpath = "//span[text()='Shopping cart']") private WebElement shoopingCartLink;
  @FindBy(xpath = "//span[text()='Wishlist']") private WebElement wishlistLink;
  @FindBy(partialLinkText = "BOOKS") private WebElement booksLink;
  @FindBy(partialLinkText = "COMPUTERS") private WebElement computerLink;
  @FindBy(partialLinkText = "ELECTRONICS") private WebElement electronicsLink;
  @FindBy(linkText = "Log out") private WebElement logoutLink;
  
  // Initialization
  public BasePage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }

  
   //Utilization
  public WebElement getRegisterLink() {
	return registerLink;
  }

  public WebElement getLoginLink() {
	return loginLink;
  }

  public WebElement getShoopingCartLink() {
	return shoopingCartLink;
  }

  public WebElement getWishlistLink() {
	return wishlistLink;
  }

  public WebElement getBooksLink() {
	return booksLink;
  }

  public WebElement getComputerLink() {
	return computerLink;
  }

  public WebElement getElectronicsLink() {
	return electronicsLink;
  }


  public WebElement getLogoutLink() {
	return logoutLink;
  }
  
  
  
}
