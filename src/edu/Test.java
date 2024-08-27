package edu;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("이름: 홍길동");
		System.out.println("생년월일: 1999.05.26");
		System.out.println("학교: 부산대학교");
		System.out.println("학과: 컴퓨터공학과");
		System.out.println("입학: 2020년");
		
		System.out.print("입력하시오: ");
		String name = sc.next();
		System.out.println("뭘봐: "+ name);
		
		
		sc.close();
	}

}
