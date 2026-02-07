package org.testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.genericLib.BaseTest;
import org.genericLib.Flib;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.CheckoutPage;
import org.pomRepository.CompletedPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(org.genericLib.MyListener.class)
public class TC_BuyProduct_003_Test  extends BaseTest
{
	@Test
    public void buyProductMethod() throws EncryptedDocumentException, IOException
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
		scp.getSmartPhoneCartItem().click();
		scp.getTermsofServicesCheckbox().click();
		scp.getCheckoutButton().click();
		
		
		String city = Flib.getWorkbookcellValue(EXCEL_PATH_TEST,"buyproductcreds", 1, 0);
		String address1 = Flib.getWorkbookcellValue(EXCEL_PATH_TEST,"buyproductcreds", 1, 1);
	
	    String	pinCode=Flib.getNumericCellvalueMethod(EXCEL_PATH_TEST,"buyproductcreds", 1, 2);
		String contact = Flib.getNumericCellvalueMethod(EXCEL_PATH_TEST,"buyproductcreds", 1, 3);
		
		int rn = Flib.generateRandomNo();
		String phoneNO = contact+rn;
		
		CheckoutPage cop = new CheckoutPage(driver);
		cop.buyProduct(city, address1, pinCode, phoneNO);
		
		CompletedPage comp = new CompletedPage(driver);
		sa.assertEquals(comp.getOrderPlacedMsg().isDisplayed(), true,"Order is not processed!!");
		
		sa.assertAll();
		
		
		
    }
}
