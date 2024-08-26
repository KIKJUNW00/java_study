package chap2_dataType;

import java.util.Scanner;

public class 실습2_4조건문논리연산 {
	
	public static void main(String[] args) {
		
		/*

		 * 부산에 사는 청년 여부를 참 거짓으로 판별하는 코드를 만든다.

		 * 정수 나이ㅡ 도시 이름 부산를 화면에서 입력받는다

		 * 

		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오: ");
		int n = sc.nextInt(); //정수일 때
		
		System.out.print("도시를 입력하시오: ");
		String st = sc.next(); //문자열일 때 
		
		
		
		// 불리언 변수 선언 및 초기화
		
		/*

		 * 부산청년 여부를 표현하는 불리언 변수를 false로 선언한다

		 */
		boolean busan = false;
		
		
		// 논리 연산 사용
		
		/*

		 * 부산 청년의 정의는 20 < age < 30ss

		 * 부산 청년 여부를 표현하는 불리언 조건식은 나이조건과 도시 조건을 모두 만족해야 한다

		 */
		
		if (n>20 && n<30 && st.equals("부산")) {
			busan = !busan;
			System.out.println("나이 = "+ n +", 도시 = "+ st +", 부산청년여부 = "+ busan);
		}else {
			System.out.println("나이 = "+ n +", 도시 = "+ st +", 부산청년여부 = "+ busan);			
		}
		
		// 논리 결과 출력
		
		/*

		 * 출력 형태는 다음과 같이 1줄에 출력한다. 부산 청년 여부는 삼항연산자를 사용하여 "참", "거짓"으로 출력한다.

		 * "나이 = **, 도시 = **, 부산청년여부 = **"

		 */
		sc.close();
	}
}
