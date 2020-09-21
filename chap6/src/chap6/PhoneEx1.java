/*
 * 추상화 : 클래스 생성의 과정
 * 클래스 : 사용자 정의 자료형
 *        속성 : 멤버 변수
 *        기능 : 멤버 메서드(method)
 */
package chap6;

class Phone {
	String color;
	boolean power;
	String no;
	void power() {
		power = !power;
	}
	void send(String no) {
		System.out.println(no + " 번호로 전화 송신 중 ~~~");
	}
	void receive(String no) {
		System.out.println(no + " 번호에서 전화 수신 중 ~~~");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		Phone p1 = new Phone(); // Phone 객체 하나를 힙 영역에 생성, 초기화함. 이후 p1이 그 객체를 가리킴
		// new Phone = 객체화, 인스턴스화
		// 객체 = 실질적인 객체 / 인스턴스 = 실체 (메모리에 의해 할당되어 진 것)
		p1.color = "검정"; // p1이 가리키는 Phone 객체의 color값을 변경
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		p1.send("01098765432"); // p1.send()메서드가 스텍 영역에 호출, 실행 후 빠져나감
		p1.receive("01098765432");
		
		Phone p2 = new Phone();
		p2.color = "빨강";
		p2.power = false;
		p2.no = "01098765432";
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);
		p2 = p1; // p1의 주소값을 p2에 저장함 (p2가 p1이 가리키던 객체를 가리킴)
		// 또한 가비지 컬렉터에 의해 p2가 가리키던 객체는 사라짐
		// 한 개의 참조 변수는 하나의 객체만 참조할 수 있다.
		// 객체는 여러 참조 변수가 가리킬 수 있다.
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);
	}
}
