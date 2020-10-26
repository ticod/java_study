/*
 * 추상 메서드의 매개 변수가 있고, 리턴 타입이 없는 경우
 *    (매개 변수, ...) -> {...}
 * * 매개변수가 한 개일 경우 () 생략 가능
 *    매개변수 -> {...}
 */
package chap14;

@FunctionalInterface
interface LambdaInterface3 {
	void method(int a);
}

public class LambdaEx3 {
	
	public static void main(String[] args) {
		LambdaInterface3 fi = a->System.out.println(a*5);
		fi.method(2);
		fi.method(10);
		fi = x->System.out.println(x+x);
		fi.method(2);
		fi.method(10);
		calc((x)->System.out.println(x+x));
		calc((x)->System.out.println(x*x));
	}

	static void calc(LambdaInterface3 f) {
		f.method(10);
	}
}
