package chapter4_Array;

public class 실습_4_3_2차원행렬더하기 {
	public static void main(String[] args) {
		// 두 개의 2차원 배열 생성 및 초기화
		/*
		 * 행렬 [5][7] A, B를 정수로 선언하고 12개의 값을 초기화
		 */
		int A[][] = new int[5][7];

		int B[][] = new int[5][7];

		A[0][0] = 1;
		A[0][1] = 2;
		A[0][2] = 3;
		A[0][3] = 4;
		A[0][4] = 5;
		A[0][5] = 6;
		A[0][6] = 7;
		A[1][0] = 8;
		A[1][1] = 9;
		A[1][2] = 10;
		A[1][3] = 11;
		A[1][4] = 12;

		B[0][0] = 1;
		B[0][1] = 2;
		B[0][2] = 3;
		B[0][3] = 4;
		B[0][4] = 5;
		B[0][5] = 6;
		B[0][6] = 7;
		B[1][0] = 8;
		B[1][1] = 9;
		B[1][2] = 10;
		B[1][3] = 11;
		B[1][4] = 12;
		// 결과를 저장할 2차원 배열
		/*
		 * C = A + B => 행렬 A와 B를 더하여 C에 넣기 위한 정수 배열 C를 선언
		 */
		int C[][] = new int[5][7];

		// 행렬 더하기
		/*
		 * A, B를 더한 결과를 저장하는 C를 구하는 for 문 구현
		 */
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		// 결과 출력
		/*
		 * 행렬 A, B, C를 출력하는 코드 작성 출력 형태는 "A = 1,2,3,4,5,6,7 8,9, ... B =
		 * 
		 * C =
		 */
		
		System.out.println("A: ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j]);
				if (j < A[i].length -1) {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("B: ");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j]);
				if (j < B[i].length -1) {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("C: ");
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				System.out.print(C[i][j]);
				if (j < C[i].length -1) {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println();

		
		
		
	}
}
