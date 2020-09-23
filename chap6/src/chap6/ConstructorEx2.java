/*
 * 생성자의 오버로딩
 */
package chap6;

class Car2 {
	String color;
	int number;
	Car2(String c, int n) {
		color = c;
		number = n;
	}
	Car2(String c) {
		color = c;
		number = 1111;
	}
	Car2(int n) {
		color = "white";
		number = n;
	}
	public String toString() {
		return color + "," + number;
	}
}

public class ConstructorEx2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2("blue", 1234); // 생성자는 객체 생성에 관여하는 인스턴스 멤버
		Car2 c2 = new Car2("red");
		Car2 c3 = new Car2(1234);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}
}
