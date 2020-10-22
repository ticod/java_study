/*
 * Thread 우선순위 : 스케쥴러에게 빠른 선택을 받을 수 있도록 (Runnable -> Running)
 *                   우선순위를 설정할 수 있다.
 *                   우선순위가 높다고 해서 무조건 먼저 선택되는 것은 아님. 확률이 높음
 *                   => 개발자가 먼저 실행할 스레드를 결정할 수는 없다.
 * 낮은 우선순위 : 1 (MIN_PRIORITY)
 * 중간 우선순위 : 5 (NORM_PRIORITY)
 * 높은 우선순위 : 10 (MAX_PRIORITY)
 * 
 * notify, lock, full?pool?
 */
package chap12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ThreadPriority extends Thread {
	ThreadPriority(String name) {
		this(name, Thread.NORM_PRIORITY);
	}
	
	ThreadPriority(String name, int p) {
		super(name);
		this.setPriority(p);
	}
	
	@Override
	public void run() {
		try {
			sleep(20);
		} catch(InterruptedException e) {}
		for (int i = 0; i < 5; i++) {
			System.out.println(this);
			/*
			 * this = Thread 클래스의 toString 메서드 호출
			 * Thread[First, 1, main]
			 * 이름, 우선순위, Thread 그룹 (그룹을 만들어 사용할 수 있다)
			 */
		}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("높은 우선순위 : " + Thread.MAX_PRIORITY);
		System.out.println("기본 우선순위 : " + Thread.NORM_PRIORITY);
		System.out.println("낮은 우선순위 : " + Thread.MIN_PRIORITY);
		Thread t1 = new ThreadPriority("First", Thread.MIN_PRIORITY);
		Thread t2 = new ThreadPriority("Second");
		Thread t3 = new ThreadPriority("Third", Thread.MAX_PRIORITY);
		t1.start(); t2.start(); t3.start();
		System.out.println("main 종료");
	}
}
