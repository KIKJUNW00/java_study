package chap6;

public class Member_This {
	private String name;
	private int age;
	
	public Member_This() {
		this("guest");
	}
	
	public Member_This(String name) {
		this(name, 0);
	}
	
	public Member_This(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
	
	public static void main(String[] args) {
		Member_This m1 = new Member_This();
		Member_This m2 = new Member_This("Amy");
		Member_This m3 = new Member_This("Amy", 32);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}
