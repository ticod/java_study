package chap11;

class Equal2 {
	int value;
	Equal2(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Equal2) {
			Equal2 e = (Equal2)o;
			return this.value == e.value;
		} else return false;
	}
}

public class EqualsEx2 {
	public static void main(String[] args) {
		Equal2 e1 = new Equal2(10);
		Equal2 e2 = new Equal2(10);
		// == : 참조값(주소값)을 비교
		if(e1 == e2) 		System.out.println("e1과 e2는 같은 객체입니다");
		else				System.out.println("e1과 e2는 다른 객체입니다"); // 출력
		// equals : 내용을 비교 (but, Object클래스에서는 ==와 같다.)
		// => 필요에 따라서 Equals2 클래스와 같이 Overriding해서 사용할 수 있다.
		// 권장사항 : equals 메서드를 오버라이딩하면 hashCode도 오버라이딩
		//                                           => HashcodeEx1
		if(e1.equals(e2)) 	System.out.println("e1과 e2는 같은 내용의 객체입니다"); // 출력
		else				System.out.println("e1과 e2는 다른 내용의 객체입니다");
	}
}
