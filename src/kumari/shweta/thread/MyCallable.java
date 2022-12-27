package kumari.shweta.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



import kumari.shweta.interface1;

public class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return Thread.currentThread().getName();
	}
	
public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Future<String>> list = new ArrayList<Future<String>>();
		Callable<String> callable = new MyCallable();
		for(int i =0;i<100;i++) {
			
			Future<String> future = executorService.submit(callable);
			//For cencelling task demo
	      ///future.cancel(true);
			//System.out.println("Is cancelled"+future.isCancelled());
			System.out.println("Is submited task completed ?"+future.isDone());
			list.add(future);
		}
		for(Future<String> future : list) {
			
			try {
				
				System.out.println(new Date()+ " :: "+future.get());
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		
		//Shutdown executor service now 
		
		executorService.shutdown();
	}
	

}
