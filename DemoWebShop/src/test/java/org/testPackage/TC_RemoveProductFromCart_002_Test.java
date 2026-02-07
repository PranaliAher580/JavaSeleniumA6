package org.testPackage;

import org.genericLib.BaseTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(org.genericLib.MyListener.class)
public class TC_RemoveProductFromCart_002_Test extends BaseTest
{
	@Test
	public void removeProductFromCartMethod() throws InterruptedException
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(),true,"Product Is Not Added To Cart !!" );
		
		bp.getShoopingCartLink().click();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
	    scp.removeSmartPhoneMethod();

	try {
		  if(scp.getSmartPhoneCartItem().isDisplayed())
		{
		
		  Reporter.log("Product is not removed from cart",true);
		}
	}
	catch(Exception e)
	{
		Reporter.log("Product is not removed from cart!!",true);
	}
	
	sa.assertAll();
	}
	
}
