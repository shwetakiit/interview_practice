package kumari.shweta.java8featureSample;
import java.util.function.Function;
class Student {
	String name;
	int marks;
	public Student(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
	}
}

/*@FunctionalInterface
interface CustomFunction<Student,String> {
	 public String apply(Student s) ;
	
}
class ImplementedCustomFunction implements CustomFunction<Student,String> {
	String grade;
	
	public String apply(Student s) {
	
		// TODO Auto-generated method stub
		 if(s.marks>=80 ) 
			 grade="A[Distinction]";
		 else if(s.marks>=60) 
			 grade="B[First Class]";
		 else if(s.marks>=50)
			 grade="C[Second class]";
		 else if(s.marks>=35) 
			 grade="D[Third class]";
		 else 
			 grade="[Failed]";
		 return grade;
			 
	}
	
	
}*/
public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<Student, String > function= s->{
			int marks = s.marks;  //These code we can write under apply method
			String grade = "";
			if(marks>=80)
				grade="A[Distinction]";
			else if(marks>=60) 
				grade="B[First class]";
			else if(marks>=50)
				grade="C[Second class]";
			else if(marks>=35) 
				grade="D[Third class]";
			else 
				grade="[Failed]";
			return grade;
		};
		Student[] students= {new Student("Shweta",60),
				             new Student("Ragini",50),
				             new Student("Astha",25)};
		
	/*	CustomFunction<Student,String> customFunction = ss->{
			
			int marks=ss.marks;
			String grade="";
			if(marks>80)
				grade="A[Distinction]";
			else 
				grade="B[NORMAL]";
			
			return grade;
				
		};*/
		
	for(Student s1:students) {
		
		System.out.println("Student Name is "+s1.name);
		System.out.println("Student Marks is "+s1.marks);
		System.out.println("Student grade is "+function.apply(s1));
	//	System.out.println("Student grade is with custom "+customFunction.apply(s1));
		}
	System.out.println();
	 
	//All api of Function  compose ,andThen ,identity
	
    Function<Integer,Integer> f1= i->2*i;
    Function<Integer,Integer> f2 = i ->i*i*i;
    
    
   Integer result = f1.andThen(f2).apply(2); 
   System.out.println("andThen result is "+result);
    
    
   Integer resultComposed = f1.compose(f2).apply(2);
   System.out.println("compose result is "+resultComposed);
   
 
  Function<Integer,Integer> identFunction = Function.identity();
  System.out.println("Result is same as input given for identity() is "+identFunction.apply(2));
    
	}
	
	
	
	}



