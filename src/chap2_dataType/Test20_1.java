package chap2_dataType;

import java.util.Scanner;

public class Test20_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score  = sc.nextInt();
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		} else if(score >=80){
			grade = 'B';			
		} else if(score >=70){
			grade = 'C';
		} else if(score >=60){
			grade = 'D';
		} else { 
			grade = 'F';
		}
		System.out.println(grade);
		sc.close();
	}
}