/*
 * notify(), notifyAll() / wait() - 생산자/소비자 스레드 예제 (사용 O)
 * 
 * 1. 동기화 영역에서만 호출이 가능
 * 2. Thread의 메서드가 아닌, Object 클래스의 멤버 메서드임
 *    => 모든 객체는 이 세 가지 메서드를 호출 가능
 * 3. wait()      : 현재 실행 중인 thread를 대기 상태로 변환, lock 해제
 * 4. notify()    : wait() 스레드 한 개를 Runnable 상태로 변환
 *                  개발자가 thread를 지정할 수 없다.
 * 5. notifyAll() : wait() 상태 thread 모두를 Runnable 상태로 변환
 */
package chap12;

class ATM2 implements Runnable {
	private int money = 100000;

	@Override
	public void run() {
		try {
			Thread.sleep((int) (Math.random() * 1000));
		} catch (InterruptedException e) {
		}
		synchronized (this) {
			while (true) {
				if (money <= 0) {
					notifyAll();
					break;
				}
				withdraw();
				if (money % 20000 == 0) {
					try {
						notifyAll();
						wait();
					} catch (InterruptedException e) {
					}
				}
			}
		}
	}

	private void withdraw() {
		if (money <= 0)
			return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + "출금, 잔액: " + money);
	}
}

public class ThreadEx11 {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread mother = new Thread(atm, "MOTHER");
		Thread son = new Thread(atm, "SON");
		mother.start();
		son.start();
	}
}
