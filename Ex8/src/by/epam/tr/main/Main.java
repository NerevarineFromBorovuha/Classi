package by.epam.tr.main;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BookData bookData = new BookData();
		bookData.add(new Book(0001, "Mathematics", "Ivanov", "Minsk", 1996, 300, 25, "soft"));
		bookData.add(new Book(0002, "Chemistry", "Petrov", "Moscow", 2001, 234, 24, "solid"));
		bookData.add(new Book(0003, "Biology", "Sidorov", "Petersburg", 2002, 432, 56, "soft"));
		bookData.add(new Book(0004, "Drawing", "Begunov", "Minsk", 1962, 234, 23, "solid"));
		bookData.add(new Book(0005, "Geography", "Sidorov", "Moscow", 2010, 352, 54, "soft"));
		bookData.add(new Book(0006, "History", "Hohlov", "Petersburg", 1980, 643, 76, "solid"));
		bookData.add(new Book(0007, "Literature", "Tarasov", "Moscow", 2015, 231, 43, "soft"));

		System.out.println("If you want to know the list of books by the author press 1 ");
		System.out.println("If you want to know the list of books by the publishing house press 2 ");
		System.out.println("If you want to know the list of books by year2 press 3 ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Wrong number. Enter integer number 1 or 2 or 3: ");
		}

		int x = sc.nextInt();

		BookView view = new BookView();

		switch (x) {
		case 1:
			BookLogic1 logic = new BookLogic1();
			List<Book> result1 = logic.listBookByAuthor(bookData.getBooks());
			view.printListBookByAuthor(result1);
			break;
		case 2:
			BookLogic2 logic2 = new BookLogic2();
			List<Book> result2 = logic2.listBookByPublishingHouse(bookData.getBooks());
			view.PrintListBookByPublishingHouse(result2);
			break;
		case 3:
			BookLogic3 logic3 = new BookLogic3();
			List<Book> result3 = logic3.listBookByDate(bookData.getBooks());
			view.printListBookByDate(result3);
			break;

		}

	}

}
