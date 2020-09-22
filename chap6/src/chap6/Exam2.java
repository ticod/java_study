/*
 * 20 ~ 50 사이의 임의의 가로, 세로 길이를 가진 사각형 5개 생성,
 * 모든 사각형의 넓이, 둘레의 합을 출력
 */
package chap6;

public class Exam2 {
	public static void main(String[] args) {
		Rectangle2[] rArr = new Rectangle2[5];
		// RectangleEx1.java
		// 아직 Rectangle2 객체는 만들어지지 않고, 배열과 참조 변수만 생성됨
		
		int sumLength = 0;
		int sumArea = 0;
		
		for(int i = 0; i < rArr.length; i++) {
			rArr[i] = new Rectangle2();
			// 따라서 이 곳에서 객체를 만들어줌
			rArr[i].width = (int)(Math.random() * 31) + 20;
			rArr[i].height = (int)(Math.random() * 31) + 20;
			rArr[i].serialNo = ++Rectangle2.sno;
			sumLength += rArr[i].length();
			sumArea += rArr[i].area();
		}
		
		for(int i = 0; i < rArr.length; i++) {
			System.out.println(rArr[i]);
		}
		
		System.out.println("둘레의 합: " + sumLength + ", 넓이의 합: " + sumArea);
	}
}
