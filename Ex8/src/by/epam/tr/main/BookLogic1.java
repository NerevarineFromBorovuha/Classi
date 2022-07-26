package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookLogic1 {
	
	
	String y = scannerAuthor();
	
	
	
	

	

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static String scannerAuthor() {
		System.out.print("Enter author >");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		return x;

	}

	public boolean afterEnterAutor(Book book) {
		String authorBook = book.authors;
		if (authorBook.equalsIgnoreCase(y)) {
			return true;
		} else {
			return false;
		}
	}

	public List<Book> listBookByAuthor(List<Book> bk) {
		List<Book> result = new ArrayList<Book>();
		for (Book b : bk) {
			if (afterEnterAutor(b)) {
				result.add(b);
			}
		}
		return result;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

}
