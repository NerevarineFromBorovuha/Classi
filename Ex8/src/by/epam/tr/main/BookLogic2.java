package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookLogic2 {
	String z = scannerPublishingHouse();
	public static String scannerPublishingHouse() {
		System.out.print("Enter publishing house >");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		return x;

	}

	public boolean afterEnterPublishingHouse(Book book) {
		String publishingHouse = book.publishingHouse;
		if (publishingHouse.equalsIgnoreCase(z)) {
			return true;
		} else {
			return false;
		}
	}

	public List<Book> listBookByPublishingHouse(List<Book> bk) {
		List<Book> result = new ArrayList<Book>();
		for (Book b : bk) {
			if (afterEnterPublishingHouse(b)) {
				result.add(b);
			}
		}
		return result;
	}
}
