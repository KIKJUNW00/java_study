package com.ruby.java.ch12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test15 {
	public static void main(String[] args) {
		
		UserBean user = new UserBean("pueum", "오정일", "010-123-4567", "서울");
		
		try (ObjectOutputStream out =
				new ObjectOutputStream(new FileOutputStream("user.txt"))){
			out.writeObject(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
