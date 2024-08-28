package chapter4_Array;

public class ExamA3_배열 {
	public static void main(String[] args) {
//		학생 5명의 이름을 1차원 문자열 배열로 정의
//		String[] names = { “홍길동”, “김유신”, “계백“, “강감찬”, “을지문덕“ }
//		5개 교과목의 이름과 과락/통과기준을 1차원 문자열 배열로 정의
//		String[] subjs = { “수학“, “국어”, “영어“, “과학“, “역사“ }
//		int[] criteria = { 50, 60, 70, 80, 80 }
//		학생별 과목별 점수를 2차원 배열로 정의
//		int[][] scores = { {85, 90, 78, 88, 92}, {75, 80, 85, 90, 95}, 
//						   {65, 70, 75, 80, 85}, {95, 92, 88, 84, 91}, 
//						   {88, 76, 85, 79, 90} }

		String[] names = { "홍길동", "김유신", "계백", "강감찬", "을지문덕" };
		String[] subjs = { "수학", "국어", "영어", "과학", "역사" };
		int[] criteria = { 50, 60, 70, 80, 90 };

		int[][] scores = { { 85, 90, 78, 88, 92 }, { 75, 80, 85, 90, 95 }, { 65, 70, 75, 80, 85 },
				{ 95, 92, 88, 84, 91 }, { 88, 76, 85, 79, 90 } };

//		반복문/삼항연산자를 이용하여 학생별, 과목별 점수, 통과여부 출력
//		5개 과목의 총점 및 평균 점수를 테이블로 출력
//		과목별 최대, 최소 점수를 구하고, 해당 점수의 학생 이름을 테이블로 출력

		System.out.println(">>> 학생별, 과목별 점수, 통과여부");
		System.out.println("============================");

		for (int i = 0; i < names.length; i++) {
			System.out.println("[" + names[i] + "}");
			for (int j = 0; j < subjs.length; j++) {
				String hapbul = (scores[i][j] >= criteria[j]) ? "통과" : "과락";
				System.out.println("\t" + subjs[j] + " : " + scores[i][j] + " => " + hapbul);
			}
		}
		System.out.println();

		System.out.println(">>> 과목 총점 및 평균 점수를 테이블로 출력");
		System.out.println("====================================================");
		System.out.print("이름 ");
		for (int i = 0; i < subjs.length; i++) {
			System.out.print("\t" + subjs[i]);
		}
		System.out.println("\n-------------------------------------------------");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < scores.length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("=============================================================");
		System.out.println(">>> 과목별 최대, 최소 점수를 구하고, 해당 점수의 학생 이름을 테이블로 출력");
		System.out.println("=============================================================");
		System.out.println("과목\t" + "최대점수\t" + "이름\t" + "최소점수\t" + "이름");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < subjs.length; i++) {
			
			int max = scores[0][i];
			int min = scores[0][i];
			String maxName = names[0];
			String minName = names[0];
			
			System.out.print(subjs[i] + "\t");
			
			for (int j = 0; j < scores.length; j++) {
				for (int k = 0; k < names.length; k++) {
					if (max < scores[j][i]) {
						max = scores[j][i];
						maxName = names[j];
					}
					
					if (min > scores[j][i]) {
						min = scores[j][i];
						minName = names[j];
					}
				}
			}
			System.out.println(max + "\t"+ maxName + "\t" + min +"\t"+ minName);
		}
		System.out.println();

	}
}
