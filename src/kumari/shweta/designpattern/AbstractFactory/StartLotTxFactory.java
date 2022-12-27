package kumari.shweta.designpattern.AbstractFactory;

public class StartLotTxFactory implements TransactionAbstractFactory {

	@Override
	public LotTx getLotTxVO() {
		// TODO Auto-generated method stub
		return new StartLotTxVO();
	}

}
