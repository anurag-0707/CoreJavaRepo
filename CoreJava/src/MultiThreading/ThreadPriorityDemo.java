package MultiThreading;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		MyThread001 t = new MyThread001();
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t.getPriority());
//		t.setPriority(7);
//		t.start();

/*		for(int i=105;i<110;i++) {
			System.out.println("Main Thread --- "+i);
		}
*/
	}

}
