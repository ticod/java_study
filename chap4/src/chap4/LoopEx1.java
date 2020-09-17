/*
 * 반복문 예제
 */
package chap4;

public class LoopEx1 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println();
		
		System.out.println("for 구문으로 출력");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("while 구문으로 출력");
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		System.out.println("do while 구문으로 출력");
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 5);
		System.out.println();
	}
}
