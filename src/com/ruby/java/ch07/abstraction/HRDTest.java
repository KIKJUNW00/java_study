package com.ruby.java.ch07.abstraction;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
	
}

class Saleman extends Employee{
	public void calcSalary() {
		System.out.println("Saleman 급여 = 기본급 + 판매수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Saleman 보너스 = 기본급 *12 * 4");
		
	}
	
	
}


class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Counsultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	
	@Override
	public void calcBonus() {
		System.out.println("Counsultant 보너스 = 기본급 *12 * 2");
		
	}
	
	
}

abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
	
}

class Director extends Manager{

	@Override
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 *12 * 6");
		
	}
	
}

public class HRDTest {
	public static void main(String[] args) {
		Saleman s = new Saleman();
		Consultant c = new Consultant();
		Manager m = new Director();

		
		s.calcBonus();
		c.calcBonus();
		m.calcBonus();
		
		
	}
}
