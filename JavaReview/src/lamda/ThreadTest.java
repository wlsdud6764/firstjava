package lamda;

public class ThreadTest {
	public static void main(String[] args) {

		// 외부구현클래스
		Thread thread = new Thread(new Task1());
		thread.start();
		// 익명클래스
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1000; i < 1100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread2.start();
		for (int i = 200; i < 300; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//람다식 표현
		Thread thread3 = new Thread(() -> {
			for (int i = 400; i < 500; i++) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread3.start();
	}
}