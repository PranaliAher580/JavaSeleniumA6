package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartPage 
{
	//Declaration
  @FindBy(xpath="//a[text()='Smartphone']/../..//input[@name='removefromcart']")
  private WebElement smartPhoneCartItem;
  @FindBy(name="updatecart") private WebElement updateCartButton;
  @FindBy(name="continueshopping") private WebElement continueShoppingButton;
  @FindBy(id="termsofservice") private WebElement termsofServicesCheckbox;
  @FindBy(id="checkout") private WebElement checkoutButton;
  
  //Initialization
  public ShoppingCartPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  //Utilization
  public WebElement getSmartPhoneCartItem() {
	return smartPhoneCartItem;
  }

  public WebElement getUpdateCartButton() {
	return updateCartButton;
  }

  public WebElement getContinueShoppingButton() {
	return continueShoppingButton;
  }

  public WebElement getTermsofServicesCheckbox() {
	return termsofServicesCheckbox;
  }

  public WebElement getCheckoutButton() {
	return checkoutButton;
  }
  
  //Operational Method or Business Logic
  
  public void removeSmartPhoneMethod() throws InterruptedException
  {
	  smartPhoneCartItem.click();
	  Thread.sleep(500);
	  updateCartButton.click();
	  
	 
  }
  
}
