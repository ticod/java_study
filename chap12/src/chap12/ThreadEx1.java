/*
 * Thread 객체 생성하기
 * 1. Thread 클래스의 하위 클래스로 Thread 객체 생성 => 다른 클래스 상속 불가능
 * 2. Runnable 인터페이스를 구현한 객체를 이용하여 Thread 객체 생성
 *    => Runnable 인터페이스 구현한 객체는 Thread가 아니다.
 */
package chap12;

class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}
	// run() : 스레드가 실행해야 할 기능, 오버라이딩 필수
	@Override
	public void run() { // 3. Running 상태 => run 메서드 실행 중
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "=" + getName());
			try {
				sleep(1000); // 4. 대기 상태 (wait, lock), 실행 X
				// 대기 상태 해제되면 Runnable 상태로 변경됨.
			} catch (InterruptedException e) {

			}
		}
	} // 5. Dead 상태 : Thread의 실행 종료 => 스택에서 제거

}

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread1 t1 = new Thread1("First");	// 1. new 상태
		Thread1 t2 = new Thread1("Second");	// 1. new 상태
		t1.start(); t2.start();				// 2. runnable 상태
		/*
		 * start() : 스레드의 시작
		 *   1. 스택 영역을 나눠 동시에 병렬화 함. => main도 하나의 스레드
		 *   2. 병렬화된 스택 영역에 run() 메서드 호출
		 */
		System.out.println("main 스레드 종료");
	}
}
