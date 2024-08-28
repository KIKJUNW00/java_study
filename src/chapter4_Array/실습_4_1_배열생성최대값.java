package chapter4_Array;

public class 실습_4_1_배열생성최대값 {

	public static void main(String[] args) {
		// 1차원 배열 생성 및 초기화
		/*
		 * 정수 1차원 배열 price를 선언하고 5개 값으로 초기화
		 */

		// for문을 사용한 최대값 찾기
		/*
		 * 최대값 변수를 priceMax로 선언한 후에 for 문을 사용하여 최대값을 찾는다 배열 price는 확장형 for 문으로 출력, 출력
		 * 형태는 다음과 같다: [1,2,3,4,5] 최대값 출력은 다음과 같다 최대값 = **
		 * 
		 */		
		int price[] = new int[5];
		int priceMax = 0;
//		확장형 for문 안쓰는 방법
		/*

		for (int i = 0; i < price.length; i++) {
			price[i] = i+1;
			System.out.print(price[i] + " ");
			if (priceMax < price[i]+1) {
				priceMax = price[i];
			}
		}		
		System.out.print("\n");
		System.out.print("최댓값: "+priceMax);
		*/
//		---------------------------------------------------------------------------------
		//확장형 for문 사용
		for(int i: price) {
			price[i] += 1;
			System.out.print(price[i] + " ");
			for (int j = i; j <= price.length; j++) {
				if (priceMax < price[i]) {
					priceMax = price[i];
				}
			}
		}
		System.out.println("\n최대값: "+priceMax);
		
	}
	
	
}
