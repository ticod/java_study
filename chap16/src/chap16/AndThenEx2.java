/*
 * andThen(), compose()
 */
package chap16;

import java.util.function.Function;

public class AndThenEx2 {
	public static void main(String[] args) {
		Function<Member2, Address> funA;
		Function<Address, String> funB;
		Function<Member2, String> funAB;
		
		Member2 member = new Member2("홍길동", "hong", new Address("한국", "서울"));
		funA = m -> m.getAddress();
		funB = a -> a.getCity();
		
		funAB = funA.andThen(funB);
		System.out.println("거주 도시: " + funAB.apply(member));
		
		funAB = funB.compose(funA);
		System.out.println("거주 도시: " + funAB.apply(member));
	}
}
