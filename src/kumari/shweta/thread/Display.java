package kumari.shweta.thread;



public class Display {
	
	public  synchronized void  displayn() {
		
		//synchronized(this) {
		for(int i =0;i<10;i++) {
			
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+i);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		//}
	}
	}
	public synchronized void displayc() {
		for(int i=65;i<70;i++) {
			try {
				Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+(char)i);
			} catch(Exception e) {
				
			}
		}
		
	}

}
