/*
 * 동기화 블럭 예제 : synchronized 예약어
 *  *) 동기화 메서드 : thread-safe method (ThreadEx6 예제)
 */
package chap12;

class PrintThread2 extends Thread {
	char ch;
	PrintThread2(char ch) {
		this.ch = ch;
	}
	static Object lock = new Object(); // static으로 모든 스레드가 공유할 수 있다.
//	Object lock = new Object(); => 동기화 효과가 없다.
	/*
	 * lock =
	 *   1. 객체여야 한다. (기본형은 불가능하다. => synchronized 예약어에서 사용 불가능)
	 *      즉, 위 예제에서 lock은 String, Integer로도 가능하다. int, char 등으로는 불가능하다.
	 *   2. 모든 thread가 공유하는 객체여야 한다.
	 *      lock Object를 획득한 thread만이 접근할 수 있다.
	 */
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (lock) { // 동기화 영역 (동기화 블럭)
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}

public class ThreadEx5 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		t1.start(); t2.start(); t3.start();
	}
}
