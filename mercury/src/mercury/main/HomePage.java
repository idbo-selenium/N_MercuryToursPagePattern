package mercury.main;

import keyboard.main.MercurySignin;

public class HomePage {

	public static String baseURL = "http://newtours.demoaut.com/";
	public static String homeTitle = "Welcome: Mercury Tours";
	public static String registerPageTitle = "Register: Mercury Tours";
	
	public static void GoTo() {
		Browser.driver.navigate().to(baseURL);
	}
	
	public static boolean IsAtHomePage() {
		 return Browser.driver.getTitle().equals(homeTitle);
	}

	public static HeaderPage Header() {
		// TODO Auto-generated method stub
		return new HeaderPage();
	}
	
	public static boolean IsAtRegisterPage(){
		return Browser.driver.getTitle().equals(registerPageTitle);
	}

	public static UserDetails LoginPage() {		
		return new UserDetails();
	}

	public static LoggedIn LoggedIn() {
		// TODO Auto-generated method stub
		return new LoggedIn();
	}

	public static BookFlight BookFlight() {
		return new BookFlight();
	}

	public static FlightConfirmation FlightConfirmation() {
		// TODO Auto-generated method stub
		return new FlightConfirmation();
	}

	public static LogOutClick LogOut() {
		// TODO Auto-generated method stub
		return new LogOutClick();
	}

	public static MercurySignin MercurySignin() {
		// TODO Auto-generated method stub
		return new MercurySignin();
	}
	
}
