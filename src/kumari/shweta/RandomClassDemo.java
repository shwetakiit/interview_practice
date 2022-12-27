package kumari.shweta;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomClassDemo {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		
		boolean flag=false;
		if(flag=true) {
			System.out.println("hellp");
		} else {
			System.out.println("Hi");
		}
		
		
	int i=random.nextInt(10); //it will generate random number between inclusive 0 and exclusive 10
System.out.println(i);
int j = random.nextInt(); //random any no in integer range
System.out.println(j);
	
	}

}
