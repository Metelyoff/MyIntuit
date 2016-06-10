package multitasking;

public class ThreadWaitNotifyAllTest implements Runnable {
	final static private Object shared = new Object();
	private int type;

	public ThreadWaitNotifyAllTest(int i) {
		type = i;
	}

	public void run() {
		if (type == 1 || type == 2) {
			synchronized (shared) {
				try {
					shared.wait();
				} catch (InterruptedException e) {
				}
				System.out.println("Thread " + type + " after wait()");
			}
		} else {
			synchronized (shared) {
				shared.notifyAll();
				System.out.println("Thread " + type + " after notifyAll()");
			}
		}
	}

	public static void main(String s[]) {
		ThreadWaitNotifyAllTest w1 = new ThreadWaitNotifyAllTest(1);
		new Thread(w1).start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		ThreadWaitNotifyAllTest w2 = new ThreadWaitNotifyAllTest(2);
		new Thread(w2).start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		ThreadWaitNotifyAllTest w3 = new ThreadWaitNotifyAllTest(3);
		new Thread(w3).start();
	}
}
