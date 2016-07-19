package mercury.testCases;


import mercury.main.Browser;
import mercury.main.HomePage;
import mercury.main.SelectFlight;
import mercury.main.SignInPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class IsAtHomePage {
	
	WebDriver driver ;
	@Before
	public void Init(){		
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		//Browser.Close();
	}
	
	@Test
	public void UserLogin(){
		HomePage.GoTo();
		HomePage.Header().SelectSignIn();
		SignInPage.LoginAs("rama1").WithPassword("pass@word1").Login();
		SelectFlight.EnterDetails();
	}
	
}
