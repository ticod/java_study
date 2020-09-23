/*
 * Exam2.java 구동 프로그램을 수정하여 
 */
package chap6;

class Rectangle3 {
	int width, height, serialNo;
	static int sno;
	
	Rectangle3(int w, int h) {
		width = w;
		height = h;
		serialNo = ++sno;
	}
	int area() {
		return width * height;
	}
	int length() {
		return 2 * (width + height);
	}
	public String toString() {
		return serialNo + "/" + sno + " 사각형:(" + width + ", " + height + ") " 
			+ "면적: " + area() + ", 둘레: " + length();
	}
}

public class Exam4 {
	public static void main(String[] args) {
		Rectangle3[] rArr = new Rectangle3[5];
		
		int sumLength = 0;
		int sumArea = 0;
		
		for(int i = 0; i < rArr.length; i++) {
			int width = (int)(Math.random() * 31) + 20;
			int height = (int)(Math.random() * 31) + 20;
			rArr[i] = new Rectangle3(width, height);
//			rArr[i] = new Rectangle3(10 + i * 5, 20 + i * 5);
			sumLength += rArr[i].length();
			sumArea += rArr[i].area();
		}
		
		for(int i = 0; i < rArr.length; i++) {
			System.out.println(rArr[i]);
		}
		
		System.out.println("둘레의 합: " + sumLength + ", 넓이의 합: " + sumArea);
	}
}
