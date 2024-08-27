package edu;

import java.util.Scanner;

public class Test31_1Gugudan2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("열의 수를 입력하세요: ");
		int column = scanner.nextInt();

		// 2단부터 9단까지 반복
		for (int i = 2; i <= 9; i += column) {
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k < i + column && k <= 9; k++) {
//	                    System.out.printf("%d x %d = %2d\t", k, j, k * j);
					System.out.print(k + " X " + j + " = " + (k * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

		scanner.close();
	}

	
//	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("열의 수를 입력하세요: ");
//        int column = scanner.nextInt();
//
//        // 2단부터 9단까지 반복
//        for (int i = 2; i <= 9; i += column) {
//            for (int j = 1; j <= 9; j++) {
//                for (int k = 0; k < column; k++) {
//                    int dan = i + k;
//                    if (dan <= 9) {
//                        System.out.print(dan + " X " + j + " = " + (dan * j) + "\t");
//                    }
//                }
//                System.out.println(); // 한 줄이 끝날 때 줄바꿈
//            }
//            System.out.println(); // 각 묶음이 끝날 때 줄바꿈
//        }
//
//        scanner.close();
//    }
//	
}
