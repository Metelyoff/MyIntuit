package multitasking;

public class TestSynchronizedMethod implements Runnable {
	private static TestSynchronizedMethod shared = new TestSynchronizedMethod();

	public void process() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			Thread.yield();
		}
	}

	public void run() {
		// shared.process();
		synchronized (shared) {
			shared.process();
		}
	}

	public static void main(String s[]) {
		for (int i = 0; i < 3; i++) {
			new Thread(new TestSynchronizedMethod(), "Thread-" + i).start();
		}
	}
}