package chap3;
/*
 * 숫자를 입력받아서 양수인 경우는 "양수", 음수인 경우 "음수", 0인 경우 "영"을 출력하기
 */
import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		String result = (num == 0) ? "영 " : ((num > 0) ? "양수 " : "음수 ");
		System.out.println(result + "입니다");
		result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "는 " + result + "입니다.");
	}
}
