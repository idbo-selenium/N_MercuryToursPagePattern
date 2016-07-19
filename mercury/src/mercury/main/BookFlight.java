package mercury.main;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utility.Utility;

public class BookFlight {

    public int maxSecond = 5000;
	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Book a Flight: Mercury Tours");
	}

	public void Submit() {
		//First Passenger details
		Utility.waitForPageUntilElementIsVisible(By.name("passFirst0"), maxSecond).sendKeys("lakshmi");
		Utility.waitForPageUntilElementIsVisible(By.name("passLast0"), maxSecond).sendKeys("korada");
		new Select(Utility.waitForPageUntilElementIsVisible(By.name("pass.0.meal"), maxSecond)).selectByVisibleText("Hindu");
		
		//Second passenger Details
		Utility.waitForPageUntilElementIsVisible(By.name("passFirst1"), maxSecond).sendKeys("viswanadham");
		Utility.waitForPageUntilElementIsVisible(By.name("passLast1"), maxSecond).sendKeys("korada");
		new Select(Utility.waitForPageUntilElementIsVisible(By.name("pass.1.meal"), maxSecond)).selectByVisibleText("Hindu");
		
		//Credit card Details
		new Select(Utility.waitForPageUntilElementIsVisible(By.name("creditCard"), maxSecond)).selectByIndex(1);
		Utility.waitForPageUntilElementIsVisible(By.name("creditnumber"), maxSecond).sendKeys("5765432111345");
		new Select(Utility.waitForPageUntilElementIsVisible(By.name("cc_exp_dt_mn"), maxSecond)).selectByIndex(4);
		new Select(Utility.waitForPageUntilElementIsVisible(By.name("cc_exp_dt_yr"), maxSecond)).selectByIndex(8);
		Utility.waitForPageUntilElementIsVisible(By.name("cc_frst_name"), maxSecond).sendKeys("hskdsdkj");
		Utility.waitForPageUntilElementIsVisible(By.name("cc_mid_name"), maxSecond).sendKeys("dhfsjksd");
		Utility.waitForPageUntilElementIsVisible(By.name("cc_last_name"), maxSecond).sendKeys("fghjkjh");
		
		//Submit click		
		Utility.waitForPageUntilElementIsVisible(By.name("buyFlights"), maxSecond).click();
		
		
	}

}
