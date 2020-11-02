/*
 * andThen(), compose() - Functional Interface의 default method
 * 
 * andThen() : 함수적 인터페이스가 가지고 있는 default method.
 *             두 개의 함수적 인터페이스를 순차적으로 연결하여 실행함.
 *             첫 번째 return을 두 번째 parameter로 제공, 최종 결과를 return.
 * compose() : 함수적 인터페이스가 가지고 있는 default method.
 *             두 개의 함수적 인터페이스를 역순으로 연결하여 실행
 *             두 번째 return을 첫 번째 parameter로 제공, 최종 결과를 return
 */
package chap16;

import java.util.function.Consumer;

class Member2 {
	private String name;
	private String id;
	private Address address;
	
	public Member2(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	String getName() {
		return name;
	}

	String getId() {
		return id;
	}

	Address getAddress() {
		return address;
	}
}

class Address {
	private String country;
	private String city;
	
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}

	String getCountry() {
		return country;
	}

	String getCity() {
		return city;
	}
}

public class AndThenEx1 {
	public static void main(String[] args) {
		Consumer<Member2> conA = m -> {
			System.out.println("conA: " + m.getName());
		};
		Consumer<Member2> conB = m -> {
			System.out.println("conB: " + m.getId());
		};
		Consumer<Member2> conAB = conA.andThen(conB); // default method
		conAB.accept(new Member2("홍길동", "hongkd", null));
	}
}
