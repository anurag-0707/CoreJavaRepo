package MultiThreading;

public class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		t2.start();
		for (int j = 115; j < 120; j++) {
			System.out.println("Main Thread ---" + j);
		}

	}

}
