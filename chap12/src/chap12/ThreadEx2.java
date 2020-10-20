/*
 * Runnable 인터페이스를 이용한 thread 객체 생성
 */
package chap12;

class Runnable1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " 스레드 시작");
		Runnable1 r = new Runnable1();
		Thread t1 = new Thread(r, "First");
		Thread t2 = new Thread(r, "Second");
		t1.start(); t2.start();
		System.out.println(Thread.currentThread().getName() + " 스레드 종료");
	}
}
