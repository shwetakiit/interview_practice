package kumari.shweta.java8featureSample;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImp implements Consumer<Integer> {
   @Override
	public void accept(Integer t) {
		System.out.println("Hello "+t);
	}
}
public class ConsumerInterfaceDemo {
	
	public static void main(String[] args) {
		
		List<Integer> value = Arrays .asList(2,3,5,6);
		//Type1 
		value.forEach(i->System.out.print(i));
		/* Above one is replacement of Consumer Interface ..so here we will use Consumer interface 
		 * inplace of above line 
		 */
		
		//Type2
		System.out.println();
		Consumer<Integer> consumer = new ConsImp(); 
		value.forEach(consumer);
		
		
		//Type 3
		Consumer<Integer> consumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("Hi "+t);
			}
			
			
		};
		
				
		value.forEach(consumer2);
		
		//Type 4
		Consumer<Integer> consumer3 =(t)-> System.out.println("Hi **"+t);
		value.forEach(consumer3);
		
      }
}
