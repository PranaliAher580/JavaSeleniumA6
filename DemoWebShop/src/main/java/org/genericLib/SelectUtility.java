package org.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility 
{
  // To select an option by its visible text //to select india or anything option 
	public void selectByVisibleTextMethod(WebElement Dropdownelement,String visibleText)
	{
		 Select sel = new Select(Dropdownelement);
		 sel.selectByVisibleText(visibleText);
	}
}
