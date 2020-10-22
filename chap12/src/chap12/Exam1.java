/*
 * 스레드 활용 예제
 * ThreadEx4.java를 Runnable 방식으로 변경하기
 */
package chap12;

class PrintThread1Runnable implements Runnable {
	char ch;
	PrintThread1Runnable(char ch) {
		this.ch = ch;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 80; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

abstract class A implements Runnable {}

public class Exam1 {
	public static void main(String[] args) {
		PrintThread1Runnable pt1r1 = new PrintThread1Runnable('A');
		PrintThread1Runnable pt1r2 = new PrintThread1Runnable('B');
		PrintThread1Runnable pt1r3 = new PrintThread1Runnable('C');
		Thread t1 = new Thread(pt1r1);
		Thread t2 = new Thread(pt1r2);
		Thread t3 = new Thread(pt1r3);
		Thread t4 = new Thread(()->{
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 80; j++) {
					System.out.print('D');
				}
				System.out.println();
			}
		});
		t1.start(); t2.start(); t3.start(); t4.start();
	}
}
