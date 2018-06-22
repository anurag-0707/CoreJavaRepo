package MultiThreading;

public class GetSetNameMethodOfThread {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		Thread.currentThread().setName("Anurag");
		t.setName("Shrivastava");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
	}

}

final class MyThread extends Thread {

}