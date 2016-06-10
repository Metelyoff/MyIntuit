package multitasking;

public class TestPriorityThreads implements Runnable {
	public void run() {
		double calc;
		for (int i = 0; i < 50000; i++) {
			calc = Math.sin(i * i);
			if (i % 10000 == 0) {
				System.out.println(getName() + " counts " + i / 10000);
			}
		}
	}

	public String getName() {
		return Thread.currentThread().getName();
	}

	public static void main(String s[]) {
		/*
		 * //Without priority // Подготовка потоков Thread t[] = new Thread[3];
		 * for (int i = 0; i < t.length; i++) { t[i] = new Thread(new
		 * TestPriorityThreads(), "Thread " + i); } // Запуск потоков for (int i
		 * = 0; i < t.length; i++) { t[i].start();
		 * System.out.println(t[i].getName() + " started"); }
		 */
		// Подготовка потоков
		Thread t[] = new Thread[3];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(new TestPriorityThreads(), "Thread " + i);
			t[i].setPriority(Thread.MIN_PRIORITY + (Thread.MAX_PRIORITY - Thread.MIN_PRIORITY) / t.length * i);
		}

		// Запуск потоков
		for (int i = 0; i < t.length; i++) {
			t[i].start();
			System.out.println(t[i].getName() + " started");
		}
	}
}
