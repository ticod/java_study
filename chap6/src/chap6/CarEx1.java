/*
 * 선언 위치에 따른 변수의 종류 *
 * 
 * 1. 클래스 변수, 스태틱 변수
 * 	- 선언 위치 : 클래스 내부
 * 	- 선언 방법 : static (자료형) (변수명) ex) static int num
 *  - 메모리 할당 시점 : 클래스 정보 로드시
 *  - 메모리 할당 위치 : 클래스 영역
 *  - 기본 값으로 초기화됨.
 *  
 *  - 객체화와 무관
 *  - 모든 객체의 공통 변수로 사용됨
 *  - (클래스명).(변수명) 호출 - Car
 *  - 클래스명 대신 참조변수명으로도 호출은 가능
 *  
 *  ******************************************************
 * 
 * 2. 인스턴스 변수, 객체 변수
 * 	- 선언 위치 : 클래스 내부
 * 	- 선언 방법 : (자료형) (변수명)
 *  - 메모리 할당 시점 : 객체화시
 *  - 메모리 할당 위치 : 힙 영역
 *  - 기본 값 : 참조 자료형 - null
 *           숫자형, 문자형(char) - 0
 *           논리형 - false
 * 
 *  - 반드시 객체화 되어야함.
 *  - (참조변수명).(변수명) 호출 - car1
 * 
 *  ******************************************************
 * 
 * 3. 지역 변수
 * 	- 선언 위치 : 메서드 내부
 *  - 선언 방법 : (자료형) (변수명)
 *  - 메모리 할당 시점 : 선언문 실행시
 *  - 메모리 할당 위치 : 스텍 영역
 *  
 *  - 메서드 내부에서만 사용 가능함.
 *  - 반드시 초기화되어야함. 
 *    (다른 변수들의 경우 초기화하지 않아도 된다.)
 *    (기본 값으로 초기화되지 않는다.)
 *  - 매개변수(파라미터)도 지역변수
 * 
 */
package chap6;

class Car {
	// 객체화가 될 때 메모리 할당
	// = 인스턴스 변수 / 객체 변수 (힙 영역에 할당), Car.(변수)로는 접근 불가
	String color;
	int number;
	
	// 클래스 정보가 처음 메모리로 로드될 때 할당됨
	// 모든 객체에서 공통으로 사용할 수 있다.
	// = 클래스 변수 / 스태틱 변수 (클래스 영역에 할당), Car.(변수)로 접근이 가능하다.
	static int width = 200;
	static int height = 120;
	
	// 객체 출력시 toString 메서드 자동 호출
	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}

public class CarEx1 {
	public static void main(String[] args) { // args도 지역 변수 (main 메서드 내에 존재하므로)
		// static 변수는 이미 초기화되있어 출력 가능
		System.out.println("자동차의 크기:" + Car.width + "," + Car.height);
//		System.out.println(Car.color); // color는 인스턴스 변수이기 때문에 오류
		
		// car1은 지역 변수로 스텍 영역(main 메서드 안)에 할당
		Car car1 = new Car(); // 객체화, 인스턴스 변수들이 메모리 힙 영역에 할당됨.
		car1.color = "White";
		car1.number = 1234;
		System.out.println("car1: " + car1); // 참조 변수를 화면 출력시 toString 메서드 자동 호출
		// toString() : 객체를 문자열로 변환시키는 메서드
		
		Car car2 = new Car(); // 객체화
		car2.color = "Black";
		car2.number = 2345;
		System.out.println("car2: " + car2);
		
		// 클래스(static) 변수이기 때문에 경고가 뜸
		// 클래스 영역에 할당되어 있으므로 모든 Car 객체의 값이 변한다.
		// 즉 다른 객체에 영향을 끼친다.
		Car.width = 300;	// 기본적으로 클래스 변수(static)은 클래스 명으로 호출
		car1.height = 200;	// 참조 변수 명으로도 호출은 가능하나 좋은 코딩은 아니다. (
		System.out.println("car1: " + car1);
		System.out.println("car2: " + car2);
	}
}
