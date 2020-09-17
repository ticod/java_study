/*
 * 1부터 100까지 숫자 중 2의 배수, 3의 배수가 아닌 수의 합을 구하기
 */
package chap4;

public class Exam7 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0 || i % 3 == 0) continue;
			sum += i;
//			if(i % 2 != 0 && i % 3 != 0) sum += 1; // 이 코드와 동일
		}
		System.out.println("수의 합은: " + sum);
	}
}
