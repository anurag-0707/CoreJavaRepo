package MultiThreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 221; i < 225; i++) {
			System.out.println("Runnable thread --- "+i);
		}

	}

}
