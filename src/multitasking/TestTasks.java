package multitasking;

public class TestTasks {

	public static void main(String[] args) {
		// For Thread class
		MyThread myThread = new MyThread();
		myThread.start();
		// For Runnable interface
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
