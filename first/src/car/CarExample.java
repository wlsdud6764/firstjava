package car;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 6; i++) {
			int errorLocation = car.run();
			switch(errorLocation) {
			case 1:
				System.out.println("앞왼쪽 => HankookTire 교체");
				car.frontLeft = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 => KumhoTire 교체");
				car.frontRight = new KumhoTire("앞오른쪽", 14);
				break;
			case 3:
				System.out.println("뒤왼쪽 => HankookTire 교체");
				car.backLeft = new HankookTire("뒤왼쪽", 16);
				break;
			case 4:				
				System.out.println("뒤오른쪽 => KumhoTire 교체");
				car.backRight = new KumhoTire("뒤오른쪽", 13);
				break;
			}
			System.out.println("---------------------------");
		}
	}
}
