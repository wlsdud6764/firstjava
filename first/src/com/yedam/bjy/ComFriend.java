package com.yedam.bjy;

public class ComFriend extends Friend{
	String department;
	
	public ComFriend() { super();}
	ComFriend(String name, String phone, String major){
		super(name, phone);
		this.department = department;
	}
	@Override
	void showInfo() {
		System.out.println("이름은" + name + ", 연락처는" + phone + ", 전공은" +  department);
	}

}
