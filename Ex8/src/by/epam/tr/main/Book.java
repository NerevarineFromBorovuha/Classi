package by.epam.tr.main;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	/*
	 * Создать класс Book, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод equals. hashCode, toString().
	 * Создать второй класс, агрегирующий список типа Book, с подходящими
	 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные
	 * на консоль.
	 * 
	 * Book: id, название, автор(ы), издательство, год издания, количество страниц,
	 * цена, тип переплета. Найти и вывести: a) список книг заданного автора; b)
	 * список книг, выпущенных заданным издательством; c) список книг, выпущенных
	 * после заданного года.
	 */
	int idBook;
	String nameBook;
	String authors;
	String publishingHouse;
	int yearPublishing;
	int numberOfPages;
	int costBook;
	String typeBinding;

	public Book() {
		idBook = 0;
		nameBook = "";
		authors = "";
		publishingHouse = "";
		yearPublishing = 0;
		numberOfPages = 0;
		costBook = 0;
		typeBinding = "";
	}

	public Book(int idBook, String nameBook, String authors, String publishingHouse, int yearPublishing,
			int numberOfPages, int costBook, String typeBinding) {
		this.idBook = idBook;
		this.nameBook = nameBook;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.yearPublishing = yearPublishing;
		this.numberOfPages = numberOfPages;
		this.costBook = costBook;
		this.typeBinding = typeBinding;

	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getCostBook() {
		return costBook;
	}

	public void setCostBook(int costBook) {
		this.costBook = costBook;
	}

	public String getTypeBinding() {
		return typeBinding;
	}

	public void setTypeBinding(String typeBinding) {
		this.typeBinding = typeBinding;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authors, costBook, idBook, nameBook, numberOfPages, publishingHouse, typeBinding,
				yearPublishing);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authors, other.authors) && costBook == other.costBook && idBook == other.idBook
				&& Objects.equals(nameBook, other.nameBook) && numberOfPages == other.numberOfPages
				&& Objects.equals(publishingHouse, other.publishingHouse)
				&& Objects.equals(typeBinding, other.typeBinding) && yearPublishing == other.yearPublishing;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", nameBook=" + nameBook + ", authors=" + authors + ", publishingHouse="
				+ publishingHouse + ", yearPublishing=" + yearPublishing + ", numberOfPages=" + numberOfPages
				+ ", costBook=" + costBook + ", typeBinding=" + typeBinding + "]";
	}

}
