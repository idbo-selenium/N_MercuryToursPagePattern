package mercury.main;

public class LoggedIn {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Find a Flight: Mercury Tours:");
	}

}
