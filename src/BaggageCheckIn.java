import java.util.Iterator;

public class BaggageCheckIn {

	BaggageSorting sorting;
	Destination destination;

	public BaggageCheckIn(Destination des)
	{
		destination = des;
		System.out.println("A checkin have been opened for destination" + destination.getPlace());
	}
	public void ReceivePassenger(Passenger pass)
	{
		if (sorting.baggageQueue.size() <= sorting.baggageQueue.remainingCapacity() )
		{
			
			for (Baggage bag : pass.luggage)
			{
				sorting.Receive(bag);
			}
		}
	}


}
