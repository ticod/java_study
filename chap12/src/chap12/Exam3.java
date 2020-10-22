/*
 * 스레드 활용 예제
 * ThreadEx6.java를 Runnable 방식으로 변경하기
 */
package chap12;

class Printer2 {
	public synchronized void printChar(char ch) {
		for (int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
	}
}

class PrintThread3Runnable implements Runnable {
	Printer2 p;
	char ch;

	PrintThread3Runnable(Printer2 p, char ch) {
		this.p = p;
		this.ch = ch;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			p.printChar(ch);
			System.out.println();
		}
	}
}

public class Exam3 {
	public static void main(String[] args) {
		Printer2 p = new Printer2();
		Thread thread = new Thread(new PrintThread3Runnable(p, 'A'));
		thread.start();
		new Thread(new PrintThread3Runnable(p, 'B')).start();
		new Thread(new PrintThread3Runnable(p, 'C')).start();
		new Thread(new PrintThread3Runnable(p, 'D')).start();
		new Thread(()->{
			for (int i = 0; i < 20; i++) {
				p.printChar('F');
				System.out.println();
			}
		}).start();
		
//		new Thread(new PrintThread3Runnable(new Printer2(), 'B')).start();
//		new Thread(new PrintThread3Runnable(new Printer2(), 'C')).start();
//		new Thread(new PrintThread3Runnable(new Printer2(), 'D')).start();
		/*
		 * 동기화 실패 = 객체 별로 동기화 메서드를 각각 보유하고 있음
		 */
	}
}
