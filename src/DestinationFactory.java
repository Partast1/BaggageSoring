import java.util.Random;

public class DestinationFactory {
    public Destination Generate(){

    DestinationGenerator destinationGen = new DestinationGenerator();

        Destination destination = new Destination(destinationGen.getRandomDestination());

        return destination;
    }
}

