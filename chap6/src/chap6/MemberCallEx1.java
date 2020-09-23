package chap6;

public class MemberCallEx1 {
	
	// 변수
	static int cv1 = 10;		
	static int cv2 = cv1;						// 클래스 멤버간 접근
	int iv1 = 100;
	int iv2 = iv1;								// 인스턴스 멤버간 접근
	int iv3 = cv1;								// 인스턴스 멤버 -> 클래스 멤버 접근
//	static int cv3 = iv1;						// 클래스 멤버 -> 인스턴스 멤버 접근 불가
	static int cv3 = new MemberCallEx1().iv1;	// 일회용 객체 생성, 클래스 멤버 -> 인스턴스 멤버 접근 
	
	
	// 메서드
	void method1() {		// 인스턴스 메서드
		System.out.println("cv1 + cv2 = " + (cv1 + cv2));
		System.out.println("iv1 + iv2 = " + (iv1 + iv2));
	}
	static void method2() {	// 클래스 메서드
		System.out.println("cv1 + cv2 = " + (cv1 + cv2));
		
		// 클래스 멤버 -> 인스턴스 멤버 접근 불가
//		System.out.println("iv1 + iv2 = " + (iv1 + iv2));
		// 객체 생성 후, 클래스 멤버 -> 인스턴스 멤버 접근
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println("iv1 + iv2 = " + (m.iv1 + m.iv2));
	}
	
	public static void main(String[] args) {
//		method1();						// 클래스 멤버 -> 인스턴스 멤버 접근 불가
		new MemberCallEx1().method1();	// 일회용 객체 생성, 클래스 멤버 -> 인스턴스 멤버 접근 
		method2();
	}
}
