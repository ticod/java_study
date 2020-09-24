/*
 * 다형성 예제
 * 
 * 자손타입의 객체는 부모타입의 참조변수로 참조가 가능하다.
 * 부모타입의 참조변수로 자손 객체 참조시, 부모타입의 멤버들만 참조가 가능하다.
 * 모든 클래스의 객체는 Object 타입의 참조변수로 참조가 가능하다.
 * 단, Object 클래스의 멤버만 접근이 가능하다.
 * 
 * 즉 참조변수의 타입만큼만 접근이 가능하다.
 */
package chap7;

class Bike2 {
	int wheel;
	Bike2 (int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("페달을 밟는다");
	}
	void stop() {
		System.out.println("브레이크를 잡는다");
	}
}

class AutoBike2 extends Bike2 {
	boolean power;
	AutoBike2(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
		if(power) 	System.out.println("전원이 켜졌습니다");
		else		System.out.println("전원이 꺼졌습니다");
	}
}

public class BikeEx2 {
	public static void main(String[] args) {
		AutoBike2 ab = new AutoBike2(2);
		Bike2 b;
		Object o;
		ab.power();
		ab.drive();
		System.out.println("바퀴 " + ab.wheel + "개가 굴러 간다");
		ab.stop();
		b = ab;
		o = b;
		/*
		 * 같은 객체를 다른 참조변수로 참조할 수 있고,
		 * 참조 변수의 타입에 따라 다른 객체로 보여진다. => 다형성
		 */
//		b.power();
		/*
		 * power() 메서드는 Bike2 클래스의 멤버가 아니므로 Bike2형 참조변수로 호출 불가.
		 */
//		o.wheel = 4;
		/*
		 * wheel 멤버 변수는 Object 클래스의 멤버가 아니므로 Object형 참조변수로 호출 불가
		 */
	}
}
