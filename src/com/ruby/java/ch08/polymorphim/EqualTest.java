package com.ruby.java.ch08.polymorphim;

class DwD{
	String name;
	
	public DwD(String name) {
		this.name = name;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		DwD d = (DwD)obj;
//		if (name.equals(d.name)) {
//			return true;
//		return false;	
//		}
//	}
	
}

public class EqualTest {
	
	public static void main(String[] args) {
		DwD a = new DwD("A");
		DwD b = new DwD("B");
		DwD c = new DwD("C");
		
		System.out.println((a==b)? "equal" : "not equal");
		System.out.println((a==c)? "equal" : "not equal");
	}
}
