package Webdriver_actions;

import mercury.main.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Keysautomation {
	WebDriver driver;
	
	@BeforeTest	
	public void openup(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.manage().window().maximize();		
	}
	
	public void Tc1(){
		driver.findElement(By.name("q")).sendKeys("selenium webdriver automation");
		Actions keyactions = new Actions(Browser.driver);
		keyactions.sendKeys(Keys.DOWN).build().perform();
		keyactions.sendKeys(Keys.ENTER).build().perform();		
	}
}