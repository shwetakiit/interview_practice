package kumari.shweta.designpattern.BuilderDesign;



public class BuilderShop {

	public static void main(String[] args) {
	   PhoneBuilder phoneBuilder = new PhoneBuilder().setBattery(3000).setCamera(25).setOs("Windows");
	
       Phone phone=phoneBuilder.getPhone();
       System.out.println(phone.toString());
	}
}
