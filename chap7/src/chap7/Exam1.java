package chap7;

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	int x = 20;
}

public class Exam1 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		Parent2 p = c;
		System.out.println(c.x); // 20
		System.out.println(p.x); // 10
		Child2 c2 = (Child2) p;	// 명시적 형변환이 필요
		// 넓은 범위로 참조할 때는 형변환이 필요하다
		// 하나의 부모는 여러 자손을 둘 수 있기 때문
		System.out.println(c2.x); // 10
	}
}
