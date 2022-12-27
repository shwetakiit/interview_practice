package kumari.shweta.designpattern.AbstractFactory;

public class TranscationClient {
	public static void main(String[] args) {
		
		LotTx tx=LotTxVOFactory.getLotTxVO(new CreateLotTxFactory());
		tx.spec();
	}

}
