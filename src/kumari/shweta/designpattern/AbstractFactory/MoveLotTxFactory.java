package kumari.shweta.designpattern.AbstractFactory;

public class MoveLotTxFactory implements TransactionAbstractFactory{

	@Override
	public LotTx getLotTxVO() {
		
		return new MoveLotTxVO();
	}

}
