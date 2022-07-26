package by.epam.tr.main;

import java.util.List;

public class BookView {

	public void printListBookByDate(List<Book> bk) {
		for (Book b : bk) {
			System.out.println("Book name: " + b.getNameBook() + " , author name : " + b.getAuthors()
					+ " , year publishing : " + b.getYearPublishing());
		}

	}

	public void printListBookByAuthor(List<Book> bk) {
		for (Book b : bk) {
			System.out.println("Book name: " + b.getNameBook() + " , author name : " + b.getAuthors()
					+ " , year publishing : " + b.getYearPublishing());
		}

	}

	public void PrintListBookByPublishingHouse(List<Book> bk) {
		for (Book b : bk) {
			System.out.println("Book name: " + b.getNameBook() + " , author name : " + b.getAuthors()
					+ " , publishing house : " + b.publishingHouse);
		}

	}

}
