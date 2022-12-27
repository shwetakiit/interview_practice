package kumari.shweta.revision;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import kumari.shweta.interface1;

public class ExecutorServiceDemo {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i =1;i<20;i++) {
			Task task = new Task("Task"+i);
			executorService.execute(task);
		}
	}

}
