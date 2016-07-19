package keyboard.main;

import mercury.main.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Utility;

public class MercurySignin {

	int numbers=8;
	public void Click() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Actions keyactions = new Actions(Browser.driver);
		
		//for searching sign on button
		for(int i=0 ; i <8 ; i++){
			keyactions.sendKeys(Keys.TAB).build().perform();		
		}
		keyactions.sendKeys(Keys.ENTER).build().perform();
		//for searching username textbox  
		for(int i=0 ; i <13 ; i++){
			keyactions.sendKeys(Keys.TAB).build().perform();		
		}
		keyactions.sendKeys("rama1");
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys("pass@word1");
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.ENTER).build().perform();
		
		//for details giving
		for(int i=0 ; i <14 ; i++){
			keyactions.sendKeys(Keys.TAB).build().perform();		
		}
		keyactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.ARROW_UP).build().perform();
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.ARROW_UP).build().perform();		
		for(int i=0 ; i <5 ; i++){
			keyactions.sendKeys(Keys.TAB).build().perform();	
		}
		keyactions.sendKeys(Keys.ENTER).build().perform();
		
		//for selecting flight
		for(int i=0 ; i <14 ; i++){
			keyactions.sendKeys(Keys.TAB).build().perform();
		}
		keyactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		keyactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.ENTER).build().perform();	
		
		for(int i=0 ; i <14 ; i++){
			keyactions.sendKeys(Keys.TAB).build().perform();
		}
		keyactions.sendKeys("rama");
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys("rama");
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys("rama");
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys("rama");
		keyactions.sendKeys(Keys.TAB).build().perform();
		keyactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		for(int i=0 ; i <22 ; i++){
			keyactions.sendKeys(Keys.TAB).build().perform();
		}
		keyactions.sendKeys(Keys.ENTER).build().perform();	
		
		for(int i=0 ; i <14 ; i++){
			keyactions.sendKeys(Keys.TAB).build().perform();
		}
		keyactions.sendKeys(Keys.ENTER).build().perform();	
	}

}
