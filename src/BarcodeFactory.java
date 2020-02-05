

public class BarcodeFactory {

	BarcodeGenerator barcodeGen = new BarcodeGenerator();
	
	public Barcode GenerateBarcode() {

		
		Barcode barcode; 
		barcode = new Barcode(barcodeGen.GetBarcode());

		return barcode;
	}
}
