package kumari.shweta.thread.ThreadPOOL;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;



import kumari.shweta.interface1;




public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		
		//No of available core in JVM 
		
		int corecount=Runtime.getRuntime().availableProcessors();
		
		System.out.println("no of core available is "+corecount);
		
		//Order of execution of task does doesn't maintan 
	
	// ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		
	     //here we are creating 10 task and assing to thread pool where preintialized two threads are 
		//there which will pick task one by one  and execute 

	 /*
	   for(int i =0;i<10;i++) {
			Task task = new Task("Task"+i);
			System.out.println("Created :"+task.getName());
			executor.execute(task);
		} 
	*/	 
		
		 
		
		//Submit Task without creating task class which implement Runnable --by directly using lembda 
		//expression -->For cachedThreadPOOL
		//Sequence of task  execution maintain in chacedTHread pool
		//first task1 then task2 so on will execute
		
	    //Submit task in cached Threadpool
	/*
		ExecutorService executor1 = Executors.newCachedThreadPool();
		
		for(int i =1;i<=110;i++) {
			
			String name="Task"+i;
			System.out.println("Thread created"+name);
			Runnable r = () -> {
				 
				
				System.out.println("Tread executing "+name+"   "+Thread.currentThread().getName());
			};
			
			executor1.submit(r);
		
		}  
		
		*/
		
		

	
		
		//Here only one thread in thread pool so at a time only one task can execute
/*
	ExecutorService executorsigle =  Executors.newSingleThreadExecutor(); 
			for(int i =0;i<10;i++) {
				Task task = new Task("Task"+i);
				System.out.println("Created :"+task.getName());
				executorsigle.execute(task);
			}
			*/
		
			//Only one task will execute becoz only one thread available and it will execute after certain delay
			ExecutorService executeSchedule = Executors.newSingleThreadScheduledExecutor();
			for (int i=0;i<=110;i++) {
				Task task= new Task("Task"+i);
				executeSchedule.execute(task);
			}
			
	}
	

	


}
