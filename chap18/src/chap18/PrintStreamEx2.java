/*
 * PrintStream 클래스의 printf 사용법 예제
 *   String.format() 사용법과 같다
 */
package chap18;

public class PrintStreamEx2 {
	public static void main(String[] args) {
		// char 형식지정문자 : %c
		// %n == \n 
		System.out.printf("%c%n", 'A');
		System.out.printf("%5c%n", 'A');
		System.out.printf("%-5c%n", 'A');
		System.out.println();
		
		// 정수 형식지정문자 : %d(10진수), %o(8진수), %x, %X(16진수)
		System.out.printf("%d%n", 12345);
		System.out.printf("%10d%n", 12345); // 10자리 확보
		System.out.printf("%,10d%n", 12345); // 10자리 확보, 3자리 ,
		System.out.printf("%-,10d%n", 12345); // 10자리 확보, 3자리 ,, 좌측정렬
		System.out.printf("%3d%n", 12345); // 3자리 확보(최소 자리)
		System.out.printf("%010d%n", 12345); // 10자리 확보, 빈자리 0
		
		System.out.printf("%o%n", 12345); // 8진수
		System.out.printf("%o%n", 10);
		
		System.out.printf("%x%n", 10); // 16진수
		System.out.printf("%X%n", 10);
		System.out.println();
		
		// 실수 형식지정문자 : %f(소수), %e(지수), %g(근사 실수)
		System.out.printf("%f%n", 12345.12345);
		System.out.printf("%.2f%n", 12345.12345);
		System.out.printf("%10.2f%n", 12345.12345);
		System.out.printf("%010.2f%n", 12345.12345);
		System.out.printf("%,010.2f%n", 12345.12345);
		System.out.printf("%-,10.2f%n", 12345.12345);
		System.out.printf("%e%n", 12345.12345);
		System.out.printf("%g%n", 12345.12345);
		System.out.println();
		
		// 논리형 : %b
		System.out.printf("%b != %b%n", true, false);
		System.out.printf("(2 > 3) == %b%n", 2 > 3);
		System.out.println();
		
		// 문자열 : %s
		System.out.printf("%s은 %s이다%n", "홍길동", "의적");
		System.out.printf("%5s은 %5s이다%n", "홍길동", "의적");
		System.out.println();
		
		// 문제 : 10진수 255는 8진수 377이고, 16진수 FF다
		System.out.printf("%d진수 %d는 %d진수 %o이고, %d진수 %X다"
				, 10, 255, 8, 255, 16, 255);
		
	}
}
