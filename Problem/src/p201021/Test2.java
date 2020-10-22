/* 1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 
  : Runnable 인터페이스를 구현하는 방식으로 구현하기
t1 : 1 ~ 200까지 합
t2 : 201 ~400까지 합
t3 : 401 ~ 600까지 합
t4 : 601 ~ 800까지 합
t5 : 801 ~ 1000까지 합

main 스레드 : 모든 스레드가 종료할때 까지 기다렸다가 
모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램 구현하기 */
package p201021;

class SumCalculator {
	private final int threadCount;
	private final int target;
	private Thread[] t = null;
	private long sum = 0;
	
	
	SumCalculator(int target, int threadCount) {
		this.target = target;
		this.threadCount = threadCount;
		initThread();
	}
	
	static Object lock = new Object();
	
	private void initThread() {
		t = new Thread[threadCount];
		for (int i = 0; i < threadCount; i++) {
			int j = i;
			t[i] = new Thread(()->{
				long temp = 0;
				temp = calcThread((target/threadCount*j)+1, (target/threadCount*(j+1)));
				calc(temp);
			});
		}
	}
	
	private long calcThread(int start, int end) {
		long temp = 0;
		for (int i = start; i <= end; i++) {
			temp += i;
			System.out.println(i); // 제대로 작동하는지 확인
		}
		return temp;
	}
	
	private synchronized void calc(long temp) {
		sum += temp;
	}
	
	public void startCalc() {
		for (int i = 0; i < threadCount; i++) {
			t[i].start();
		}
	}
	
	public void waitCalc() {
		try {
			for (int i = 0; i < threadCount; i++) {
				t[i].join();
			}
		} catch (InterruptedException e) {}
	}
	
	public long getSum() {
		return sum;
	}
}

public class Test2 {
	public static void main(String[] args) {
		final int target = 1000000;
		final int threadCount = 10;
		SumCalculator sc = new SumCalculator(target, threadCount);
		sc.startCalc(); // Thread.start();
		sc.waitCalc();  // Thread.join();
		System.out.println("1~"+target+" 까지의 합: " + sc.getSum());
	}
}
