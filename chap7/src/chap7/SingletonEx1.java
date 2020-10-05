/*
 * 객체의 개수를 한 개만 생성하기
 */
package chap7;

class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}
	private int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
	
	// getter, setter
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}

public class SingletonEx1 {
	public static void main(String[] args) {
//		SingleObject obj = new SingleObject(); // 생성자 접근 불가
		SingleObject obj = SingleObject.getObject();
//		SingleObject obj = SingleObject.obj(); // obj 멤버 접근 불가
		
//		System.out.println(obj.value); // value 멤버 접근 불가
		System.out.println(obj.getValue());
		System.out.println(obj);
		
		obj.setValue(500);
		
		SingleObject obj2 = SingleObject.getObject();
		System.out.println(obj2.getValue());
		System.out.println(obj);
	}
}
