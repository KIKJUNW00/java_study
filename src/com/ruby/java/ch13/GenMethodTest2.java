package com.ruby.java.ch13;


public class GenMethodTest2 {
	 <T extends Number, V extends T> boolean isInclude(T num, V[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;
			
	}
	
	public static void main(String[] args) {
		Integer[] inum = {1,2,3,4,5};
		Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[]  snum = {"one", "two", "three", "four", "five"};
		
		 // GenMethodTest2 객체 생성 후 메서드 호출
		 GenMethodTest2 genMethodTest2 = new GenMethodTest2();
		
		boolean b1 = genMethodTest2.isInclude(3, inum);
		System.out.println("결과: " +b1);
		
		boolean b2 = genMethodTest2.isInclude(5.0, dnum);
		System.out.println("결과: "+b2);
		
//		isInclude("one", snum)
		
		// 제네릭 타입 명시적 호출
		genMethodTest2.<Integer, Integer>isInclude(3, inum);
		genMethodTest2.<Double, Double>isInclude(5.0, dnum);
		
		// String은 Number 타입이 아니기 때문에 컴파일 오류 발생
        // GenMethodTest2.<String, String>isInclude("one", snum);
	}
}
