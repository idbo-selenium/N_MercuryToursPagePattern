package keyboardAutomation.tests;

import mercury.main.Browser;
import keyboardAutomation.main.HomePage;
import keyboardAutomation.main.SeleniumWebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class KeyBoardTest {

	@Before
	public void Init(){
		Browser.Open();		
	}
	
	@After
	public void CleanUp(){
		//Browser.Close();
	}
	
	@Test
	public void Keys_Test() throws InterruptedException {
		HomePage.GoTo();
		SeleniumWebDriver.Search().Click();
		SeleniumWebDriver.Search().SelectOne();
		//SeleniumWebDriver.ChangingWindow();
		//Assert.assertTrue(SeleniumHomePage.IsAt());
		//SeleniumHomePage.Documentation().Click();		
	}
}
