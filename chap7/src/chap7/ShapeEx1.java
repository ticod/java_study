/*
 * 추상 클래스 예제
 * 
 * 추상 클래스
 *   1. 추상 메서드를 가질 수 있는 클래스, abstract 예약어를 이용하여 구현
 *   2. 객체화 불가  => 상속을 통한 자손 클래스, 자손 클래스의 객체화를 통해 객체화 가능
 *                        (자손 클래스 객체화시 부모 클래스도 함께 객체화되기 때문)
 *   3. 그 외는 일반 클래스와 동일(생성자, 멤버변수, 멤버메서드, 초기화블럭, 상속)
 *   4. 기능의 표준화
 *      
 * 추상 메서드 : 메서드의 선언부만 존재하는 메서드 (= 구현부가 없다)
 *   => 자손 클래스에서 반드시 오버라이딩 해야함.
 */
package chap7;

abstract class Shape {
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area();
	abstract double length();
}

class Circle extends Shape {
	int r;
	
	Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override
	double area() {
		return r * r * Math.PI;
	}

	@Override
	double length() {
		return 2 * r * Math.PI;
	}
	
	public String toString() {
		return type + ":" + "반지름:" + r
				+ ", 넓이:" + area() + ", 둘레:" + length();
	}
}

class Rectangle extends Shape {
	int width, height;
	
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return 2 * (width + height);
	}
	
	public String toString() {
		return type + ":" + "가로:" + width + ", 세로:" + height
				+ ", 넓이:" + area() + ", 둘레:" + length();
	}
}

public class ShapeEx1 {
	public static void main(String[] args) {
		Shape[] arr = new Shape[2];
		arr[0] = new Circle(10);
		arr[1] = new Rectangle(10, 10);
		for(Shape s : arr) {
			System.out.println(s);
		}
	}
}
