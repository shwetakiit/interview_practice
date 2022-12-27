package kumari.shweta.java8featureSample;

import java.util.function.Predicate;

import kumari.shweta.interface1;

@FunctionalInterface
interface CustomePredicate<Integer> {
	public boolean test(Integer number);
	
}
class ImplementationCustomPredicate implements CustomePredicate<Integer> {
	Integer num;
	 ImplementationCustomPredicate( Integer number) {
		  this.num=number;
		 
	 }
	@Override
	public boolean test(Integer number) {
		if(number%2==0) {
			return true;
		} else {
			return false;
		}
		
	}
}
 
public class PredicateDemo {
	
	public static void main(String[] args) {
		
		CustomePredicate<Integer> obj1 = new 	ImplementationCustomPredicate(10);
		System.out.println("Check even odd by old approach"+obj1.test(5));
		
		
		CustomePredicate<Integer> customePredicate = i->i%2==0;
		System.out.println("Is number even"+customePredicate.test(5));
		System.out.println("Is number even"+customePredicate.test(10));
		
		System.out.println("**********"+customePredicate);
		
		//Similary Predicate Functional interface has implemented directly we can use it 
		//Using predifine Functional Interface of Java Predicate 
		Predicate<Integer> predicate = j->j%2==0;
		System.out.println("Check even odd by predicate"+predicate.test(11));
		Predicate<Employee> predicate2 = e->e.salary>10000 && e.id>1;
		Employee obj = new Employee("Shweta", 101, 50000);
		System.out.println("Is salary and Id satisfield condition "+predicate2.test(obj));
		
	  /*Predicate and or negate not  isEqual   */
		
		//And 
		int[] x = {0,5,10,15,20,25,30,35};
		Predicate<Integer> p1= i->i%2==0;
		Predicate <Integer> p2= i->i>10;
		for(int x1 : x) {
			if(p1.and(p2).test(x1)) {
				
				System.out.println("Print array element which is even and greater than 10 is :"+x1);
			}
			
			if(p1.negate().test(x1)) {
				
				System.out.println("Array element which is not even using negate()"+x1);
			}
		}
	
		//or
    for(int x1: x) {
    	 if(p1.or(p2).test(x1)) {
    		 System.out.println("array element either even or greater than 10 using or()"+x1);
    		 
    	 }
    }
		
    
    //isEqual
    
    Predicate<String> p3= Predicate.isEqual("Shweta");
    System.out.println("Is both object equal using isEqual()"+p3.test("Shweta"));
    
    Integer i1 = new Integer(5);
    Integer i2 = new Integer(6);
    
    Predicate<Integer> p4= Predicate.isEqual(i1);
    System.out.println("Is both integer object equal "+p4.test(i2));
    
    //not 
    Predicate<Integer> p5 = Predicate.not(p1); 
    for(int x1: x) {
    	
    	if(p5.test(x1))
    	
    	 System.out.println("arrayelement which is not even :"+x1);
    	
    }
   	
}

}
