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

	Student() {//����Ÿ���� ������ ������
	}
	
	Student(String name,String major, int age){//�Ȱ��� �����ڸ� ���� �Ű������� Ÿ���� �ٸ��ͳ� �Ű������� �������ٸ��� �ȴ� //��� ���� ��� �����ε��� �Ͼ��
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	
	
	public void study() {//����Ÿ���� ������ �޼ҵ�
		System.out.println(name + "�� �����մϴ�");
	}
	
	public void introduce() {
		System.out.println("������" + major + "�̰� ���̴� " + age + "�Դϴ�");
		
	}
	public void showHeight() {
		System.out.println("Ű��" + hight + "cm �Դϴ�");
	}
	
	}


