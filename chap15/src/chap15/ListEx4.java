/*
 * 상속 관계
 */
package chap15;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class Shape implements Comparable<Shape> {
	int x, y;
	Shape() {
		this(0, 0);
	}
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract double area();
	abstract double length();
	@Override
	public String toString() {
		return "x:" + x + ", y:" + y;
	}
	@Override
	public int compareTo(Shape o) {
		return (int)(area() - o.area());
	}
	/*
	 * 구현되지 않은 area() 메서드를 사용할 수 있는 이유 :
	 *   추상 클래스이므로, compareTo 메서드가 실행 되는 경우는
	 *   Shape 클래스의 객체화가 되어있다는걸 확신할 수 있기 때문
	 */
}

class Circle extends Shape {
	double r;
	Circle() {
		this(1);
	}
	Circle(double r) {
		this.r = r;
	}
	@Override
	public double area() {
		return Math.PI * r * r;
	}
	@Override
	public double length() {
		return 2 * Math.PI * r;
	}
	@Override
	public String toString() {
		return String.format("(%s) 반지름:%f, 면적:%f, 둘레:%f", 
				super.toString(), this.r, this.area(), this.length());
	}
}

class Rectangle extends Shape {
	int w, h;
	Rectangle() {
		this(1, 1);
	}
	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	@Override
	public double area() {
		return w * h;
	}
	@Override
	public double length() {
		return 2 * (w + h);
	}
	@Override
	public String toString() {
		return String.format("(%s) 가로:%d, 세로:%d, 면적:%f, 둘레:%f", 
				super.toString(), this.w, this.h, this.area(), this.length());
	}
}

public class ListEx4 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Circle(5));
		list.add(new Rectangle(3, 4));
		list.add(new Circle());
		list.add(new Circle(10));
		list.add(new Rectangle());
		for (Shape s : list) {
			System.out.println(s);
		}
		System.out.println("\n정렬");
		Collections.sort(list);
		for (Shape s : list) {
			System.out.println(s);
		}
		
		System.out.println("\nreverseOrder 정렬");
		Collections.sort(list, Comparator.reverseOrder());
		for (Shape s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n둘레 역순 정렬");
		// anonymous inner class
		// 람다 X (기본)
//		Collections.sort(list, new Comparator<Shape>() {
//			@Override
//			public int compare(Shape s1, Shape s2) {
//				return (int)(s2.length() - s1.length());
//			}
//		});
		// 람다식
		Collections.sort(list, (s1, s2) -> (int)(s2.length() - s1.length()));
		
		for (Shape s : list) {
			System.out.println(s);
		}
	}
}
