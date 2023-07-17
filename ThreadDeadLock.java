package threads;

public class ThreadDeadLock {
	public static void main(String[] args) throws InterruptedException {
		System.out.print("\nMain started....");		
		WorkA th1 = new WorkA();
		WorkB th2 = new WorkB();		
		th1.start();	
		th1.join();
		th2.start();		
		System.out.print("\nMain ended....");
	}
}
class  Resource {
	public static Object obj1 = new Object();
	public static Object obj2 = new Object(); 
}

class WorkA extends Thread{
	public void run() {
		System.out.print("\nUser1 trying to lock obj1");
		synchronized (Resource.obj1) { // synchronized block starts by locking obj1
			System.out.print("\nUser1 holding lock on obj1");
			System.out.print("\nUser1 trying to lock on obj2");
			synchronized (Resource.obj2) { // starts locking obj2
				System.out.print("\nUser1 holding lock on obj2");
			} // obj2 is released
		} // obj1 is released
		System.out.print("\nUser1 completed....");
	}	
}

class WorkB extends Thread {
	public void run() {
		System.out.print("\nUser2 trying to lock obj2");
		synchronized (Resource.obj2) {
			System.out.print("\nUser2 holding lock on obj2");
			System.out.print("\nUser2 trying to lock on obj1");
			synchronized (Resource.obj1) {
				System.out.print("\nUser2 holding lock on obj1");
			}
		}
		System.out.print("\nUser2 completed....");		
	}
}
