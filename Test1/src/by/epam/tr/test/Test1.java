package by.epam.tr.test;

public class Test1 {
	// 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
	// методы изменения этих переменных. Добавьте метод, который находит сумму
	// значений этих переменных, и метод, который находит наибольшее значение из
	// этих двух переменных.
	int numberA;
	int numberB;

	public Test1() {
		numberA = 0;
		numberB = 0;
	}

	public Test1(int numberA, int numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}

	public int getNumberA() {
		return numberA;
	}

	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}

	public int getNumberB() {
		return numberB;
	}

	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}

	public void print() {
		System.out.println("numberA = " + numberA);
		System.out.println("numberB = " + numberB);
	}

	public int sum() {
		int sum = numberA + numberB;
		return sum;
	}

	public int max() {
		if (numberA > numberB) {
			return numberA;
		} else {
			return numberB;
		}

	}

}
