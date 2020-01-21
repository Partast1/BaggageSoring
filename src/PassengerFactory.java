import java.util.Random;

public class PassengerFactory {


	public Passenger Generate() {
		PassengerGenerator people = new PassengerGenerator();
		BaggageFactory bf = new BaggageFactory();
		Passenger passenger = new Passenger(people.getFirstName(), people.getLastName());
		Baggage bag = bf.GenerateBaggage();
		
		passenger.luggage.add(bag);
		
		return passenger;
	}
}
