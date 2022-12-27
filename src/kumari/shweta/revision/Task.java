package kumari.shweta.revision;

public class Task implements Runnable{
	String nameString;
	
	Task(String name){
		this.nameString=name;
	}

	@Override
	public void run() {
		System.out.println("Thread created "+nameString+" and thread is "+Thread.currentThread().getName());
		
	}
	
	public String getNameString() {
		return nameString;
	}

}
