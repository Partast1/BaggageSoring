import java.util.Random;

public class PassengerFactory {


	public Passenger GenerateRandomPerson() {
		PassengerGenerator people = new PassengerGenerator();
		BaggageFactory bf = new BaggageFactory();
		Passenger passenger = new Passenger(people.getRandomFirstName(), people.getRandomLastName());
		Baggage bag = bf.GenerateBaggage();

		passenger.luggage.add(bag);
		
		return passenger;
	}
}
