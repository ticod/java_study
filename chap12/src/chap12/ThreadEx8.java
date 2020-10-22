/*
 * Daemon Thread
 *  1. 일반 스레드의 보조 역할 담당 (보통 무한 루프 처리)
 *     ex) GC - 일반 스레드 (main method)가
 *              언제 종료될지 모르므로 무한 루프 처리
 *  2. 일반 스레드가 종료되면 데몬 스레드도 종료됨
 *  3. setDaemon(true)
 *     => New 상태에서만 설정 가능
 */
package chap12;

class DaemonThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println(this);
			try {
				sleep(100);
			} catch (Exception e) {}
		}
	}
}

public class ThreadEx8 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		Thread.sleep(2000);
		System.out.println("main 스레드 종료");
	}
}
