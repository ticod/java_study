/*
 * Set 예제 - 객체의 중복 여부 판단
 *   1. equals   : 결과 true
 *   2. hashCode : 결과값이 같은 경우
 *   => 1, 2 만족시 => 중복된 객체로 본다.
 *   => 즉, equals 오버라이딩시 hashCode 오버라이딩을 권장한다.
 */
package chap15;

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	public String toString() {
		return "(" + name + "," + age + ")";
	}
	
	/*
	 * equals, hashCode를 오버라이딩해서 구현해야
	 * Set 컬렉션을 사용가능하다.
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age; 
		}
		return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 10)); // 위 객체와 다른 객체로 판단한다.
		set.add(new Person("홍길동", 20));
		set.add(new Person("홍길동", 10));
		System.out.println(set);
	}
}
