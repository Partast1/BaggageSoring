import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductionThreadHandler extends Thread {
		Departure departure = new Departure();
		DestinationFactory desFac = new DestinationFactory();
		BaggageCheckIn checkIn = new BaggageCheckIn(desFac.Generate());
		AirplaneFactory airplaneFac = new AirplaneFactory();
		PassengerFactory pf = new PassengerFactory();

		List<Destination> activeDestinations = new ArrayList<>();
	@Override
	public void run()
	{
		if (3 > activeDestinations.size())
		{
			ActivateDestination();
		}

		Airplane airplane = PlaneWithDestination();


		for (int i = 0; i < 4; i++)
		{
			Passenger pass = pf.GenerateRandomPerson();
			airplane.manifest.passengers.add(pass);
			checkIn.ReceivePassenger(pass);
		}
		for (Passenger pass: airplane.manifest.passengers)
		{
			System.out.print(" " + pass.getFirstName());

		}
	}

	public void ActivateDestination() {
		activeDestinations.add(desFac.Generate());
		PlaneWithDestination();
	}


//	Return plane with actice destination
	public Airplane PlaneWithDestination(){
		Random rnd = new Random();
		int desChooser = rnd.nextInt(activeDestinations.size());
		Airplane airplane = airplaneFac.GenerateAirplane();
		airplane.setDestination(activeDestinations.get(desChooser));
		departure.RecieveAirplane(airplane);
		return airplane;
	}
}
