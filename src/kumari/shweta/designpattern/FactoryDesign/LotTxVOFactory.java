package kumari.shweta.designpattern.FactoryDesign;



public class LotTxVOFactory {
	
 String txType;
 public LotTx getLotTxVO(String txType) {
	 if(txType.equalsIgnoreCase("CreateLot")) {
		 return new CreateLotTxVO();
	 } else if(txType.equalsIgnoreCase("moveLot")) {
		 return new MoveLotTxVO();
	 } else if(txType.equalsIgnoreCase("StratLot")) {
		return new StartLotTxVO(); 
	 } else if(txType.equalsIgnoreCase("StatusUpdateLot")) {
		 return new StatusUpdateLotTxVO();
	 } 
	 return null;
 }
 

}
