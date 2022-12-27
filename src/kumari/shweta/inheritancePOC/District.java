package kumari.shweta.inheritancePOC;

public class District extends State {
	
	private String districtName;
	private String distrctCode;
	
	public District(String stateName, String stateCode, String stateCountry, String districtName, String distrctCode) {
		
		this.districtName = districtName;
		this.distrctCode = distrctCode;
	}
	
   
}
