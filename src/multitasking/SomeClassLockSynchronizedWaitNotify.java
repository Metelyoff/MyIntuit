package multitasking;

abstract class SomeClassLockSynchronizedWaitNotify implements Runnable{
	public static Object lock=new Object();
	public void lock(){
		synchronized (lock) {
			try{
				lock.wait();
				System.out.println("lock.wait()");
			}catch(InterruptedException e){}
		}
	}
	public void notifyThread(){
		synchronized (lock) {
			lock.notify();
			System.out.println("notifyThread()");
		}
	}
	public void unlock(){
		synchronized (lock) {
			lock.notify();
			System.out.println("unlock()");
		}
	}
	public static void main(String[] args) {
		final SomeClassLockSynchronizedWaitNotify c=
				new SomeClassLockSynchronizedWaitNotify() {
			public void run() {
				lock();
				notifyThread();
			}
		};
		final SomeClassLockSynchronizedWaitNotify c1=
				new SomeClassLockSynchronizedWaitNotify() {
			public void run() {
				unlock();
			}
		};
		new Thread(c).start();
		new Thread(c1).start();
	}
}
