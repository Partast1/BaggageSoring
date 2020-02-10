import java.util.Random;

public class DestinationFactory {
    public String Generate(){
    DestinationGenerator destinationGen = new DestinationGenerator();
        Random rnd = new Random();
        String destination = destinationGen.getRandomDestination();
        return destination;
    }
}

