package chap3;
/*
5. 반지름을 입력받아 원의 둘레와 면적을 구하시오 OpEx5.java
원주율 = 3.141592  입니다.
[결과]
반지름 : 5
넓이 : 78.5398
둘레 : 31.41592
*/
import java.util.Scanner;

public class Pr0915_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double PI = 3.141592;
		int radius = 0;
		
		// 반지름 입력
		System.out.print("반지름 : ");
		radius = scan.nextInt();
		
		// 계산한 넓이, 둘레 값 출력
		System.out.println("넓이 : " + radius * radius * PI);
		System.out.println("둘레 : " + 2 * radius * PI);
	}
}
