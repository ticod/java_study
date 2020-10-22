/* 1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 
  : Thread 클래스를 상속받는 방식으로 구현하기
t1 : 1 ~ 200까지 합
t2 : 201 ~400까지 합
t3 : 401 ~ 600까지 합
t4 : 601 ~ 800까지 합
t5 : 801 ~ 1000까지 합

main 스레드 : 모든 스레드가 종료할때 까지 기다렸다가 
모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램 구현하기 */
package p201021;

class SumThread extends Thread {
	int start, end;
	static int sum = 0;
	
	SumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	static Object lock = new Object();
	
	@Override
	public void run() {
		synchronized (lock) {
			for (int i = start; i <= end; i++) {
				sum += i;
				System.out.println(i); // 제대로 작동하는지 확인
			}
		}
	}

}

public class Test1 {
	public static void main(String[] args) {
		final int target = 1000;
		final int threadCount = 5;
		SumThread[] t = new SumThread[threadCount];
		for (int i = 0; i < threadCount; i++) {
			t[i] = new SumThread((target/threadCount*i)+1, (target/threadCount*(i+1)));
			t[i].start();
		}
		try {
			for (int i = 0; i < threadCount; i++) {
				t[i].join();
			}
		} catch (InterruptedException e) {}
		System.out.println("1~1000 까지의 합: " + SumThread.sum);
	}
}
