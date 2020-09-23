/*
 * 
 */
package chap6;

class Math2 {
	int a = 100;
	int add(int b) {
		System.out.print("1:");
		return a+b;
	}
	double add(double b) {
		System.out.print("2:");
		return a+b;
	}
	String add(String b) {
		System.out.print("3:");
		return a+b;
	}
}

public class OverloadingEx1 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add('1'));
		System.out.println(m.add(10.5));
		System.out.println(m.add("번"));
		System.out.println(m.add(10L)); // 2번 메서드 호출 (long -> double, long - x -> int)
	}
}
