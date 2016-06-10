package multitasking;

public class TestDeamonThread implements Runnable {

	// Отдельная группа, в которой будут
	// находиться все потоки ThreadTest
	public final static ThreadGroup GROUP = new ThreadGroup("Daemon demo");

	// Стартовое значение, указывается при создании объекта
	private int start;

	public TestDeamonThread(int s) {
		start = (s % 2 == 0) ? s : s + 1;
		new Thread(GROUP, this, "Thread " + start).start();
	}

	public void run() {
		// Начинаем обратный отсчет
		for (int i = start; i > 0; i--) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
			// По достижении середины порождаем
			// новый поток с половинным начальным
			// значением
			if (start > 2 && i == start / 2) {
				new TestDeamonThread(i);
			}
		}
	}

	public static void main(String s[]) {
		new TestDeamonThread(16);
		new DaemonDemo();
	}
}

class DaemonDemo extends Thread {
	public DaemonDemo() {
		super("Daemon demo thread");
		setDaemon(true);
		start();
	}

	public void run() {
		Thread threads[] = new Thread[10];
		while (true) {
			// Получаем набор всех потоков из
			// тестовой группы
			int count = TestDeamonThread.GROUP.activeCount();
			if (threads.length < count)
				threads = new Thread[count + 10];
			count = TestDeamonThread.GROUP.enumerate(threads);

			// Распечатываем имя каждого потока
			for (int i = 0; i < count; i++) {
				System.out.print(threads[i].getName() + ", ");
			}
			System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}