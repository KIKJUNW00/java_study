package chap2_dataType;

public class Test30 {
	public static void main(String[] args) {
		int i = 6;
		if ((i % 2) == 0) {
			System.out.println(i + "은 2의배수입니다");
			if ((i % 3) == 0) {
				System.out.println(i + "은 3의배수입니다");
			}
		}
		
		int cnt = 0;
		for (int j = 1; j < 100; j++) {
			if (i%2 ==0 && i%3 ==0) {
				System.out.println("2/3의 공배수");
				cnt++;
			}
			System.out.println("count: "+cnt);
		}

	}
}
