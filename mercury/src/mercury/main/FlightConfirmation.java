package mercury.main;

public class FlightConfirmation {

	public boolean IsAt() {
		// TODO Auto-generated method stub
		return Browser.Driver().getTitle().equals("Flight Confirmation: Mercury Tours");
	}

}
