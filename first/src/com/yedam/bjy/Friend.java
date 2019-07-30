package com.yedam.bjy;

public class Friend {
	String name;
	String phone;
	Friend(){}
	Friend(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	void showInfo() {
		System.out.println("이름은" + name + ", 연락처는" + phone);
	}
}
