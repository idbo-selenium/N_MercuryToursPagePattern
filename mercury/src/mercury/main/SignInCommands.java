package mercury.main;

import org.openqa.selenium.By;

import utility.Utility;

public class SignInCommands {
	
	public String username;
	public String password;
	int maxSecond = 5000;
	
	public SignInCommands(String username){
		this.username = username;
	}
	public SignInCommands WithPassword(String password ){
		this.password = password;
		return this;
	}
	
	public void Login() {
		//Find username and put username
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"), maxSecond).sendKeys(username);
		// Find password and put password
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"), maxSecond).sendKeys(password);
		// find sign in button and click
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"), maxSecond).click();
		
	}

}
