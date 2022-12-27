package kumari.shweta.java8featureSample;

public class InterfaceWithJava8FeatureImp implements Left,Right{
	
public static void main(String[] args) {
	
	InterfaceWithJava8FeatureImp obj = new InterfaceWithJava8FeatureImp();
	obj.m1();
}

//Third way

@Override
public void m1() {
	// TODO Auto-generated method stub
	Left.super.m1();
}

//2nd way
/*
@Override
public void m1() {
	// TODO Auto-generated method stub
	Right.super.m1();
} */




//1st way

/*@Override
  public void m1() {
	// TODO Auto-generated method stub
	System.out.println("Overidden in driver class");
}*/




}
