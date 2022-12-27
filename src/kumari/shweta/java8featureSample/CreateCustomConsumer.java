package kumari.shweta.java8featureSample;
import java.util.function.Consumer;
class Movie{
	String name;
	public Movie(String name) {
		this.name=name;
	}
}
@FunctionalInterface
 interface CustomConsumer{
   public void accept();
	
}

class CustomConsumerImp implements Consumer<Movie> {

	@Override
	public void accept(Movie t) {
		System.out.println(t.name+"  is ready to release");
		
	}
	
}

public class CreateCustomConsumer {

	
	public static void main(String[] args) {
		
		Movie movie = new Movie("DDLG");
		//Normal approach
		CustomConsumerImp   objConsumer =  new CustomConsumerImp();
		objConsumer.accept(movie);
		
		//Using anonymous class 
		CustomConsumer objConsumer2= new CustomConsumer() {
			@Override
			public void accept() {
				// TODO Auto-generated method stub
				System.out.println("Movie name is "+movie.name);
			}
		};
		
		Consumer<Movie> consumer  =  m->System.out.println(m.name+" about to released ");
		Consumer<Movie> consumer1 = m->System.out.println(m.name+" is released ");
		Consumer<Movie> consumer2 = m->System.out.println(m.name+"is  closed now ");
	    consumer.accept(movie);
     
     //Chained consumer all consumer is going to be executed 
	    
	    System.out.println("Chained function ------------");
		Consumer<Movie> consumerChainConsumer=consumer.andThen(consumer1).andThen(consumer2);
		consumerChainConsumer.accept(movie);
		

	}
}
