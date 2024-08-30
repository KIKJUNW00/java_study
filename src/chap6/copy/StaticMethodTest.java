package chap6.copy;

public class StaticMethodTest {
	
	int num =123;
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
//		StaticMethodTest.print2();
		
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2('!');
	}

	public static void print1() {
//		int num2 =num;
		System.out.println("hello");
	}

	public void print2(char a) {
		int num3 =num;
		System.out.println("java" + a + num3);
	}
}
