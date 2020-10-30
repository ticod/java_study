/*2. 실행 결과가 다음과 같이 나오도록 수정하기

[결과]
This
is
a
Java
book
Lambda
Expressions
Java8
supports
lambda
Expressions */
package p201030;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a Java book",
				"Lambda Expressions",
				"Java8 supports lambda Expressions"
		);
		list.stream().flatMap(s -> Arrays.stream(s.split(" ")))
			.forEach(System.out::println);
	}
}
