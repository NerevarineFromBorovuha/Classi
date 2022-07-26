package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookData {

	private List<Book> books;

	public BookData() {
		books = new ArrayList<Book>();
	}

	public void add(Book book) {
		books.add(book);

	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookData other = (BookData) obj;
		return Objects.equals(books, other.books);
	}

}
