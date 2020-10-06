/*
 * 이름 없는 내부 클래스 (익명 내부 클래스)
 * (Anonymous Inner Class)
 * 
 * 
 */
package chap9;

interface I {
	void test();
}

public class InnerEx4 {
	public static void main(String[] args) {
		int iv = 100;
		System.out.println("iv="+iv);
//		iv++; // error
		I i = new I() { // 익명 내부 클래스
			@Override
			public void test() {
//				iv++; // error
				/* 
				 * iv 값은 main 메서드의 지역 변수
				 * 익명 내부 클래스 역시 로컬 내부 클래스와 똑같이
				 * 상수화 되어야 한다는 조건이 있다.
				 */
				System.out.println("iv="+iv);
			}
		};
		i.test();
		
		// 람다로 변경
		i = () -> System.out.println("iv="+iv);
		// 코드가 한 줄이면 중괄호 생략 가능
		/*
		 * 이도 익명 내부 클래스이고, 함수 객체라고도 불린다.
		 */
		i.test();
	}
}
