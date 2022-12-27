package kumari.shweta.designpattern.AbstractFactory;

public class StatusUpdateLotTxFactory implements TransactionAbstractFactory{

	@Override
	public LotTx getLotTxVO() {
		
		return new StatusUpdateLotTxVO();
	}

}
