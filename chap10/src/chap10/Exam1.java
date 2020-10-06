/*
 * 화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 * 가로로 출력하기.
 * 99 숫자가 입력되면 프로그램 종료하기
 * 입력값이 숫자가 아닌 경우: Exception 예외를 발생시키고
 *    숫자만 입력하세요 메세지 출력하고, 다시 입력받도록 프로그램 수정
 * 입력값이 1~10의 범위가 아닌 경우: Exception 예외를 발생시키고,
 *    1~10까지의 숫자만 입력하세요 메세지 출력 후, 다시 입력받도록 프로그램 작성하기.
 */
package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(true) {
			try {
				System.out.print("1~10 숫자를 입력하세요(종료:99): ");
				num = scan.nextInt();
				if(num == 99) 
					break;
				if(num < 1 || num > 10) 
					throw new Exception("1~10까지의 숫자만 입력하세요");
				System.out.println(num + "\t: " + "*".repeat(num));
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				scan.nextLine();
			}
		}
	}
}
