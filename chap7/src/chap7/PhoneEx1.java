/*
 * 상속 예제
 * 
 * 1. 모든 클래스는 Object 클래스를 상속받는다. (Superclass) (예외 X)
 *    => 상속이 없는 클래스에 컴파일러가 extends Object를 추가한다.
 *    => 클래스 생성시 superclass 설정을 통해 볼 수 있다.
 *    => 모든 클래스의 객체는 Object 객체를 포함한다.
 *       => 모든 클래스의 객체는 Object 클래스의 멤버를 가진다 (ex. toString() 메서드)
 * 2. 자손 클래스의 객체 생성시 부모 클래스의 객체를 먼저 생성한다.
 * 3. 클래스간의 상속은 단일 상속만 가능하다.
 *    => 부모 1 : 자손 N (부모 N : 자손 1이 다중 상속)
 * 
 */
package chap7;

class Phone {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power) System.out.println("전화 걸기");
	}
	void receive() {
		if(power) System.out.println("전화 받기");
	}
}

class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name + "앱 설치함");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		/*
		 * 메인 메서드에 sp 참조 변수 할당
		 * Phone 객체 생성 (SmartPhone 객체의 부모)
		 * 위에 생성한 Phone 객체를 포함하는 SmartPhone 객체 생성
		 */
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("네이버");
	}
}
