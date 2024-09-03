package com.ruby.java.ch07.inheritance;

public class Employee extends Person{
	private String dept;

	public Employee() {
		super();
		System.out.println("Employee 생성자실행");
	}
	
	public Employee(String name, int age,  String dept) {
		super(name, age);
//		super();
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행");
	}
	

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
//	public String toString() {
//		return this.getName()+":"+this.getAge()+":"+dept;  // 오버라이딩
//	}
	
	public String toString() {
		return super.toString() + ":" + dept;
	}
	
	
	
//	public String toString() {
//		return name + ":" + age + ":" + dept;
//	} 
//	The field Person.name is not visible
//	The field Person.age is not visible
//	부모클래스 (Person)에 name과 age를 private로 만들었기때문에 변경이 불가능하다
	
}
