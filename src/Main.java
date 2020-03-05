import java.util.Iterator;
public class Main {
	


	public static void main(String[] args) {
		ProductionThreadHandler handle = new ProductionThreadHandler();

		while (true){
			new Thread(handle).start();

		}

		
		}

	}


