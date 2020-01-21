import java.util.ArrayList;
import java.util.List;

public class Passenger {
	private String firstName;
	private String lastName;
	private String address;
	List<Baggage> luggage;
	
	public Passenger(String first, String last) {
		luggage = new ArrayList<Baggage>();
		setFirstName(first);
		setLastName(last);
//		setAddress(add);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
