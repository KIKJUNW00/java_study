package chap6;

public class Member {
	private String name;
	private int age;
	
	public Member() {
		System.out.println("Member() 생성자 실행");
	}
	
	public Member(String name) {
		System.out.print("Member() 생성자 실행");
		System.out.println(name);
	}
	
	public Member(String name, int age) {
		System.out.print("Member() 생성자 실행");
		System.out.println(name+" : "+ age);
	}
	
	public void SetName(String nema) {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main() 메서드 실행");
		new Member();
		new Member("Amy");
		new Member("Amy",20);
	}
}