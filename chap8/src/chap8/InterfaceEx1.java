/*
 * 인터페이스 예제 
 * 
 * 인터페이스 : 참조 변수의 한 종류 (class, array, interface)
 * 1. 인터페이스의 멤버는 상수, 추상메서드 (+ default 메서드, static 메서드)만 가능
 *    인터페이스의 모든 멤버는 public 멤버임
 * 
 *    상수 : (public static final) 자료형 상수명;
 *    ex)    int NUM = 10; (o)	
 *           final int NUM = 10; (o)
 *           static int NUM = 10; (o)
 *           protected int NUM = 10; (x)
 *           
 *    추상 메서드 : (public abstract) 리턴타입 메서드명(매개변수);
 *            ex)   int getA(); (o)
 *                  abstract int getA(); (o)
 *    
 *    ==> jdk8 이후 버전부터 사용 가능
 *    default 메서드 : (public) default 리턴타입 메서드명(매개변수, ...) {...}
 *    static 메서드 : (public) static 리턴타입 메서드명(매개변수, ...) {...}
 * 
 * 2. 객체화 불가 => 구현 클래스의 객체화를 통해서 객체화 가능
 * 3. 클래스와 인터페이스 간은 구현으로 표현한다. => implements 예약어 사용
 *    => 다중 구현 가능
 * 4. 인터페이스 간 상속 가능 => 이 역시 다중 상속 가능
 * 
 * 인터페이스 : 업무의 표준화
 * 다중 상속, 다중 구현때문에 아주 많이 사용됨 => 매우 중요
 *   => 단일 상속의 단점을 해결
 */
package chap8;

interface Printerable {
	int INK = 100; // ==  (public static final) int INK = 100;
	// 무조건 public static final로 초기화된다.
	void print(); // ==  (public abstract) print()
	// 무조건 추상 메서드로 초기화된다.
}

interface Scannerable {
	void scan();
}

interface Faxable {
	String FAX_NO = "02-1234-5678"; // ==  public static final String FAX_NO
	void send(String tel);
	void receive(String tel);
}

//인터페이스는 다중 상속이 가능하다.
interface Complexerable 
extends Printerable, Scannerable, Faxable {}

// 구현 클래스 : 인터페이스를 구현한 클래스
// 상속받은 인터페이스의 추상 메서드를 구현하지 않는다면 에러 발생
class Complexer implements Complexerable {
	int ink;
	Complexer() {
		this.ink = INK;
	}
	@Override
	public void print() {
		System.out.println("종이에 출력합니다. 남은 잉크량:" + --ink);
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔하여 파일에 저장합니다.");
	}
	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "에서 " + tel + "번호로 FAX를 전송합니다.");
	}
	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 " + FAX_NO + "로 FAX를 받았습니다.");
	}
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		System.out.println(Printerable.INK);
		System.out.println(Faxable.FAX_NO);
		Complexer com = new Complexer();
		System.out.println("기본 잉크량 : " + Printerable.INK);
		System.out.println("기본 잉크량 : " + Complexerable.INK);
		System.out.println("기본 잉크량 : " + Complexer.INK);
		System.out.println("FAX 번호 : " + Faxable.FAX_NO);
		System.out.println("FAX 번호 : " + Complexerable.FAX_NO);
		System.out.println("FAX 번호 : " + Complexer.FAX_NO);
		com.scan();
		com.print();
		com.send("02-5678-1234");
		com.receive("02-5678-1234");
		if(com instanceof Complexer) {
			System.out.println("com 객체는 Complexer 객체임");
		}
		if(com instanceof Complexerable) {
			System.out.println("com 객체는 Complexerable 객체임");
		}
		if(com instanceof Printerable) {
			System.out.println("com 객체는 Printerable 객체임");
			// 자동 형변환 가능
			Printerable p = com; // ==> Printerable p = (Printerable)com;
			System.out.println(p.INK); // static 변수를 객체(인스턴스)로 접근해서 warning
			p.print();
		}
		if(com instanceof Scannerable) {
			System.out.println("com 객체는 Scannerable 객체임");
			Scannerable s = com;
			s.scan();
		}
		if(com instanceof Faxable) {
			System.out.println("com 객체는 Faxable 객체임");
			Faxable f = com;
			System.out.println(f.FAX_NO);
			f.send("02-5678-1234");
			f.receive("02-5678-1234");
		}
	}
}
