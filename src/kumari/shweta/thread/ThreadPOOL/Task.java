package kumari.shweta.thread.ThreadPOOL;

public class Task implements Runnable {
	
	private String name;
	
	public Task(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		
		try {
			System.out.println("Thread executing"+name+"   "+Thread.currentThread().getName());
		   Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return name;
	}
	
}
