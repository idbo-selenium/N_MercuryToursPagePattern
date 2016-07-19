package mercury.testCases;

import mercury.main.Browser;
import mercury.main.HomePage;
import mercury.main.Registration;
import mercury.main.SelectFlight;
import mercury.main.SignInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewUserRegistrartion {
	
	WebDriver driver ;
	@Before
	public void Init(){		
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		Browser.Close();
	}
	
	@Test
	public void Login_Register(){	
		
		HomePage.GoTo();
		Assert.assertTrue(HomePage.IsAtHomePage());
		HomePage.Header().ClickRegister();
		Assert.assertTrue(HomePage.IsAtRegisterPage());
		Registration.UserDetails().Submit();
		Assert.assertTrue(HomePage.LoginPage().IsAt());
		SignInPage.LoginAs("rama1").WithPassword("pass@word1").Login();
		Assert.assertTrue(HomePage.LoggedIn().IsAt());
		SelectFlight.EnterDetails().Submit();
		Assert.assertTrue(HomePage.BookFlight().IsAt());
		SelectFlight.EnterDetails().BookFlight().Submit();
		Assert.assertTrue(HomePage.FlightConfirmation().IsAt());
		HomePage.LogOut().Click();
		Assert.assertTrue(HomePage.LoginPage().IsAt()); 
	}
	
}
