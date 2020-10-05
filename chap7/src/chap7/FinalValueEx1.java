/*
 * final 변수 : 변경 불가 변수 = 상수
 * final 변수도 생성자에서 한 번은 값을 설정할 수 있다.
 * 단, 명시적 초기화가 되면 안된다. => 객체별로 다른 상수값을 설정할 수 있다.
 * 
 * const 예약어도 존재하지만 상수 표현은 final로 한다.
 */
package chap7;

class FinalValue {
	// 생성자로 초기화 예시
	final int NUM;
	final int[] ARR;
	FinalValue(int num) {
		this.NUM = num;
		ARR = new int[5];
		for(int i = 0; i < ARR.length; i++) {
			ARR[i] = (i+1) * 10;
		}
	}
}

public class FinalValueEx1 {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue(123);
//		f1.NUM = 200; // 오류 발생
		System.out.println(f1.NUM);
		for(int a : f1.ARR)
			System.out.println(a);
		
		// ARR 변수 내의 값은 변경이 가능하다
		f1.ARR[0] = 100;
		f1.ARR[1] = 200;
		System.out.println();
		for(int a : f1.ARR)
			System.out.println(a);
		
		// 단, ARR 참조 변수의 값은 변경이 불가능하다.
//		f1.ARR = new int[10];
	}
}
