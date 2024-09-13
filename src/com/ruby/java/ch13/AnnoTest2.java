package com.ruby.java.ch13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Check2{
	String name();
	int val();
	int repeat();
}

public class AnnoTest2 {

	@Check2(name="first", val= 123, repeat = 3)
	public static void test() {
		AnnoTest2 obj = new AnnoTest2();
		
		try {
			Class<?> c =obj.getClass();
			Method m = c.getMethod("test");
			
			Check2 check = m.getAnnotation(Check2.class);
			for (int i = 0; i < check.repeat(); i++) {				
				System.out.println(check.name()+" : "+check.val());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		test();
	}
}
