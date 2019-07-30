package com.yedam.bjy;

public class Student {

	private String name;
	private String major;
	private int age;
	private double hight;
	
	
	
	public Student(String name, String major, int age, double hight) {
		super();
		this.name = name;
		this.major = major;
		this.age = age;
		this.hight = hight;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	Student() {//리턴타입이 없으면 생성자
	}
	
	Student(String name,String major, int age){//똑같은 생성자를 만들어도 매개변수의 타입이 다르것나 매개변수의 개수가다르면 된다 //모두 같은 경우 오버로딩이 일어난다
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	
	
	public void study() {//리턴타입이 있으면 메소드
		System.out.println(name + "가 공부합니다");
	}
	
	public void introduce() {
		System.out.println("전공은" + major + "이고 나이는 " + age + "입니다");
		
	}
	public void showHeight() {
		System.out.println("키는" + hight + "cm 입니다");
	}
	
	}


