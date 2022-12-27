package kumari.sweta.Collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import kumari.shweta.interface1;

public class BlockingQueueDemo {
	
	public static void main(String[] args) {
		
		
		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(4);
		
	/*	for(int i =0;i<4;i++) {
			System.out.println(blockingQueue.add(i));//add method will throw exception if it cross capacity
		}
		
		System.out.println(blockingQueue);
		*/
		//Offer method doesn't throw exception if cross capacity
		
		for(int j=10;j<15;j++) { 
			
			System.out.println(blockingQueue.offer(j)); //After capacity it will not add more element but it will 
			//not throw exception  of queue full  here o/p 10,11,12,13
		}
		System.out.println(blockingQueue);
		
		//blockingQueue.remove();
		System.out.println("Removed element is "+blockingQueue.remove());
		
	}
	



}
