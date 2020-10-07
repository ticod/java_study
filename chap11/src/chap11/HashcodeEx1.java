/*
 * hashcode : 원래 의미는 JVM이 객체를 구별하기 위한 참조값 (실제 참조값 X)
 *            내용이 같은 경우 같은 hashcode값을 가지도록 overriding
 * 내용 비교를 위하여 equals 메서드를 overriding하는 경우 => hashcode 메서드도 overriding 권장
 * => 논리적 동등성 비교에 사용 (Collection 프레임워크에서 다시 다룬다)
 */
package chap11;

public class HashcodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1 == s2) System.out.println("s1과 s2는 같은 객체");
		else System.out.println("s1과 s2는 다른 객체");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("s1객체의 원래 hashcode: " + System.identityHashCode(s1));
		System.out.println("s2객체의 원래 hashcode: " + System.identityHashCode(s2));
	}
}
