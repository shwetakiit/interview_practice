package kumari.shweta.thread;

public class MyThread2 extends Thread{
	
	Display display;
	MyThread2(Display d) {
		
		this.display=d;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		display.displayn();
		display.displayc();
	}

}
