import java.util.Random;

public class DestinationFactory {
    public String Generate(){
    DestinationGenerator destiantionGen = new DestinationGenerator();
        Random rnd = new Random();
        int rndNum = rnd.nextInt(0 - destiantionGen.destiantions.size());
        String destination = destiantionGen.destiantions.get(rndNum);
        return destination;
    }
}
