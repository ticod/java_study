/*
 * Stream
 * Stream : 데이터의 모임
 * Collection과 Stream 방식 비교
 */
package chap16;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김삿갓", "이몽룡");
		System.out.println("기존 방식 : Iterator 객체 사용");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		System.out.println();
		
		System.out.println("Stream 방식");
		Stream<String> st = list.stream();
		st.forEach(name->System.out.println(name+" "));
		System.out.println();
	}
}
