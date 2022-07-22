package by.epam.tr.test;

public class Main {

	public static void main(String[] args) {
		Test1 kek = new Test1();
		Test1 kek1 = new Test1(8,9);
		
		kek.setNumberA(3);
		kek.setNumberB(5);
		
		
		kek.print();
		kek1.print();
		
		System.out.println("sum kek = "+kek.sum());  
		System.out.println("sum kek1 = "+kek1.sum()); 
		
		System.out.println("max kek = "+kek.max());  
		System.out.println("max kek1 = "+kek1.max()); 
		
		

	}

}
