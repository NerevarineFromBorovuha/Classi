package by.epam.tr.test;

public class Main {

	public static void main(String[] args) {
		Test2 kek = new Test2();
		Test2 kek2=new Test2(3,"sefseg");
		System.out.println(kek2.getPricolInt());
		System.out.println(kek2.getPricolString());
		
		kek.setPricolInt(7);
		kek.setPricolString("ogogogo");
		
		System.out.println(kek.getPricolInt());
		System.out.println(kek.getPricolString());

	}

}
