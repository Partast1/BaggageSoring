import java.time.LocalDateTime;

public class Barcode {

	private int code;
	private Passenger passenger;
	private LocalDateTime checkIn;
	private Destination destination;

	
	public Barcode(int Code) {
		setCode(Code);

		
	}

	
	public int getCode()
	{
		return code;
	}
	public void setCode(int code)
	{
		this.code = code;
	}
	
	public String toString() {
		return getCode() + "";
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
}
