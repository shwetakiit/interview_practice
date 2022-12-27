package kumari.shweta.java8featureSample;

/*class MyRunnable implements Runnable {     NORMAL APPROACH 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0;i<5;i++) {
			System.out.println("Child Thread");
		}
		
	}
	
	
}*/

public class LambdaExpressionWithThread {
	public static void main(String[] args) {
		

		Runnable r = () ->{    //Using lambda expression
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		
		for (int i =0;i<10;i++) {
			System.out.println("Main Thread");
		} 
		
		
	}
	
	
	


}
