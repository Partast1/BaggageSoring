import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BaggageSorting {

	public BlockingQueue<Baggage> baggageQueue = new ArrayBlockingQueue<>(8);
	public int currentSize = baggageQueue.size();

	public void Receive(Baggage bag)
	{
		baggageQueue.add(bag);
		for (Baggage baggage: baggageQueue)
		{
			System.out.println(baggage.barcode.getDestination().getPlace());
		}
//		bag.barcode
	}
}
