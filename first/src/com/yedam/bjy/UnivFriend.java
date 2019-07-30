package com.yedam.bjy;

public class UnivFriend extends Friend {
	String major;
	public UnivFriend() { super();}
	UnivFriend(String name, String phone, String major){
		super(name, phone);
		this.major =major;
	}
	@Override
	void showInfo() {
		System.out.println("이름은" + name + ", 연락처는" + phone + ", 전공은" +  major);
	}

}
