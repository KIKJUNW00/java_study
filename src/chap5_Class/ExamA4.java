//package chap5_Class;
//
//import java.util.Iterator;
//
////	클래스 Student를 사용하여 학생 이름, 과목배열, 성적배열을 객체로 생성
////	필드
//class Student{
//	private String name;
//	private String subject[];
//	private int scores[];
//	private int criteria[];
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String[] getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String[] subject) {
//		this.subject = subject;
//	}
//
//	public int[] getScores() {
//		return scores;
//	}
//
//	public void setScores(int[] scores) {
//		this.scores = scores;
//	}
//
//	public int[] getCriteria() {
//		return criteria;
//	}
//
//	public void setCriteria(int[] criteria) {
//		this.criteria = criteria;
//	}
//
//	
//	
//	public int sumScore() {
//		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		return sum;
//	}
//	
//	public int average() {
//		int avg = 0 ;
//		avg = sumScore() / scores.length;
//		return avg;
//	}
//	
//	void isPassed() {
//		for (int i = 0; i < subject.length; i++) {
//			String
//		}
////		for (int j = 0; j < subjs.length; j++) {
////			String hapbul = (scores[i][j] >= criteria[j]) ? "통과" : "과락";
////			System.out.println("\t" + subjs[j] + " : " + scores[i][j] + " => " + hapbul);
////		}
//	}
//}
////	name, criteria, scores를 모두 private으로 선언
////	 필요한 getter 또는 setter 만 추가
////	메서드
////	average(), sumScore(), isPassed() 를 구현
////
//
//public class ExamA4 {	
//	public static void main(String[] args) {
//		
//		// 과목 배열 정의
//		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };
//		// 과목별 통과 기준 배열 정의
//		int[] criteria = { 50, 60, 70, 80, 90 };
//		// 학생 배열 생성
//		Student[] students = { 
//				new Student("홍길동", subjects, criteria, new int[] { 85, 90, 78, 88, 92 }),
//				new Student("김유신", subjects, criteria, new int[] { 75, 80, 85, 90, 95 }),
//				new Student("계백", subjects, criteria, new int[] { 65, 70, 75, 80, 85 }),
//				new Student("강감찬", subjects, criteria, new int[] { 95, 92, 88, 84, 91 }),
//				new Student("을지문덕", subjects, criteria, new int[] { 88, 76, 85, 79, 90 }) 
//				};
//
////		각 학생의 성적 테이블 출력: 학생 이름, 총점, 평균, 과목별 점수, 과목별 통과여부
////		과목별 최대/최소 점수 및 해당 학생 이름 출력: 과목명, 최대 점수, 최소 점수, 최대점수 학생, 최소점수 학생
//		
//
//	}
//}
