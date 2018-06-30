package iteratorArrayList;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf=new BookShelf(4);
		bookShelf.appendBook(new Book("1"));
		bookShelf.appendBook(new Book("2"));
		bookShelf.appendBook(new Book("3"));
		bookShelf.appendBook(new Book("4"));
		bookShelf.appendBook(new Book("5"));
		bookShelf.appendBook(new Book("6"));
		bookShelf.appendBook(new Book("7"));
		bookShelf.appendBook(new Book("8"));
		bookShelf.appendBook(new Book("9"));
		bookShelf.appendBook(new Book("10"));
		bookShelf.appendBook(new Book("11"));
		
		
		Iterator it=bookShelf.iterator();
		while(it.hasNext()){
			Book book=(Book)it.next();
			System.out.println(book.getName());
		}
		
	}

}
