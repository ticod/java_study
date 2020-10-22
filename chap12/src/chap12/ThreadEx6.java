/*
 * 동기화 메서드 예제 :
 */
package chap12;

class PrintThread3 extends Thread {
	Printer ptr;
	char ch;

	PrintThread3(Printer ptr, char ch) {
		this.ptr = ptr;
		this.ch = ch;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			ptr.printChar(ch);
		}
	}
}

class Printer {
	public synchronized void printChar(char ch) {
		for (int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

public class ThreadEx6 {
	public static void main(String[] args) {
		Printer p = new Printer();
		PrintThread3 t1 = new PrintThread3(p, 'A');
		PrintThread3 t2 = new PrintThread3(p, 'B');
		PrintThread3 t3 = new PrintThread3(p, 'C');
		t1.start(); t2.start(); t3.start();
	}
}
