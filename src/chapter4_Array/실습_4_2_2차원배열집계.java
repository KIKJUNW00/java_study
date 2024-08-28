package chapter4_Array;

public class 실습_4_2_2차원배열집계 {
	public static void main(String[] args) {
		// 2차원 배열 생성 및 초기화
    	/*
    	 * 2차원 행렬 [3][4]을 matrix 정수 변수로 선언하고 12개 값을 초기화
    	 */
		int matrix[][]= new int[3][4];
		matrix[0][0]= 1;
		matrix[0][1]= 2;
		matrix[0][2]= 3;
		matrix[0][3]= 4;

		matrix[1][0]= 5;
		matrix[1][1]= 6;
		matrix[1][2]= 7;
		matrix[1][3]= 8;
		
		matrix[2][0]= 9;
		matrix[2][1]= 10;
		matrix[2][2]= 11;
		matrix[2][3]= 12;
		
		
        // 최대값, 최소값, 합 개수 초기화
    	/*
    	 * max, min, sum, count 정수 변수를 선언, 초기 값 지정
    	 * for 문을 사용하여 최대, 최소, 합, 개수를 계산  
    	 */
		int sum = 0;
		int count = 0;
		int max = 0;
		int min = 999;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+"\t");
				sum += matrix[i][j]; //합
				
				if (max < matrix[i][j]) { //최대
					max = matrix[i][j]; 
				}
				
				if (min > matrix[i][j]) { //최소
					min = matrix[i][j]; 
				}
				
				count++;
			}
		}
		
		System.out.println(" ");
		System.out.println("합: "+sum);
		System.out.println("최대: "+max);
		System.out.println("최소: "+min);
		System.out.println("개수: "+count);
		

        // 평균 계산
    	/*
    	 * sum을 사용하여 평균을 avg 변수로 선언하여 저장
    	 */
		int avg = sum/matrix.length;
		System.out.println("평균: "+ avg);
        // 결과 출력
    	/*
    	 * 2차원 배열을 행렬 형태(테이블 형태)로 출력
    	 * 최대, 최소, 합, 개수, 평균을 다음과 같이 출력
    	 * "최대=**, 최소=**, 합 = **, 갯수=**, 평균=**"
    	 */

	}
}
