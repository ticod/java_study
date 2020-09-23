/*
 * this 예약어 예제
 * 
 * this() 생성자 : 클래스 내부의 다른 생성자 호출시 사용
 * 				반드시 첫 줄에 구현해야한다.
 * 
 * this 참조변수 : 자기참조변수 (내 객체의 주소값을 가지고있다 => 객체가 있어야 한다 => 클래스 멤버에선 사용이 불가)
 * 				인스턴스 멤버를 참조할 때 사용
 * 				인스턴스 메서드에서만 사용 가능 -> 인스턴스 메서드에 지역 변수로 "자동" 설정됨
 * 				지역 변수와 멤버 변수를 구분할 때 사용함
 */
package chap6;

class Car3 {
	String color;
	int number;
	int serialNo;
	static int sno;
	Car3(){
		this("white", 1111); // this는 무조건 첫줄
		System.out.println("Car3()");
//		this.color = "white";
//		this.number = 1111;
//		serialNo = ++sno;
	}
	Car3(String color){
		this(color, 1111);
		System.out.println("Car3(String)");
//		this.color = color;
//		this.number = 1111;
//		serialNo = ++sno;
	}
	Car3(int number){
		this("white", number);
		System.out.println("Car3(int)");
//		this.color = "white";
//		this.number = number;
//		serialNo = ++sno;
	}
	Car3(String color, int number){
		System.out.println("Car3(String, int)");
		this.color = color;
		this.number = number;
		serialNo = ++sno;
	}
	Car3(Car3 car){
		this(car.color, car.number);
		System.out.println("Car3(Car3)");
	}
	public String toString() {
		return serialNo + "번자동차: " + this.color + "," + number;
		// this를 써도 되고, 안써도 됨.
		// 겹치는 지역 변수가 있다면 this를 써줘야될 것.
	}
}

public class ThisEx1 {
	public static void main(String[] args) {
		Car3 c1 = new Car3("blue", 1234);
		Car3 c2 = new Car3();
		Car3 c3 = new Car3("red");
		Car3 c4 = new Car3(1234);
		Car3 c5 = new Car3(c1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}
