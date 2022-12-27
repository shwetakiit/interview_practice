package kumari.shweta.designpattern.AbstractFactory;


public class LotTxVOFactory {
	
	public static LotTx getLotTxVO(TransactionAbstractFactory factory) {
	return	 factory.getLotTxVO();
	}

}
