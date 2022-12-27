package kumari.shweta.java8featureSample;



interface LambdaInterface{
	public void m1();
}

public class LambdaExpressionPOC {
	
	public static void main(String[] args) {
		LambdaInterface interf=()->System.out.println("Hello...");
		interf.m1();
	}

	

}
