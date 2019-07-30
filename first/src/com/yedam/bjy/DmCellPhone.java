package com.yedam.bjy;

public class DmCellPhone extends Cellphone {
	int channel;
	public DmCellPhone() {super();}
	public DmCellPhone(String model, String color, int channel) {
		super(model,color);
		this.channel = channel;
		
	}
	@Override//재정의
	void powerOn() {System.out.println("DBM 전원 켠다");}
	void turnOnDmb() {
		System.out.println("채널" + channel +"방송수신.");}
	void turnOffDmb() {
		System.out.println("DBM 방송수신 중단합니다" );}
	void changeChannel(int channel) {
		System.out.println("채널" + channel +"으로 변경.");}
		
	

	
}
