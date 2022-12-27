package kumari.shweta.designpattern.AbstractFactory;

public class CreateLotTxFactory implements TransactionAbstractFactory{

	@Override
	public LotTx getLotTxVO() {
		
		return new CreateLotTxVO();
	}

}
