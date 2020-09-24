/*
 * 오버라이딩 예제
 * 
 * 오버라이딩 : 메서드의 재정의. 상속 관계에서 나타남
 *          부모클래스의 메서드를 자손클래스에서 재정의함.
 *          부모클래스 메서드의 선언부, 자손클래스 메서드의 선언부가 동일해야함.
 *          단, 접근제어자는 같거나 넓은 범위로, 예외처리는 같거나 좁은 범위로 가능하다.
 */
package chap7;

class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "페달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
//	@Override  // 어노테이션
	public String toString() {
		return "부모클래스의 바퀴 수: " + wheel;
	}
}

class AutoBike extends Bike {
	boolean power;
	AutoBike(int wheel){
		super(wheel);
	}
	void power() {
		power = !power;
	}
	
	@Override // 오버라이딩 검증
	/* 어노테이션이라고 한다.
	 * 만약 쓰지 않는다면 오버라이딩이 제대로 됐는지 확인할 수 없다.
	 */
	String drive() {
		System.out.println(super.drive());
		// 오버라이딩되도 부모의 메서드를 쓸 수 있다.
		// 보통은 쓰지 안는다.
		return "출발 버튼을 누른다";
	}
	@Override
	String stop() {
		return "정지 버튼을 누른다.";
	}
}

public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.stop());
		Bike b = new Bike(2);
		System.out.println(b.drive());
		System.out.println(b.stop());
	}
}
