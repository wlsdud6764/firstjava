package co.yedam.app.thread;

public class EvenprintThreed implements Runnable{// extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 100; i+=2) {
			System.out.println(this.getClass().getName());
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
