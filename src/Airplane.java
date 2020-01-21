
public class Airplane {

	Manifest manifest;
	private int flightNumber;
	
	public Airplane(int FlightNumb, Manifest mf) {
		setFlightNumber(FlightNumb);
		manifest = mf;
		
	}
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	
	
	
}
