package com.ruby.java.ch07.abstraction;

import java.util.Iterator;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
	
}

class Saleman extends Employee{
	int annual_sales;//연간 판매 실적
	
	public void calcSalary() {
		System.out.println("Saleman 급여 = 기본급 + 판매수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Saleman 보너스 = 기본급 *12 * 4");
		
	}
	
}


class Consultant extends Employee{
	int num_project;//컨설팅 참여수
	
	public void calcSalary() {
		System.out.println("Counsultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	
	@Override
	public void calcBonus() {
		System.out.println("Counsultant 보너스 = 기본급 *12 * 2");
		
	}
	
	
}

//abstract class Manager extends Employee{
class Manager extends Employee{
	int num_team; //관리 팀 수
	
	
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급 *12 *6");
		
	}
	
}

class Director extends Manager{

	@Override
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 *12 * 6");
		
	}
	
}

public class HRDTest {
	
//	public static void calcTax(Employee e) {
//		System.out.println("소득세를 계산합니다.");
//	}
	
	
	public static void main(String[] args) {
		
		
		Saleman s = new Saleman();
		Consultant c = new Consultant();
		Director d = new Director();
		
//		Saleman s1 = new Saleman();
//		Employee s2 = new Saleman();
//		Object s3 = new Saleman();
//		
//		Object m1 = new Manager();
//		Employee m2 = new Manager();
//		Manager m3 = new Manager();
//		
//		
//		Object arr[] =new Object[6];
//		arr[0] = s1;
//		arr[1] = s2;
//		arr[2] = s3;
//		arr[3] = m1;
//		arr[4] = m2;
//		arr[5] = m3;
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		
//		if (s.equals(c)) {
//			System.out.println("같은 객체입니다.");
//		} else {
//			System.out.println("다른 객체입니다.");
//		}
//		
//		s.calcBonus();
//		c.calcBonus();
//		d.calcBonus();
//		
//		calcTax(s);
//		calcTax(c);
//		calcTax(d);
//		
		
		
	}
}
