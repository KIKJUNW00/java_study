
package chap6.copy;
class Student4 {
    // 필드
	/*
	 * name, age, subjects[], scores[], count를 private으로 선언
	 * count는 배열의  index로 사용
	 */
	private String name;
	private int age;
	private String subjects[];
	private int scores[];
	private int count;

    // setter 메소드: setName(String name), setAge(int age),  setSubjects(String subjects[]), setScores(int scores[]), setCount(int num)
	
	public Student4(String name, int age, String[] subjects, int[] scores, int count) {
		this.name = name;
		this.age = age;
		this.subjects = subjects;
		this.scores = scores;
		this.count = count;
	}
	
	
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

	public void setCount(int num) {
		this.count = num;
	}


    // 학생 수를 반환하는 정적 메소드
	 public static int getCount(int count) {
	        return count;
	  }

    // 학생 정보를 출력하는 메소드 (예시용)
    public void printStudent() {
    	/*
    	 * 이름 = **, 나이 = **
    	 * 과목1 = **, 점수1 = **
    	 * 과목2 = **, 점수2 = **
    	 * ... 등으로 출력
    	 */
    	System.out.println("이름: " + name + ", 나이: " + age);
        for (int i = 0; i < scores.length; i++) {
        	System.out.println("과목: "+ subjects[i] + ", 점수: " + scores[i]);
        }
        System.out.println();
    	
    }

	
}

public class 실습6_1객체생성자미사용 {
	static Student4 makeStudent(String name, int age, String[] subjects, int[] scores, int value) {
    	Student4 s = new Student4(name, value, subjects, scores, value);
    	//setter를 사용한 구현
    	s.setName(name);
    	s.setAge(age);
    	s.setSubjects(subjects);
    	s.setScores(scores);
    	s.setCount(value);
        return s;
    }
	
    //showStudents() 메소드 구현 -printStudent() 메소드를 호출하여 구현
	public static void showStudents(Student4[] students) {
        for (Student4 student : students) {
            student.printStudent();  // 각 학생의 printStudent() 메소드 호출
        }
    }
	
    
	public static void main(String[] args) {
        String[] subjects = {"수학", "국어", "영어", "과학", "역사"};

        Student4[] students = {
        		 makeStudent("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, -1),
                 makeStudent("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, -1),
                 makeStudent("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, -1),
                 makeStudent("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, -1),
                 makeStudent("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, -1),
        };

        // 학생 정보 출력 (예시)
        showStudents(students);
    }
}
