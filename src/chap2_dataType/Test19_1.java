package chap2_dataType;

import java.util.Scanner;

public class Test19_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int score = sc.nextInt();
		
		System.out.println((score>=60)?"합격":"붛합격");
		
		
//		if (score>=60) {
//			System.out.println("합격입니다");
//		} else {
//			System.out.println("불합격입니다.");
//		}
		

	}

}
