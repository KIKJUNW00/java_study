package com.ruby.java.ch08.polymorphim;

interface dd {
	void test();
}

class GPI1 implements dd {

	@Override
	public void test() {
		System.out.println("GPI1 -  test 1");
	}

}

class GPI2 extends GPI1 {
	public void test() {
		System.out.println("GPI2  -  test 2");
	}
	public void test1() {
		System.out.println("GPI2 -  test1 3");
	}
}

class GPI3 extends GPI2 {
	public void test() {
		System.out.println("GPI3  -  test 4");
	}
	public void test1() {
		System.out.println("GPI3  -  test1 5");
	}
	public void test2() {
		System.out.println("GPI3  -  test2 6");
	}
}

public class GPI {
	public static void main(String[] args) {
		GPI3 obj = new GPI3();
		obj.test();
		obj.test1();
		obj.test2();
		System.out.println("-".repeat(20));
		
		GPI2 c = new GPI3();
		c.test();
		c.test1();
//		c.test2();
		System.out.println("-".repeat(20));
		
		GPI1 d = new GPI3();
		d.test();
//		d.test1();
		
		
//		print(obj);
	}

//	private static void print(GPI3 obj) {
//		obj.test();
//
//	}

//	private static void print(GPI2 obj) {
//		obj.test();
//	}

	private static void print(GPI1 obj) {

		obj.test();
	}
}
