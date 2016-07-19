package mercury.main;

import org.openqa.selenium.By;

import utility.Utility;

public class LogOutClick {

	public int maxSecond = 5000;
	public void Click() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img"), maxSecond).click();
	}
	

}
