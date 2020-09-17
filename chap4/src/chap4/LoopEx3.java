/*
 * 중첩 반복문 : 반복문 내부에 반복문이 존재
 */
package chap4;

public class LoopEx3 {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}	
	}
}
