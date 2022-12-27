package kumari.shweta.thread;


class Thread1 extends Thread{
	
	public void star() {
		super.start();
		System.out.println("Start method ");
	}
	public void run() {
		System.out.println("Run method");
	}
}
public class ThreadStart {

	
	public static void main(String[] args) {
		System.out.println("Main thread ");
		Thread1 thread1= new Thread1();
		thread1.star();//This start() method will work as normal method 
		
		
	}
}
