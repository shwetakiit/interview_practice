package kumari.shweta.java8featureSample;

interface A {
	
	
	public void Show(int i);
}

/*class Xyz implements A {

	@Override
	public void Show(int i) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello ***"+i);
	}
	
}*/
public class LembDaExpression {
	
	public static void main(String[] args) {
		A obj;
		
	/*	obj =new A() {
			
			@Override
			public void Show(int i) {
				// TODO Auto-generated method stub
				System.out.println("Hello "+i);

			}
		};*/
		obj=i->System.out.println("Hello"+i);
		obj.Show(6);
	}
		

}
