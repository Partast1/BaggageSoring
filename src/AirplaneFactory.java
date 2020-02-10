
public class AirplaneFactory {

	FlightNumberGenerator fng = new FlightNumberGenerator();
	DestinationFactory desFac = new DestinationFactory();
	Manifest mf = new Manifest();
	
//	Generates an airplane and returns it
	public Airplane GenerateAirplane() {
		
		String des = desFac.Generate();
		Airplane airplane = new Airplane(fng.getRandomNumber(), mf, des);
		return airplane;
	}

}
