package kumari.shweta.designpattern.Prototype;

import java.util.ArrayList;
import java.util.List;
 class BookShop implements Cloneable {
	
	private String shopName;
	
	public BookShop() {

	}
	List<Book> books = new ArrayList<Book>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		
		for(int i=0;i<5;i++) {
			Book book = new Book();
			book.setBookId(i);
			book.setBookName("book"+i);
			getBooks().add(book);
			
		}
		
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	//object clone method is protected so we can't use directly so we need to provide clone method
	

protected Object clone() throws CloneNotSupportedException {
	

	//return super.clone();  this is object class clone so if we do changes in copied object .It will reflect original object
	
	BookShop bookShop = new BookShop();
	//fetching data from old Object and copied 
	for(Book b:this.getBooks()) {
		bookShop.getBooks().add(b);
	
	}
	return bookShop;
	
}
	
	

}
