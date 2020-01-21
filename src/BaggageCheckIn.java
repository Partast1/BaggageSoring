import java.util.Iterator;

public class BaggageCheckIn {

	
	BaggageSorting sorting = new BaggageSorting();
	public void Recieve(Passenger pass) 
	{
		
		System.out.print("BaggageCheckIn");
		System.out.print("Current array size: "+ sorting.baggageQueue.remainingCapacity() + "Array max length" + sorting.baggageQueue.size());
		if (sorting.baggageQueue.size() <= sorting.baggageQueue.remainingCapacity() ) {
			
			for (Baggage bag : pass.luggage) {
				sorting.Receive(bag);
		}
		}

	}

}
