package kumari.shweta.thread;



public class ClassLevelSynchronizationDemo {
	
	public static void main(String[] args) {
		
		Display1 display1 = new Display1();
		Runnable task1 = () ->display1.Display();
		
		Runnable task2 = () -> display1.Display();
		Thread t1 = new Thread(task1,"Thread1");
		Thread t2 = new Thread(task2,"Thread2");
		
		t1.start();
		t2.start();
		
		
	}

}
