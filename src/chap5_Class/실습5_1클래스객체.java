package chap5_Class;


class Armor {
	String name; // field
	int height;
	int weight;

	void takeOff() {// 메소드
		System.out.println("name = " + name + ", height = " + height + ", weight = " + weight);
	}
}

class Person {
	// 필드
	/*
	 * name은 String, age는 int, weight는 float로 필드 선언
	 */
	String name;
	int age;
	float weight;

	// 메소드
	void show() {
		/*
		 * name=**, age = **, weight = ** 형태로 출력
		 */
		System.out.println("name = " + name + ", age = " + age + ", weight = " + weight);
	}
}

public class 실습5_1클래스객체 {
	public static void main(String[] args) {
		// 객체 생성
					int a = 10;
					int arr[] = new int[5];
					Armor mark16 = new Armor();
					mark16.name = "강감찬";
					mark16.height = 55;
					mark16.weight = 62;
					
					
					
					Person p = new Person();
					p.name = "홍길동";
					p.age = 25;
					p.weight = 60.56f;

					// 메소드 호출
					p.show();

					/*
					 * [강감찬, 55, 62.34] 객체를 만들어 name=**, age = **, weight = ** 형태로 출력
					 */
					mark16.takeOff();
	}
}
