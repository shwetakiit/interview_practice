package kumari.shweta.thread;
//Join method in Java allows one thread to wait until another thread completes its execution
//https://www.edureka.co/blog/join-method-java


class Thread3 implements Runnable 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++) 
		System.out.println("Child thread");
		
	}
	
	
}
public class ThreadJoinDemo {
	
public static void main(String[] args) {
	
	Thread3 thread1 = new Thread3();
	Thread t1 = new Thread(thread1);
	t1.start();
    try {
		t1.join(); //First checild will complete then main thread execute join() wating for t1 to complete 
		//execution
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i =0;i<=10;i++) {
		System.out.println("Main thread");
	}
	
}

}
