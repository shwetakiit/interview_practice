package kumari.shweta.thread.ThreadPOOL;

import kumari.shweta.interface1;

public class TaskForCachedThreadPool implements Runnable{
	
	public static int nth=0;
	private final int id=++nth;
	private final int number;
	private String threadname;
	
	TaskForCachedThreadPool(int number,String name) {
		this.number = number;
		threadname=name;
		
	}
	
	public void run() {
		System.out.println("Starting counter "+id);
		
		for(int i =0;i<number;i++) {
			
			try {
				 MILLISECONDS.sleep(300);
			}catch (InterruptedException e) {
				// TODO: handle exception
				
				
			}
			System.out.println("counter %d value %d\n",id,i);
			
			
			 
			
		}
		  System.out.println("Finishing counter: " + id);
	
		
	}

}
