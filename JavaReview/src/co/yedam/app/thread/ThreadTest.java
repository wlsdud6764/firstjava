package co.yedam.app.thread;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable runnable =() ->{
			for (int i = 0; i < 101; i+=3) {
				System.out.println(i);}
			try {
				Thread.sleep(100);//다른 구문과 출력이 겹치지 않기 위해서 사용  주로 채팅에 쓰임
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		Thread thread = new Thread();
		thread.start();
//		Thread thread = new Thread(new EvenprintThreed());
//		thread.start();
//		Thread thread1 = new Thread(new EvenprintThreed());
//		thread1.start();

//		EvenprintThreed envenThread = new EvenprintThreed();
//		envenThread.start(); //run() 메서드 호출
		// main thread,생성된 thread 동시에 실행
//		for (int i = 0; i < 101; i+=2) {
//			System.out.println(i);
//			try {
//				Thread.sleep(100);//다른 구문과 출력이 겹치지 않기 위해서 사용  주로 채팅에 쓰임
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//		}
//	}

	}
}
