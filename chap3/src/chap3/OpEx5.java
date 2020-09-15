package chap3;
/*
 * String 클래스의 + 연산
 * 
 * String 클래스
 * 	 1. +연산이 가능한 유일한 클래스
 *     ex) "풋" + "사과" = "풋사과"
 *   2. =(대입 연산자)를 이용해서 객체 생성이 가능한 유일한 클래스
 *     ex) String str = "문자열";
 *     ex) String str = new String("문자열"); => 일반적인 클래스 생성
 *   3. String + 기본 자료형 = String
 */
public class OpEx5 {
	public static void main(String[] args) {
		String str = "번호";
		System.out.println(str + 1 + 2 + 3);	// 번호123
		System.out.println(1 + 2 + 3 + str);	// 6번호
		System.out.println(str + (1 + 2 + 3));	// 번호6
	}
}
