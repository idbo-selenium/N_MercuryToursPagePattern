package mercury.main;

import org.openqa.selenium.By;
import utility.Utility;

public class HeaderPage {

	int maxSecond = 5000;
	public void SelectSignIn() {
		// Find the sign in button and click it.
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"), maxSecond).click();		
	}
	public void ClickRegister() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"), maxSecond).click();		
	}	
}