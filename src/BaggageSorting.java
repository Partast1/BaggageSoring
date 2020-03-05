import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BaggageSorting {

	public BlockingQueue<Baggage> baggageQueue = new ArrayBlockingQueue<>(8);
	public int currentSize = baggageQueue.size();
	Destination destination;

	public BaggageSorting(Destination des){
		destination = des;
	}

	public void Receive(Baggage bag)
	{
		if (destination.getPlace() == bag.barcode.getDestination().getPlace()){
			baggageQueue.add(bag);
			System.out.println("Final Step!!!!!!!!!!");
			System.out.println("Passenger: " + bag.barcode.getPassenger() + bag.barcode.getCode());
		}
		else{
			System.out.println("Invalid destination ????");
		}


//		for (Baggage baggage: baggageQueue)
//		{
//			System.out.println(baggage.barcode.getDestination().getPlace());
//		}

	}
}
