package drive;


class Vechicle{
	void run() {
		System.out.println("자동차가 달립니다");
	}
}
	
class Bus extends Vechicle{
		@Override
		void run() {
			System.out.println("버스가 달립니다");
		}
	}

class Taxi extends Vechicle{
	@Override
	void run() {
		System.out.println("택시가 달립니다");
	}
}
	

class Driver{
	void drive(Vechicle vechicle) {
		vechicle.run();
	}
}

public class DriveExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vechicle v = new Vechicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(v);
		driver.drive(bus);
		driver.drive(taxi);

	}
}
