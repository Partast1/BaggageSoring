import java.util.ArrayList;

public class Departure {


	public ArrayList<Airplane> airplanes = new ArrayList<>();

	 
	 public void RecieveAirplane(Airplane plane)
	 {
		 airplanes.add(plane);
	 }
//	 public void toString(){
//		 for (Airplane plane: airplanes)
//		 {
//			System.out.print(plane.manifest);
//		 }
//	 }
}
