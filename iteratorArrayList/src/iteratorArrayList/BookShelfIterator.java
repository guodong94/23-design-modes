package iteratorArrayList;

public class BookShelfIterator implements Iterator {
	public BookShelf bookShelf;
	public int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book=bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
