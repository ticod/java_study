/*
 * TreeSet에 사용자 클래스 넣기 / 정렬 관련 인터페이스
 * 
 * 정렬 관련 인터페이스
 * 1. Comparable<T> 인터페이스 - TreeSet에 필요
 *    int compareTo(T) : 객체의 기본 정렬방식 지정
 * 2. Comparator<T> 인터페이스
 *    int compare(T, T) : 동적으로 정렬 방식을 변경 가능
 */
package chap15;

import java.util.*;

class PhoneNo implements Comparable<PhoneNo> {
	String name;
	int number;
	public PhoneNo(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return name + ":" + number;
	}
	
	@Override
	public int compareTo(PhoneNo o) {
//		return (name.hashCode() - o.name.hashCode()) * -1; // 된다..
		return name.compareTo(o.name);
	}
}

public class SetEx4 {
	public static void main(String[] args) {
		List<PhoneNo> list = new ArrayList<>();
		Set<PhoneNo> set = null;
		list.add(new PhoneNo("홍길동", 3456));
		list.add(new PhoneNo("김삿갓", 2345));
		list.add(new PhoneNo("이몽룡", 7890));
		
		System.out.println("이름 순으로 정렬"); 
		set = new TreeSet<>(); // Comparable 인터페이스 구현
		set.addAll(list);
		System.out.println(set);
		
		System.out.println("이름 역순으로 정렬");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.addAll(list);
		System.out.println(set);
		
		System.out.println("번호 순으로 정렬");
		set = new TreeSet<>((n1, n2) -> n1.number - n2.number);
		// 아래와 같다.
//		set = new TreeSet<>(new Comparator<PhoneNo>() {
//			@Override
//			public int compare(PhoneNo p1, PhoneNo p2) {
//				return p1.number - p2.number;
//			}
//		});
		set.addAll(list);
		System.out.println(set);
		
		System.out.println("번호 역순으로 정렬");
		set = new TreeSet<>((n1, n2) -> n2.number - n1.number);
		set.addAll(list);
		System.out.println(set);
	}
}
