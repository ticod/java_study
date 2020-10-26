/*
 * 람다식
 *   람다식 : jdk 8.0부터 사용 가능
 *   람다식에서 사용되는 인터페이스는 FunctionalInterface여야 한다.
 *   메서드를 매개 변수로 받을 수 있다.
 * FuntionalInterface : 추상 메서드가 한 개만 존재.
 *                      추상 메서드 이외의 값은 상관 X
 * 추상 메서드의 매개 변수가 없고, 리턴 타입도 없는 경우
 * ()->{...}
 * 람다식 내부 실행 구문 한 개인 경우 중괄호 생략 가능
 */
package chap14;

@FunctionalInterface // 안에 추상 메서드는 한 개만 존재한다.
interface LambdaInterface1 {
	void method();
}

public class LambdaEx1 {
	public static void main(String[] args) {
		LambdaInterface1 fi = new LambdaInterface1() {
			// 기존 방식 : 익명 내부 클래스 객체
			@Override
			public void method() {
				System.out.println("기존 방식으로 코딩");
			}
		};
		fi.method();
		// 람다 방식 기본
		fi = () -> {
			String str = "람다 방식으로 코딩 1";
			System.out.println(str);
		};
		fi.method();
		// 내용이 한 줄이라면 중괄호 생략 가능
		fi = () -> System.out.println("람다 방식으로 코딩 2");
		fi.method();
		// 메서드의 매개 변수로도 사용 가능
		execute(()-> {
			System.out.println("람다 방식으로 코딩 3");
		});
		// 역시 중괄호 생략 가능
		execute(()->System.out.println("람다 방식으로 코딩 4"));
	}
	
	static void execute(LambdaInterface1 f) {
		f.method();
	}
}
