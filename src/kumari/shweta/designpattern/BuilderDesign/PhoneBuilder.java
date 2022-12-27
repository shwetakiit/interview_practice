package kumari.shweta.designpattern.BuilderDesign;
public class PhoneBuilder {
	
	private String os ;
	private	String processor;
	private int battery;
	private int camera;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	public PhoneBuilder() {
		}
	
	public Phone getPhone() {
		
		return new Phone(os,processor,battery,camera);
	}
	@Override
	public String toString() {
		return "PhoneBuilder [os=" + os + ", processor=" + processor + ", battery=" + battery + ", camera=" + camera
				+ "]";
	}
}
