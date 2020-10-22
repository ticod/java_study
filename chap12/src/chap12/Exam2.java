/*
 * 스레드 활용 예제
 * ThreadEx5.java를 Runnable 방식으로 변경하기
 */
package chap12;

class PrintThread2Runnable implements Runnable {
	char ch;

	PrintThread2Runnable(char ch) {
		this.ch = ch;
	}
	
	static Object lock = new Object();
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (lock) {
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintThread2Runnable('A'));
		Thread t2 = new Thread(new PrintThread2Runnable('B'));
		Thread t3 = new Thread(new PrintThread2Runnable('C'));
		Thread t4 = new Thread(()->{
			for (int i = 0; i < 20; i++) {
				synchronized (PrintThread2Runnable.lock) {
					for (int j = 0; j < 80; j++) {
						System.out.print('D');
					}
				}
				System.out.println();
			}
		});
		t1.start(); t2.start(); t3.start(); t4.start();
		new Thread(()->{
			for (int i = 0; i < 20; i++) {
				synchronized (PrintThread2Runnable.lock) {
					for (int j = 0; j < 80; j++) {
						System.out.print('E');
					}
				}
				System.out.println();
			}
		}).start();
	}
}
