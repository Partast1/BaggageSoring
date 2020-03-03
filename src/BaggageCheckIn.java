import java.util.Iterator;

public class BaggageCheckIn {

	
	BaggageSorting sorting = new BaggageSorting();
	Destination destination;

	public BaggageCheckIn(Destination des){
		destination = des;
	}
	public void ReceivePassenger(Passenger pass)
	{
		
//		System.out.print("BaggageCheckIn");
//		System.out.print("Available room in array: "+ sorting.baggageQueue.remainingCapacity() + "Array max length" + sorting.baggageQueue.size());
		if (sorting.baggageQueue.size() <= sorting.baggageQueue.remainingCapacity() )
		{
			
			for (Baggage bag : pass.luggage)
			{
				sorting.Receive(bag);

			}
		}

	}

}
