package mercury.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utility.Utility;

public class EnterDetails {

	static int maxSecond =5000;
	public void Submit() {
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"), maxSecond).click();
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select"), maxSecond)).selectByIndex(1);		
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"), maxSecond)).selectByIndex(4);
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]"), maxSecond)).selectByIndex(4);
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]"), maxSecond)).selectByIndex(6);
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);		
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select"), maxSecond)).selectByIndex(7);
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);	
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]"), maxSecond)).selectByIndex(10);
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]"), maxSecond)).selectByIndex(10);		
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"), maxSecond).click();
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select"), maxSecond)).selectByIndex(2);
		Browser.Driver().manage().timeouts().implicitlyWait( 8, TimeUnit.SECONDS);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"), maxSecond).click();
		//Browser.driver.navigate().back();	
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]"), maxSecond).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input"), maxSecond).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input"), maxSecond).click();	
		
	}
	public BookFlight BookFlight() {
		// TODO Auto-generated method stub
		return new BookFlight();
	}
	

}
