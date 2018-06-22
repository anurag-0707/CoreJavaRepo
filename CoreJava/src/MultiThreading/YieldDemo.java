package MultiThreading;

public class YieldDemo {
	MyThread02 mt2 = new MyThread02();

}

final class MyThread02 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread " + i);
		}
	}
}