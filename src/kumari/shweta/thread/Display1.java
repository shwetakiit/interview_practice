package kumari.shweta.thread;

import kumari.shweta.interface1;

public class Display1 {
	
	
	///public static synchronized void   Display() -- Class level lock on method
	public static  void   Display() {
		// TODO Auto-generated constructor stub
		
		
		synchronized (Display1.class) {
			
			for(int i =0;i<10;i++) {
				
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+" "+i);
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Exception occured while thread is sleep");
				}
				
			}
			
		}
		
		
	}
	
	

}
