

public class BarcodeFactory {

	
	
	public Barcode GenerateBarcode() {
		BarcodeGenerator barcodeGen = new BarcodeGenerator();
		
		Barcode barcode; 
		barcode = new Barcode(barcodeGen.GetBarcode());
		
//		System.out.print(barcode.toString());
		return barcode;
	}
}
