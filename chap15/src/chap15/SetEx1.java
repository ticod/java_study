/*
 * Set 인터페이스 : 객체를 중복 저장 X
 *     구현 클래스 : HashSet, LinkedHashSet(순서 유지), TreeSet(정렬 가능) 등
 */
package chap15;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"홍길동", 1, "1", "김삿갓", "이몽룡", "홍길동", "성춘향", "향단이", "홍길동", "김삿갓"};
		Set<Object> set1 = new HashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!set1.add(arr[i])) { // set.add는 추가 실패시 false를 반환한다.
				if (!set2.add(arr[i])) {
					set3.add(arr[i]); // 즉, set1, set2의 값 추가 실패시(중복시) set3에 들어간다.
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
