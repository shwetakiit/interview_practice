package kumari.shweta.thread;

public class SynchronizationDemo {
	
	public static void main(String[] args) {
		Display display = new Display();
		//Display display=null; //Null pointer exception if while execution synchronized method block
		 MyThread1  thread1 = new MyThread1(display);
		 Thread t1= new Thread (thread1,"Thread1");
		 t1.start();
		 MyThread2 thread2 = new MyThread2(display);
		 
		 Thread t2 = new Thread(thread2,"Thread2");
		 t2.start();

		 
		 
		 
		 
		
	}

}
