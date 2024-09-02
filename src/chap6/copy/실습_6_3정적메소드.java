package chap6.copy;

import java.lang.annotation.Repeatable;

import javax.security.auth.Subject;

class Student2 {
	// 필드
	/*
	 * name, age, subjects[], scores[], passFail[], count를 private으로 선언 count는 배열의
	 * index로 사용 numberStudents를 정적 필드로 선언
	 */
	private String name;
	private int age;
	private String subjects[];
	private int scores[];
	private int passFail[];
	private int count = 0;
	static int numberStudents = 0;
	private static int total = 0;

	// 생성자
	/*
	 * name, age, subjects[], scores[], passFail[], count를 매개변수로 전달받는 생성자 정의
	 * 
	 */
	public Student2(String name, int age, String[] subjects, int[] scores, int[] passFail, int count) {

		this.name = name;
		this.age = age;
		this.subjects = subjects;
		this.scores = scores;
		this.passFail = passFail;
		this.count = count;
		total++;
	}
	// setter 메소드: setName(String name), setAge(int age), setSubjects(String
	// subjects[]), setScores(int scores[]), setCount(int num)

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 학생 수를 반환하는 정적 메소드getNumberStudents()
	public static int getNumgetNumberStudents() {
		return total;
	}

	public static void printTotalStudents() {
		System.out.println("전체 학생 수: " + getNumgetNumberStudents());
	}

	// 학생 정보를 출력하는 메소드 (예시용)
	public void printStudentInfo() {
		/*
		 * 이름 = **, 나이 = ** 과목1 = **, 점수1 = **, 통과여부=pass 과목2 = **, 점수2 = **, 통과여부=fail
		 * ... 등으로 출력
		 */
		System.out.println("이름: " + name + ", 나이: " + age);
		for (int i = 0; i < scores.length; i++) {
			String passorfail = scores[i] >= passFail[i] ? "pass": "fail";
			System.out.println("과목: " + subjects[i] + ", 점수: " + scores[i] + ", 통과여부: "+ passorfail);
		}
		System.out.println();

	}

	// 통과 여부 (모든 과목을 통과했는지 확인)
	public boolean isPassed() {
		// 주어진 학생이 모든 과목 통여 여부를 반환
		return false;
	}

	

	// 6.2.2 각 학생의 성적 테이블을 출력하는 정적 메소드
	static void printAllStudents(Student2[] students) {
		// 학생 이름 + 과목명, 과목 점수 .... + 과목통과여부:pass or fail
        for (int i = 0; i < students.length; i++) {
			students[i].printStudentInfo();
		}
	}

	// 6.2.2 과목별 최대/최소 점수 및 해당 학생을 출력하는 정적 메소드
	static void printSubjectStats(Student2[] students) {
		 // 과목의 수를 구합니다.
	    int numSubjects = students[0].subjects.length;
	    
	    // 최고 점수와 최저 점수를 저장할 배열을 생성합니다.
	    int[] maxScores = new int[numSubjects];
	    int[] minScores = new int[numSubjects];
	    
	    // 최고 점수와 최저 점수를 기록한 학생을 저장할 배열을 생성합니다.
	    Student2[] maxStudents = new Student2[numSubjects];
	    Student2[] minStudents = new Student2[numSubjects];

	    // 최고 점수와 최저 점수를 첫 번째 학생의 점수로 초기화합니다.
	    for (int i = 0; i < numSubjects; i++) {
	        maxScores[i] = students[0].scores[i];
	        minScores[i] = students[0].scores[i];
	        maxStudents[i] = students[0];
	        minStudents[i] = students[0];
	    }

	    // 모든 학생의 점수를 비교하여 최고 점수와 최저 점수를 갱신합니다.
	    for (Student2 student : students) {
	        for (int i = 0; i < numSubjects; i++) {
	            if (student.scores[i] > maxScores[i]) {
	                maxScores[i] = student.scores[i];
	                maxStudents[i] = student;
	            }
	            if (student.scores[i] < minScores[i]) {
	                minScores[i] = student.scores[i];
	                minStudents[i] = student;
	            }
	        }
	    }
	    
//	    for (int s = 0; s < students.length; s++) {
//	        Student2 student = students[s];
//	        for (int i = 0; i < numSubjects; i++) {
//	            if (student.scores[i] > maxScores[i]) {
//	                maxScores[i] = student.scores[i];
//	                maxStudents[i] = student;
//	            }
//	            if (student.scores[i] < minScores[i]) {
//	                minScores[i] = student.scores[i];
//	                minStudents[i] = student;
//	            }
//	        }
//	    }

	    // 각 과목별로 최고 점수와 최저 점수를 출력합니다.
	    for (int i = 0; i < numSubjects; i++) {
	        System.out.println("과목: " + students[0].subjects[i]);
	        System.out.println("최고 점수: " + maxScores[i] + " (" + maxStudents[i].name + ")");
	        System.out.println("최저 점수: " + minScores[i] + " (" + minStudents[i].name + ")");
	        System.out.println();
	    }
			
			
		
	}
	
}

public class 실습_6_3정적메소드 {
	
	
	public static void main(String[] args) {
		
		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };
		int[] passFails = { 40, 70, 60, 55, 80 };
		Student2[] students = {
//				  생성자를 사용하여 객체 생성
				new Student2("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }, passFails, -1),
				new Student2("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }, passFails, -1),
				new Student2("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }, passFails, -1),
				new Student2("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }, passFails, -1),
				new Student2("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }, passFails, -1)

		};
		// 학생 수를 정적 메소드 호출로 처리
		Student2.printTotalStudents();
		System.out.println("-".repeat(30));
		// 학생 정보 출력 (예시)
		showStudents(students);
		System.out.println("-".repeat(30));
		// 각 학생의 성적 테이블 출력
		Student2.printAllStudents(students);
		System.out.println("-".repeat(30));
		// 과목별 최대/최소 점수 및 해당 학생 출력
		Student2.printSubjectStats(students);
		System.out.println("-".repeat(30));
	}
	
	// showStudents 메서드 정의
    public static void showStudents(Student2[] students) {
        for (Student2 student : students) {
            student.printStudentInfo(); // 각 학생의 정보를 출력
        }
    }

}
