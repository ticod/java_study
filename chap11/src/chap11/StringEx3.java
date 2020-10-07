/*
 * String 클래스 - format method 예제 (since jdk5)
 *   => 형식화 문자를 사용할 수 있는 메서드
 *   => class method (static)
 *   => return String
 *   
 *   1. %f : 실수형 숫자
 *     - %.2f : 실수 두자리까지 => 세번째 자리에서 반올림
 *   2. %d : 10진 정수
 *     - %10d : 10자리를 확보하여 오른쪽 정렬
 *     - %-10d : 10자리를 확보하여 왼쪽 정렬
 *     - %010d : 10자리 확보 후 빈 자리에는 0으로 초기화
 *     - %,10d : 10자리 확보 후, 3자리마다 , 출력
 *   3. %X : 16진 정수
 *     - %x : 영어를 소문자로 출력
 *   4. %o : 8진 정수
 *   5. %s : 문자열
 *   6. %c : 문자
 */
package chap11;

public class StringEx3 {
	public static void main(String[] args) {
		String sf = String.format("%.2f",  0.126);
		System.out.println(sf);
		System.out.println(String.format("%10d", 12345));
		System.out.println(String.format("%-10d", 12345));
		System.out.println(String.format("%010d", 12345));
		System.out.println(String.format("%,10d", 12345));
		
		System.out.println(String.format("%,-10d", 12345));
		
		System.out.println(String.format("%X", 25565));
		System.out.println(String.format("%x", 25565));
		System.out.println(String.format("%o", 10));
		System.out.println(String.format("%s", "홍길동"));
		System.out.println(String.format("%c", 'A'));
		
		System.out.println(String.format("%s의 학점은 %c입니다", "홍길동", 'A'));
	}
}
