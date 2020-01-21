
public class AirplaneFactory {

	FlightNumberGenerator fng = new FlightNumberGenerator();
	Manifest mf = new Manifest();
	
//	Generates an airplane and returns it
	public Airplane GenerateAirplane() {
		

		Airplane airplane = new Airplane(fng.getRandomNumber(), mf);
		return airplane;
	}

}
