/*
 * 제네릭의 필요성 : 명시적 형변환이 필요 => ClassCastException이 발생할 확률이 높아진다.
 */
package chap13;

public class BoxEx1 {
	public static void main(String[] args) {
		Box b = new Box();
		b.set("홍길동");
		System.out.println(b.get());
//		String name = b.get(); // 에러 발생 
		String name = (String)b.get(); // 명시적 형변환 필요
		System.out.println(name);
		
		b.set(new Apple());
		System.out.println(b.get());
		Apple a = (Apple)b.get();
		System.out.println(a);
	}
}
