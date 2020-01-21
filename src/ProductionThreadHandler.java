
public class ProductionThreadHandler extends Thread {

	
		Departure departure = new Departure();
		BaggageCheckIn checkIn = new BaggageCheckIn();
	@Override
	public void run() {
		AirplaneFactory airplaneFac = new AirplaneFactory();
		Airplane airplane = airplaneFac.GenerateAirplane();
		departure.RecieveAirplane(airplane);
		
		
		PassengerFactory pf = new PassengerFactory();
		for (int i = 0; i < 4; i++) {
			Passenger pass = pf.Generate();
			airplane.manifest.passengers.add(pass);
			checkIn.Recieve(pass);		
	}
		
//		Samme flightnumbers og passengers bliver genereret
//		for (int i = 0; i < 4; i++) {
//
//			System.out.print("airplane " + i + ": " + airplane.getFlightNumber() + " Manifest size:" );
//
//			 for(Passenger pass : airplane.manifest.passengers) {
//		            System.out.println(pass.getFirstName() + " " + pass.getLastName()  );
////		            for statement doesn't work
////		            Casting barcode to int
//		            for (Baggage baggage : pass.luggage){
////		            	Barcode intcode = (int) baggage.barcode.getCode();
//					System.out.print(baggage.barcode.getCode());
//						
//					}
//		        }
//		}

}
}
