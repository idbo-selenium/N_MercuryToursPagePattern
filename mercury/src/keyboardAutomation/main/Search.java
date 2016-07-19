package keyboardAutomation.main;

import mercury.main.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Utility;

public class Search {

	public int maxSecond = 5000;
	public void Click() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.name("q"), maxSecond).sendKeys("selenium webdriver automation");
	}
	public void SelectOne() throws InterruptedException {
		// TODO Auto-generated method stub
		Actions keyactions = new Actions(Browser.driver);
		
		keyactions.sendKeys(Keys.DOWN).build().perform();
		
		keyactions.sendKeys(Keys.DOWN).build().perform();
		
		keyactions.sendKeys(Keys.ENTER).build().perform();
		
		WebElement webLink = Utility.waitForPageUntilElementIsVisible(By.linkText("Introduction — Selenium Documentation"), 5000);
		
		keyactions.contextClick(webLink).build().perform();
		
		keyactions.sendKeys(Keys.DOWN).build().perform();
		
		keyactions.sendKeys(Keys.ENTER).build().perform();		
		
		keyactions.sendKeys(Keys.CONTROL, Keys.TAB).build().perform();
		
//		Browser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);			
//		String selectAll = Keys.chord(Keys.CONTROL, "W");
//		Browser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
//		keyactions.sendKeys(selectAll).build().perform();
//		Browser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		keyactions.sendKeys(Keys.CONTROL,"w").build().perform();
	}
}