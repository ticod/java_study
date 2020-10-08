/*
 * Wrapper 클래스 : 8개의 기본 자료형을 객체화하기 위한 클래스
 *   => Object에 상속됨 = toString. equals 사용가능
 * 
 *  기본 자료형      Wrapper 클래스 (Wrapper라는 클래스는 없음)
 *    boolean    =>    Boolean
 *    byte       =>    Character
 *    byte       =>    Byte
 *    short      =>    Short
 *    int        =>    Integer
 *    long       =>    Long
 *    float      =>    Float
 *    double     =>    Double
 *    
 * 기본 자료형과 참조 자료형의 형변환은 불가능하다.
 * 하지만 예외적으로, 기본 자료형과 Wrapper 클래스 간의 형변환은 가능하다. (since jdk5)
 * 
 * 참조형 => 기본형 : auto UnBoxing
 * 기본형 => 참조형 : auto Boxing
 * 
 */
package chap11;

public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(10); // deprecated : 사용하지 않을 것을 권장
		Integer i2 = new Integer(10); // boxing
		
		System.out.println("i1 == i2: " + (i1 == i2)); // false (주소값 비교)
		System.out.println("i1 equals i2: " + i1.equals(i2)); // true (데이터 비교)
		System.out.println("i1 == 10: " + (i1 == 10)); // true (데이터 비교) => auto 
		System.out.println();
		
		i1 = 10; // auto boxing
		i2 = 10;
		
		System.out.println("i1 == i2: " + (i1 == i2)); // true (주소값 비교) => 상수 풀에서 가져오기 때문
		System.out.println("i1 equals i2: " + i1.equals(i2)); // true (데이터 비교)
		System.out.println("i1 == 10: " + (i1 == 10)); // true (데이터 비교)
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2)); // 동일한 hash 값을 출력한다.
		System.out.println();
		
		// int형 정보
		System.out.println("int 형의 최대값: " + Integer.MAX_VALUE);
		System.out.println("int 형의 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 형의 비트수: " + Integer.SIZE);
		System.out.println();
		
		// byte형 정보
		System.out.println("byte 형의 최대값: " + Byte.MAX_VALUE);
		System.out.println("byte 형의 최소값: " + Byte.MIN_VALUE);
		System.out.println("byte 형의 비트수: " + Byte.SIZE);
		System.out.println();
		
		// 정수형 <= 문자열
		int num = Integer.parseInt("123");
		System.out.println(num + 100);
		// 8진수 정수 <= 문자열
		num = Integer.parseInt("123", 8);
		System.out.println(num);
		// 16진수 정수 <= 문자열
		num = Integer.parseInt("FF", 16);
		System.out.println(num);
		System.out.println();
		
		// 255를 2진수 표현
		System.out.println(Integer.toBinaryString(num));
		// 255를 8진수 표현
		System.out.println(Integer.toOctalString(num));
		// 255를 16진수 표현
		System.out.println(Integer.toHexString(num));
	}
}
