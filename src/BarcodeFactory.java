

public class BarcodeFactory {

	BarcodeSerialGenerator barcodeGen = new BarcodeSerialGenerator();
	
	public Barcode GenerateBarcode() {

		
		Barcode barcode; 
		barcode = new Barcode(barcodeGen.GetBarcode(), );

		return barcode;
	}
}
