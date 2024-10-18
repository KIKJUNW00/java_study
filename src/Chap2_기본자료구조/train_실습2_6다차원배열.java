package Chap2_기본자료구조;

/*
 * 3번째 실습
 * 교재 83 - 배열 처리 + function parameter 전달 숙달 훈련 
 *  함수에서 배열을 리턴할 때 리턴 타입 정의할 수 있어야 한다
 */

import java.util.Arrays;
import java.util.Random;
public class train_실습2_6다차원배열 {

	public static void main(String[] args) {
		int [][]A = new int[2][3];
		int [][]B = new int[3][4];
		int [][]C = new int[2][4];

		inputData(A);
		inputData(B);
		int [][]D = A.clone();//교재83 - 배열 복제
		System.out.println("A[2][3] = ");
		showData("행렬 A", A);
		System.out.println("D[2][3] = ");
		showData("행렬 D", D);
		System.out.println();
		System.out.println("B[3][4] = ");
		showData("행렬 B", B);
		int [][]E = addMatrix(A,D);
		System.out.println("E[2][3] = ");
		showData("행렬 E", E);
		C = multiplyMatrix(A,B);
		System.out.println("C[2][4] = ");
		showData("행렬 C", C);

		int [][]F = transposeMatrix(B);
		System.out.println("F[4][3] = ");
		showData("행렬 F", F);
		C= multiplyMatrixTransposed(A,F);
		showData("행렬 곱셈 결과-전치행렬 사용", C);
		boolean result = equals(A,C);
		if (result)
			System.out.println("행렬 A,C는 equal이다");
		else
			System.out.println("행렬 A,C는 equal 아니다");
	}
	static void inputData(int [][]data) {
		Random rNum = new Random();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = rNum.nextInt(100);
			}
		}
	}
	static void showData(String msg, int[][]items) {
		
		System.out.println(msg + ":");
        for (int[] row : items) {
            System.out.println(Arrays.toString(row)); // 각 행을 출력
        }
		
	}
	static boolean equals(int[][]a, int[][]b) {
		//행렬 a,b의 행의 수, 열의 수가 같아야 하고 각 원소가 같아야 한다.
		if (a.length != b.length || a[0].length != b[0].length) {
            return false; // 행렬 크기가 다르면 false
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false; // 원소가 다르면 false
                }
            }
        }
        return true; // 모든 원소가 같으면 true
		
		
	}
	static int[][] addMatrix(int [][]X, int[][]Y) {
		int rows = X.length;
		int cols = X[0].length;
		int[][] arr = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols ; j++) {
				arr[i][j]=X[i][j]+Y[i][j];
			}
		}
		return arr;
	}
	static int[][] multiplyMatrix(int [][]X, int[][]Y) {
		int rows = X.length;//2
		int cols = Y[0].length; //4
		int com = X[0].length;//3
		
		int[][] arr = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				for (int k = 0; k < com; k++) {
					arr[i][j] += X[i][k]*Y[k][j];
				}
			}
		}
		return arr;
		
	}
	static int[][] transposeMatrix(int [][]X) {
		int rows = X.length;
		int cols = X[0].length;
		
		int[][] arr = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[j][i]=X[i][j];
			}
		}
		return arr;
		
	}
	static int[][] multiplyMatrixTransposed(int [][]X, int[][]Y){
		 return multiplyMatrix(X, transposeMatrix(Y));
	}
}

