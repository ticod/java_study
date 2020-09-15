package chap3;
/*
 * 화면에서 3자리 정수를 입력받아 100 미만을 버리고 출력하기
 * [결과]
 * 세 자리 정수를 입력하세요.
 * 321
 * 300
 */
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		System.out.println("세 자리 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = num - (num % 100);
		System.out.println(result);
	}
}
