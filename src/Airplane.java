
public class Airplane {

	Manifest manifest;
	private int flightNumber;
	private String destination;
	
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


	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}
