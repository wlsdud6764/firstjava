package com.yedam.bjy;

public class Cellphone {
	String model;
	String color;
	public Cellphone() {}
	public Cellphone(String model , String color) {
		this.model = model;
		this.color = color;
	}
		
     void powerOn() {System.out.println("전원을 켠다");}
	 void powerOff() {System.out.println("전원을 끈다");}
	 void bell() {System.out.println("벨을 울린다");}
}

	
	