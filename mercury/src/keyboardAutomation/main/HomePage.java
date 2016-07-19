package keyboardAutomation.main;

import mercury.main.Browser;

public class HomePage {

	public static String baseURL = "https://www.google.co.in/";
	public static void GoTo() {
		Browser.driver.navigate().to(baseURL);
	}
	
}
