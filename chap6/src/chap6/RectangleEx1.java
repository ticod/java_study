/*
 * static 변수로 사각형 번호 생성하기
 * 멤버 메서드
 * 		int area()
 * 		int length()
 * 		boolean isSquare()
 * 		public String toString() => 사각형의 가로, 세로, 사각형 번호, 생성된 사각형 개수, 정사각형 여부 출력하기
 */
package chap6;

class Rectangle2 {
	int width, height, serialNo;
	static int sno;
	
	int area() {
		return width * height;
	}
	int length() {
		return 2 * (width + height);
	}
	boolean isSquare() {
		return width == height;
	}
	public String toString() { // public을 붙여야함 (=> 상속에서 설명)
		return serialNo + "번 사각형: " + "(" + width + ", " + height + ") " +
				((isSquare()) ? "정사각형" : "직사각형") + ", " +
				"지금까지 생성된 사각형 갯수: " + sno
				+ " => 면적: " + area() + ", 둘레: " + length();
	}
}

public class RectangleEx1 {
	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2();
		Rectangle2 r2 = new Rectangle2();
		Rectangle2 r3 = new Rectangle2();
		r1.width = 30;
		r1.height = 20;
		r1.serialNo = ++Rectangle2.sno;
		r2.width = 35;
		r2.height = 25;
		r2.serialNo = ++Rectangle2.sno;
		r3.width = 30;
		r3.height = 30;
		r3.serialNo = ++Rectangle2.sno;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}
