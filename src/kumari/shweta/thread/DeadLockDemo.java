package kumari.shweta.thread;


public class DeadLockDemo {
	
	public static void main(String[] args) {
		
		String firstName = "Shweta";
		String secondName = "Kumari";
		
		Runnable r1 = () ->
		{
			
			synchronized (firstName) {
				
				
				System.out.println("Thread 1 called firstName "+firstName);
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				
			}	
			synchronized (secondName) {
				
				System.out.println("Thread1 calss second name "+secondName);
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			
		};
		//Use thread sleep to see dead loack other wise 4 output can be seen 
		//after giving some thread sleep only two out put 
		Runnable r2 = () ->{
			
			synchronized (firstName) {
				System.out.println("Thread 2 called firstName"+firstName);
				
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			synchronized (secondName) {
				
				System.out.println("Thread 2 called secondName"+secondName);
				
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		
		Thread t1= new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		
		
		
	}

}
