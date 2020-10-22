/*
 * InterruptedException 예외 & thread 정리
 * 
 * * Thread method
 * 1. start()       : 병렬화 기능, run() 메서드 호출
 *                    new 상태 => Runnable 상태
 * 2. run()         : thread가 실행하는 메서드, 오버라이딩 필요
 * 3. setPriority() : 우선순위 설정 (1 ~ 10)
 *                    단, 항상 먼저 시작하고 먼저 끝나지는 않는다.
 * 4. sleep()       : thread가 ms동안 wait(대기) 상태
 * 5. join()        : 해당 thread가 종료할 때까지 대기
 *                    join() 메서드를 호출한 thread가 대기한다.
 * 6. setDaemon()   : Daemon thread로 설정
 *                    new 상태에서만 메서드 호출 가능
 * 7. interrupt()   : 인터럽트 발생 -> InterruptedException 발생시킨다.
 * 8. yield()       : Running 상태의 thread를 Runnable 상태의 thread로 변경한다.
 * 9. stop()        : thread 강제 종료 (사용하지 않도록 권고)
 * 
 * thread 구현 - extends Thread / implements Runnable
 *             => 둘 다 run() 메서드를 구현해야 한다.
 *                Runnable의 경우 Thread 인스턴스를 생성해야 한다.
 * 
 * 동기화 영역 : synchronized
 *   동기화 블럭   : lock 설정 (공유 object => static 또는 동일 객체)
 *   동기화 메서드 : 공유 객체의 메서드여야함
 *   
 * 
 */
package chap12;

class InterruptThread extends Thread {
	public void run() {
		System.out.println("자고 있습니다. 깨우지 마세요");
		try {
			sleep(10000000);
		} catch (InterruptedException e) {
			System.out.println("누가 깨웠니?");
			e.printStackTrace();
		}
	}
}

public class ThreadEx9 {
	public static void main(String[] args) throws InterruptedException {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);
		t1.interrupt();
	}
}
