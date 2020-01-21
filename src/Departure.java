import java.util.ArrayList;

public class Departure {

	
	public ArrayList<Airplane> airplanes = new ArrayList<>();

	 
	 public void RecieveAirplane(Airplane plane) {
		 airplanes.add(plane);
	 }
}
