package multitasking;

public abstract class SomeClassWithoutYield implements Runnable {
	public final static Object one = new Object(), two = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (one) {
					synchronized (two) {
						System.out.print("1");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (two) {
					synchronized (one) {
						System.out.print("2");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
