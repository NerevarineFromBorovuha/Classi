package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookLogic3 {
	int x = scannerDate();

	public static int scannerDate() {
		System.out.print("Enter year >");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Wrong date. Enter integer date: ");
		}
		int x = sc.nextInt();
		return x;

	}

	public boolean afterEnterYear(Book book) {
		int dateBook = book.getYearPublishing();
		if (dateBook > x) {
			return true;
		} else {
			return false;
		}
	}

	public List<Book> listBookByDate(List<Book> bk) {
		List<Book> result = new ArrayList<Book>();
		for (Book b : bk) {
			if (afterEnterYear(b)) {
				result.add(b);
			}
		}
		return result;
	}

}
