package kumari.shweta.thread;

public class MyThread1 extends Thread{
	Display display;

	


	public MyThread1(Display display2) {
		
		this.display=display2;
		
	}

	public void run() {
		
		display.displayn();
		display.displayc();
		
		
	}

}
