/*
 * 제네릭 클래스 예시
 * 
 * compiler는 자료형을 알 수 없다.
 * 제네릭을 통해 컴파일러에게 전달해줄 수 있다.
 * 
 * 제네릭에는 아무 문자나 들어가도 되지만 주로 쓰는 문자들이 있다.
 * D : Data
 * T : Type
 * E : Element
 * 
 */
package chap13;

class Box2<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class BoxEx2 {
	public static void main(String[] args) {
		Box2<String> b1 = new Box2<String>();
		b1.set("Hello");
		String s = b1.get();
		
		Box2<Apple> b2 = new Box2<Apple>();
		b2.set(new Apple());
		
		Apple a = b2.get();
		Box2 b3 = new Box2(); // error 발생 X
		b3.set("Hello2");
//		String b3Str = b3.get(); // error 발생 => 제네릭에 값이 주어지지 않았으므로 Object로 설정
		// => 따라서 명시적 형변환 필요
		String b3Str = (String)b3.get();
	}
}
