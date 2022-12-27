package kumari.shweta.designpattern;

public class SinglrtonDesign5 {
	
	private static SinglrtonDesign5 objDesign5=null;
	private SinglrtonDesign5() {
		
	}

	static {
		objDesign5 = new SinglrtonDesign5();
	}
	
	public static void main(String[] args) {
		SinglrtonDesign5 obj1=SinglrtonDesign5.objDesign5;
		System.out.println(obj1.hashCode());
		SinglrtonDesign5 obj2 = SinglrtonDesign5.objDesign5;
		System.out.println(obj2.hashCode());
	}
}
