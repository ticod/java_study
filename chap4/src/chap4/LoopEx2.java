/*
 * 반복문을 이용하여 1부터 10까지 합 구하기
 */
package chap4;

public class LoopEx2 {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		System.out.println("for 구문");
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합(for): " + sum);
		
		sum = 0;
		i = 1;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1부터 10까지의 합(while): " + sum);
		
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while(i <= 10);
		System.out.println("1부터 10까지의 합(while): " + sum);
	}
}
