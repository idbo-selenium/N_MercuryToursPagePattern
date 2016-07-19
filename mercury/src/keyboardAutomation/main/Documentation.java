package keyboardAutomation.main;

import org.openqa.selenium.By;

import utility.Utility;

public class Documentation {

	public void Click() {
		// TODO Auto-generated method stub
		//Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/ul/li[5]/a"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/ul/li[4]/a"), 5000).click();
	}

}
