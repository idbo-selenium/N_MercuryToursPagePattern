package mercury.main;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utility.Utility;

public class UserDetails {
	
	static int maxSecond =5000;

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Sign-on: Mercury Tours");
	}

	public void Submit() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"), maxSecond).sendKeys("krishna");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"), maxSecond).sendKeys("potnuru");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"), maxSecond).sendKeys("09876543298");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/input"), maxSecond).sendKeys("fjle@lkf.hjf");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"), maxSecond).sendKeys("Ameerpet");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"), maxSecond).sendKeys("Hyderabad");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"), maxSecond).sendKeys("Telangana");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"), maxSecond).sendKeys("500016");
		new Select(Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"), maxSecond)).selectByVisibleText("INDIA");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"), maxSecond).sendKeys("krishna");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"), maxSecond).sendKeys("pass@word1");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"), maxSecond).sendKeys("pass@word1");
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"), maxSecond).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]"), maxSecond).click();
	}
	

}
