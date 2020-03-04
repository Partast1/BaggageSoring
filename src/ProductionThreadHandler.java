import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductionThreadHandler implements Runnable
{
		Departure departure = new Departure();
		DestinationFactory desFac;
		BaggageCheckIn checkIn;
		AirplaneFactory airplaneFac;
		PassengerFactory pf = new PassengerFactory();

		List<Destination> activeDestinations = new ArrayList<>(4);
		public ProductionThreadHandler(){

		}
	@Override
	public void run()
	{
		if (5 > activeDestinations.size())
		{
			ActivateDestination();
		}
		else{
			System.out.println("All possible checkin are open");
		}

		for (Destination des: activeDestinations)
		{
			System.out.println(des.getPlace());
		}
		Airplane airplane = PlaneWithDestination();
		FillAirplane(airplane);

	}

	public void ActivateDestination() {
		 desFac = new DestinationFactory();
		activeDestinations.add(desFac.Generate());

	}


//	Return plane with actice destination
	public Airplane PlaneWithDestination()
	{
		airplaneFac = new AirplaneFactory();
		Random rnd = new Random();
		int desChooser = rnd.nextInt(activeDestinations.size());
		Airplane airplane = airplaneFac.GenerateAirplane();
		Destination destination = activeDestinations.get(desChooser);
		System.out.println(destination.getPlace());
//		airplane.setDestination(destination);
		departure.RecieveAirplane(airplane);
		checkIn = new BaggageCheckIn(destination);
		return airplane;
	}
	public void FillAirplane(Airplane airplane)
	{
		Random rnd = new Random();
		int passengerCount = rnd.nextInt(15);
		for (int i = 0; i < passengerCount; i++)
		{
			Passenger pass = pf.GenerateRandomPerson();
			airplane.manifest.passengers.add(pass);
//			checkIn.ReceivePassenger(pass);
		}

	}
}
