import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductionThreadHandler implements Runnable {
    Departure departure = new Departure();
    DestinationFactory desFac;
    BaggageCheckIn checkIn;
    AirplaneFactory airplaneFac;
    BaggageSorting baggageSorting;
    PassengerFactory pf = new PassengerFactory();

    List<Destination> activeDestinations = new ArrayList<>(4);

    public ProductionThreadHandler() {

    }

    @Override
    public void run() {
        CreateActiveDestinations();

        Airplane airplane = PlaneWithDestination();
//        Creates Checkin/Terminal with destination
		CreateCheckIn(airplane.getDestination());
		CreateTerminal(airplane.getDestination());

        FillAirplane(airplane);
        Passenger pas = CheckinRandomPassengers();


        checkIn.ReceivePassenger(pas);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
			System.out.println(e);
        }

    }
//		Checks and fills the activeDestination list
    public void CreateActiveDestinations() {
        if (4 > activeDestinations.size()) {
            ActivateDestination();
        } else {
//            System.out.println("All possible checkin are open");
            try {
                Thread.sleep(10000);
            } catch (Exception e) {

            }
        }


    }
//	Get a random destiantion and add it to activeDestinations
    public void ActivateDestination() {
        desFac = new DestinationFactory();
        activeDestinations.add(desFac.Generate());

    }


    //	Creates new Airplane & set a destination
    public Airplane PlaneWithDestination() {
        airplaneFac = new AirplaneFactory();
        Random rnd = new Random();
        int desChooser = rnd.nextInt(activeDestinations.size());
        Airplane airplane = airplaneFac.GenerateAirplane();
        Destination destination = activeDestinations.get(desChooser);
		airplane.setDestination(destination);
        departure.RecieveAirplane(airplane);
        return airplane;
    }
//    Creates new Checkin
    public void CreateCheckIn(Destination des)
	{
		checkIn = new BaggageCheckIn(des);
	}
//	Creates new Terminal
	public void CreateTerminal(Destination des)
	{
		baggageSorting = new BaggageSorting(des);
	}
//		Fills planes with random amount of Passengers
    public void FillAirplane(Airplane airplane) {
        Random rnd = new Random();
        int passengerCount = rnd.nextInt(15);
        for (int i = 0; i < passengerCount; i++) {
            Passenger pass = pf.GenerateRandomPerson();
            airplane.manifest.passengers.add(pass);
        }
    }
//		get random passenger from one of the active planes to checkin
    public Passenger CheckinRandomPassengers() {
//		CAN I USE SAME RANDOM?

//		get random airplane
        Random rnd = new Random();
        int rndAirplane = rnd.nextInt(departure.airplanes.size());
        Airplane plane = departure.airplanes.get(rndAirplane);

//		get random passenger from Airplane
        int rndPassenger = rnd.nextInt(plane.manifest.passengers.size());
        Passenger passenger = plane.manifest.passengers.get(rndPassenger);
        return passenger;
    }
}
