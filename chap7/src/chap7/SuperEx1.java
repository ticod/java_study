/*
 * super 예약어
 * 
 * super() 생성자	: 부모클래스의 생성자 호출
 *                부모클래스 생성자의 구조(매개변수)에 맞도록 자손클래스에서 호출해야한다.
 *                단, 부모클래스에 매개변수가 없는 생성자가 있다면 생략 가능함.
 * super 참조변수 	: 부모클래스의 객체를 참조하는 변수
 * 
 */
package chap7;

class Parent {
	int x = 10;
	Parent(int x) { // 생성자
		this.x = x;
	}
}

class Child extends Parent {
	/*
	 * 컴파일러에서 자손의 생성자를 기본적으로 자손(){ super(); }으로 만들어준다.
	 * 즉 부모클래스에 매개변수 없는 생성자가 없다면 에러가 발생한다.
	 * 만약 부모클래스에 아무런 생성자가 없는 경우 컴파일러가 자동으로 생성자를 부모(){} 와 같이 만들어주기 때문에
	 * 에러가 발생하지 않는다.
	 */
	int x = 20;
	Child(){
		super(10);
		// super 역시 this처럼 첫 줄에 작성해야 한다.
	}
	void method() {
		int x = 30;
		System.out.println("x=" + x);
		// 만약 로컬 변수가 선언이 안되어있다면 자동으로 this.x가 된다.
		// 또한 this.x도 존재하지 않는 경우 super.x(부모)가 된다.
		// => this가 부모도 가르킬 수 있다. (자손 객체 내에 멤버가 존재하지 않을시)
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class SuperEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
