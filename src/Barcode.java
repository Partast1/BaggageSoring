import java.time.LocalDateTime;

public class Barcode {

	private int code;
	private Passenger passenger;
	private LocalDateTime checkIn;
	public String destination;

	
	public Barcode(int Code, String Destination) {
		setCode(Code);
		destination = Destination;
		
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
	
}
