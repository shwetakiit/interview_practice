package kumari.shweta.clone;

public class Address {
	private String name;
	/**
	 * @param name
	 */
	public Address(Address address) {
		
		this.name = address.name;
	}

	public Address(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
