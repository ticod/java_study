/*
 * List 예제
 * (모든 컬렉션은 java.util에 있다.)
 * List 인터페이스 : Collection 인터페이스의 하위 인터페이스
 *                   객체들을 저장할 때 순서를 유지
 *   구현클래스 : ArrayList, Vector, LinkedList, Stack
 * 
 * List의 특징 : 순서를 가지고 있다 => index를 통해 접근이 가능하다.
 * 
 * 
 * ArrayList  : 가변 배열           - thread-safe하지 않다. (성능은 좋지만 큰차이는..?)
 *              뒤에 원소를 삽입시 좋다.
 * Vector     : 가변 배열 (1.0버전) - thread-safe하다 - 동기화
 * LinkedList : 가변 배열           - 
 *              중간에 요소를 삽입시에 유용
 *              큐 구현은 링크드리스트로 이루어져있다.
 * stack      : vector의 하위클래스
 * 
 */
package chap15;

import java.util.*;

public class ListEx1 {
	public static void main(String[] args) {
		// List 인터페이스로 세 객체 모두 생성 가능
		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = new Vector<Integer>();
//		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(0);
		System.out.println(list);
		// size() : element의 갯수
		// index 접근은 배열과 같다.
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + ":" + list.get(i) + "   ");
		}
		System.out.println();
		// for-each문도 잘 동작한다!
		for (Integer i : list) {
			System.out.print(i + "   ");
		}
		System.out.println();

		// jdk 8 이후 같은 자료형인 경우 <>로 표시 가능
		List<Integer> list2 = new ArrayList<>(list.subList(1, 4));
		System.out.println(list2);
		for (Integer i : list2) {
			System.out.print(i + "   ");
		}
		System.out.println();
	}
}
