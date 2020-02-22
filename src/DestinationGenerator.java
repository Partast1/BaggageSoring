import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DestinationGenerator {
    List<String> destinations;

public  DestinationGenerator(){
    destinations = new ArrayList<>();
    destinations.add("Copenhagen");
    destinations.add("Dubai");
    destinations.add("Berlin");
    destinations.add("Stockholm");
    destinations.add("Oslo");
    destinations.add("London");
}
    public String getRandomDestination() {
        Random rnd = new Random();
        String des = destinations.get(rnd.nextInt(destinations.size()));
        return des;
    }
}
