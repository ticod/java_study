/*
 * width(가로), height(세로)를 멤버 변수,
 * area(), length()를 멤버 메서드로 가지고 있는
 * Rectangle 클래스 구현
 */
package chap6;

class Rectangle {
	int width;
	int height;
	void area() {
		System.out.println("넓이: " + width * height);
	}
	void length() {
		System.out.println("둘레: " + (width * 2 + height * 2));
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.width = 10;
		r1.height = 10;
		r1.area();
		r1.length();
		
		r2.width = 5;
		r2.height = 20;
		r2.area();
		r2.length();
	}
}
