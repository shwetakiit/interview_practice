package kumari.shweta.inhertance;

public class Driver {
	
public static void main(String[] args) {
	//Multiple Inheritance 
	
	MultipleInheritance multipleInheritance= new MultipleInheritance();
	multipleInheritance.printA();
	multipleInheritance.printB();
	multipleInheritance.printC();
	multipleInheritance.Display();
	
	MultipleInheritanceC objC= new MultipleInheritanceC();
	objC.printA();
	objC.printB();
	objC.Display();
}
	
}
