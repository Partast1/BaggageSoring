
public class ProductionThreadHandler extends Thread {
		Departure departure = new Departure();
		BaggageCheckIn checkIn = new BaggageCheckIn();
		AirplaneFactory airplaneFac = new AirplaneFactory();
		PassengerFactory pf = new PassengerFactory();
	@Override
	public void run()
	{

		Airplane airplane = airplaneFac.GenerateAirplane();

//		System.out.print("Airplane created" + airplane.getDestination());

		departure.RecieveAirplane(airplane);
		
		

		for (int i = 0; i < 4; i++) {
			Passenger pass = pf.GenerateRandomPerson();
			airplane.manifest.passengers.add(pass);
			checkIn.RecievePassenger(pass);
	}
		for (Passenger pass: airplane.manifest.passengers)
		{
			System.out.print(" " + pass.getFirstName());

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
