
public class Airplane {

	Manifest manifest;
	private int flightNumber;
	private Destination destination;
	
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


	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
}
