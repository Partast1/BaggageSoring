import java.util.Random;

public class PassengerFactory {

//Generates randomized Passenger with baggage
	public Passenger GenerateRandomPerson()
	{
		PassengerGenerator people = new PassengerGenerator();
		BaggageFactory bf = new BaggageFactory();
		Passenger passenger = new Passenger(people.getRandomFirstName(), people.getRandomLastName());
		Baggage bag = bf.GenerateBaggage();
		bag.barcode.setPassenger(passenger);
		passenger.luggage.add(bag);
		
		return passenger;
	}
}
