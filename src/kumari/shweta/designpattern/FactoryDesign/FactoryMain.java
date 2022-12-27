package kumari.shweta.designpattern.FactoryDesign;

public class FactoryMain {
	public static void main(String[] args) {
		
		LotTxVOFactory objFactory= new LotTxVOFactory();
		
		LotTx lotTx = objFactory.getLotTxVO("moveLot");
		lotTx.spec();
	}

}
