package keyboard.test;

import mercury.main.HomePage;
import mercury.main.Browser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MercurySiteTest {

	@Before
	public void Init(){
		Browser.Open();	
	}
	
	@After
	public void Cleanup(){
		//Browser.Close();
	}
	
	@Test
	public void MercuryKeyBoard() throws InterruptedException {
		HomePage.GoTo();
		HomePage.MercurySignin().Click();
	}
	
}
