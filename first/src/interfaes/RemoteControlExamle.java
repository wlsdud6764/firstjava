package interfaes;

public class RemoteControlExamle {

	public static void main(String[] args) {
		Television tv = new Television();
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc= new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		RemoteControl.changeBattery();
		
		RemoteControl anony = new RemoteControl() {
			private int volume;

		@Override
		public void turnOn() {
			System.out.println("익명구현 객체를 겹니다");
		}

		@Override
		public void turnOff() {
			System.out.println("익명구현 객체를 끕니다");
		}
		public void setVolume(int volume) {
			this.volume = volume;
			System.out.println("구현 객제의 현재 볼륨은" + this.volume + "입니다");
		}
		};
		anony.turnOff();
		anony.turnOn();
	}

}
