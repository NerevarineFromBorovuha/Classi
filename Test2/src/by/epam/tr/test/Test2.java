package by.epam.tr.test;

public class Test2 {
	// 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными
	// параметрами. Добавьте конструктор, инициализирующий члены класса по
	// умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
	private int pricolInt;
	private String pricolString;

	public Test2() {
		pricolInt = 5;
		pricolString = "Pricolist";
	}
	public Test2(int pricolInt, String pricolString) {
		this.pricolInt =pricolInt;
		this.pricolString = pricolString;
	}

	public int getPricolInt() {
		return pricolInt;
	}

	public void setPricolInt(int pricolInt) {
		this.pricolInt = pricolInt;
	}

	public String getPricolString() {
		return pricolString;
	}

	public void setPricolString(String pricolString) {
		this.pricolString = pricolString;
	}

}
