package kumari.shweta.designpattern.Prototype;

public class DemoPrototype {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bookShop = new BookShop();
		bookShop.setShopName("Novelty");
		bookShop.loadData();
		System.out.println(bookShop);
		
		//For second object we are not fetching data from database  we are using old data to clone the object
		BookShop bookShop2=(BookShop) bookShop.clone();
		bookShop2.setShopName("Vishal");
		bookShop2.getBooks().remove(2);
		System.out.println(bookShop);
		System.out.println(bookShop2);
		
	}

}
