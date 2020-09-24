/*
 * instanceof : 객체와 참조변수의 관계를 알려줌
 *  => 참조변수가 다른 객체로 형변환이 가능한지 여부를 확인 가능
 */
package chap7;

public class InstanceOfEx1 {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		if(p instanceof Child3) {
			System.out.println("p 참조변수 객체는 child3 객체다");
			Child3 c = (Child3)p;
			System.out.println(c.x);
		}
		if(p instanceof Parent3) {
			System.out.println("p 참조변수 객체는 Parent3 객체다");
			Parent3 c = (Parent3)p;
			System.out.println(c.x);
		}
		if(p instanceof Object) {
			System.out.println("p 참조변수 객체는 Object 객체다");
			Object c = (Object)p;
		}
		
		Parent3 p1 = new Parent3();
		if(p1 instanceof Child3) {
			System.out.println("p1 참조변수 객체는 child3 객체다");
			Child3 c = (Child3)p;
			System.out.println(c.x);
			// 출력 X
		}
		if(p1 instanceof Parent3) {
			System.out.println("p1 참조변수 객체는 Parent3 객체다");
			Parent3 c = (Parent3)p;
			System.out.println(c.x);
		}
		if(p1 instanceof Object) {
			System.out.println("p1 참조변수 객체는 Object 객체다");
			Object c = (Object)p;
		}
	}
}
