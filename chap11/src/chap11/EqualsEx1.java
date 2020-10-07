/*
 * Object 클래스: equals 메서드 예제
 * 
 * ==     : 같은 객체 여부 리턴
 * equals : 같은 내용 여부 리턴
 *          단, Object클래스에서는 equals 메서드도 같은 객체 여부로 리턴한다.
 *          => 각각의 클래스에서 내용 비교를 위해 Overriding이 필요하다.
 *          
 *          함수 구조
 *          public boolean equals(Object obj) {
 *			    return (this == obj);
 *	 		}
 */
package chap11;

class Equal {
	int value;
	Equal(int value) {
		this.value = value;
	}
}

public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		// == : 참조값(주소값)을 비교
		if(e1 == e2) 		System.out.println("e1과 e2는 같은 객체입니다");
		else				System.out.println("e1과 e2는 다른 객체입니다"); // 출력
		// equals : 내용을 비교 (but, Object클래스에서는 ==와 같다.)
		if(e1.equals(e2)) 	System.out.println("e1과 e2는 같은 내용의 객체입니다");
		else				System.out.println("e1과 e2는 다른 내용의 객체입니다"); // 출력
	}
}
