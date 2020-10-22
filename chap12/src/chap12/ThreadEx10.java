/*
 * notify(), notifyAll() / wait() - 생산자/소비자 스레드 예제 (사용 X)
 */
package chap12;

class ATM implements Runnable {
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
					break;
				}
				withdraw();
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

public class ThreadEx10 {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "MOTHER");
		Thread son = new Thread(atm, "SON");
		mother.start();
		son.start();
	}
}
