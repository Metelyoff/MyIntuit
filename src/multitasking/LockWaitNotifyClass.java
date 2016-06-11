package multitasking;

public abstract class LockWaitNotifyClass implements Runnable {
	private Object lock = new Object();

	public void lock() {
		synchronized (lock) {
			try {
				System.out.println("1");
				lock.wait();
			} catch (InterruptedException e) {
			}
		}
	}

	public void unlock() {
		synchronized (lock) {
			lock.notify();
			System.out.println("2");
		}
	}

	public static void main(String[] args) {
		new Thread(new LockWaitNotifyClass() {
			public void run() {
				unlock();
			}
		}).start();
	}
}
