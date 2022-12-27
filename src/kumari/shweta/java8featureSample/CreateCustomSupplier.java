package kumari.shweta.java8featureSample;

import java.util.function.Supplier;



@FunctionalInterface
 interface CustomSupplier<String>{
	public String get();
	
}
class CustomSupplierImp implements CustomSupplier {
	
	String otp="";
	@Override
	public String get() {
		// TODO Auto-generated method stub
		for(int i =0;i<=6;i++) {
			otp=otp+(int)(Math.random()*10);
	}
		return otp;
	
}
}

public class CreateCustomSupplier {
	public static void main(String[] args) {
		
		//Tradational approach 
		CustomSupplier customSupplier = new CustomSupplierImp();
		System.out.println("Get otp with tradational approach "+customSupplier.get());
		
		//Using annonymous class for creating object of interface
		
		CustomSupplier<String> customSupplier2 = new CustomSupplier<String>() {

			@Override
			public String get() {

				String otp="";
				for(int i =0;i<6;i++) {
					otp=otp+(int)(Math.random()*10);
				}
				return otp;
				}
			};
			
System.out.println("Get otp with annonymous class of interface "+ customSupplier2.get());
  //Predefined Supplier functional interface 
		Supplier<String> supplier = () -> {
			String otp = "";
			for(int i =0;i<6;i++) {
				
				otp = otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println("Get otp with functional interface*** "+supplier.get());

	}

}
