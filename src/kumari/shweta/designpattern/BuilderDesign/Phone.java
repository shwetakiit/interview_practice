package kumari.shweta.designpattern.BuilderDesign;

//Constructor should be private and no setter method so that we can create object 
//only by Builder class 

public class Phone {
	
	private String os ;
	private	String processor;
	private int battery;
	private int camera;
	//Constructor should be private 
	public Phone(String os, String processor, int battery, int camera) {

		this.os = os;
		this.processor = processor;
		this.battery = battery;
		this.camera = camera;
	}
	public String getOs() {
		return os;
	}
	
	
	public void setOs(String os) {
		this.os = os;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public int getBattery() {
		return battery;
	}
	
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public int getCamera() {
		return camera;
	}
	
	
	public void setCamera(int camera) {
		this.camera = camera;
	}
	
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", battery=" + battery + ", camera=" + camera + "]";
	}
	
	

}
