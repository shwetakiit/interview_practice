package kumari.shweta;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Actor {
	
	String name;
	int age;
	double height;
	public Actor(String name, int age, double height) {
	
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Actor [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	

	
}

public class ActorDriver {
	
	public static void main(String[] args) {
		
		Actor a1 = new Actor("Akshay", 54, 1.85);
		Actor a2 = new Actor( "Hritik", 48, 1.80);
		Actor a3 = new Actor("John", 49, 1.80);
		

		
		List<Actor> list = new ArrayList<Actor>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Comparator<Actor> comparator = (a11,a22)->(a11.age>a22.age)?1:(a11.age<a22.age)?-1:0;
		
		Collections.sort(list, comparator);
		System.out.println(list);
		
		
	}
	
}

