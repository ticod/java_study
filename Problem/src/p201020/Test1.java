/*
1. ThreadEx3.java 소스를 Runnable 인터페이스 구현 방식으로 변경하여 같은 결과가 출력되도록
   구현하기
 */
package p201020;

class ThreadPriority implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(20);
		} catch(InterruptedException e) {}
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread());
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println("main start");
		ThreadPriority tp = new ThreadPriority();
		Thread[] threads = new Thread[5];
		for (int i = 0; i < 5; i++) {
			threads[i] = new Thread(tp, i + 1 + " thread");
			threads[i].setPriority((i+1)*2);
		}
		for (Thread t : threads) {
			t.start();
		}
		System.out.println("main end");
	}
}
