package iteratorArrayList;

import java.util.ArrayList;

public class BookShelf implements Aggregate{

	private ArrayList<Book> books;
	private int last;
	
	public BookShelf(int maxSize){
		this.books=new ArrayList<>(maxSize);
	}
	
	public int getLength(){
		return this.books.size();
	}
	public void appendBook(Book book){
		books.add(last, book);
		last++;
	}
	
	public Book getBookAt(int index){
		return books.get(index);
	}
	
	
	@Override
	public Iterator iterator() {
		
		return new BookShelfIterator(this);
	}

}
