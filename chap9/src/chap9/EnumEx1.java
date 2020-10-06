/*
 * 열거형 예제
 */
package chap9;

public class EnumEx1 {
	public enum Car {
		AVANTE, SONATA, GRANURE, SM5
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		Car[] cars = Car.values();
		for(Car c : cars)
			System.out.println(c+":"+c.ordinal());
		if(car instanceof Object)
			System.out.println("car 객체는 Object 객체다");
	}
}
