/*
 * 제네릭 예시 클래스
 */
package chap13;

public class Box {
	private Object obj;
	public void set(Object obj) {
		this.obj = obj;
	}
	public Object get() {
		return obj;
	}
}

class Apple {}