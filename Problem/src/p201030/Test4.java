/* 4. strArrStrm 스트림내부에 있는 
   모든 문자열의 길이의 합을 
   출력하는 프로그램을 작성하시오

[결과]
총 문자열 길이의 합:30 */
package p201030;

import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[]{"홍길동", "김삿갓", "이몽룡"},
				new String[]{"서울특별시", "금천구", "가산동","대륭테크노타운 3차"}
		);
		
		int sum = strArrStrm.flatMap(arr -> Stream.of(arr))
							.mapToInt(s -> s.length())
							.sum();
		
		System.out.println("총 문자열 길이의 합: " + sum);
	}
}
