package org.testPackage;

import org.genericLib.BaseTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddTOCart_001_Test  extends BaseTest{
	@Test
	public void addToCartMethod()
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhonesLink().click();
		
		
		CellPhonesPage cpp = new CellPhonesPage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(),true,"Product Is Not Added To Cart !!" );
		
		sa.assertAll();
	}
}
