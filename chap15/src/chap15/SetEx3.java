/*
 * TreeSet 예제
 *   Set 인터페이스의 하위 인터페이스인 SortedSet 구현 클래스
 *   특징 : 정렬 가능
 */
package chap15;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx3 {
	public static void main(String[] args) {
//		Set<String> set = new TreeSet<>(); // 컴파일 에러 => subset이 구현되어있지 않다.
//		TreeSet<String> set = new TreeSet<>();
		SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dzzz");
		set.add("dZZZ");
		set.add("elev");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("from: " + from + ", to: " + to);
		System.out.println(set.subSet(from, to));
		System.out.println("from: " + from + ", to: " + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz"));
		System.out.println("원본");
		
		System.out.println(set);
		System.out.println("\n역순으로 정렬하기");
		// since jdk8
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dzzz");
		set.add("dZZZ");
		set.add("elev");
		set.add("fan");
		set.add("flower");
		System.out.println(set);
		
		System.out.println("\n대소문자 구분없이 정렬하기");
		class IgnoreCase implements Comparator<String> {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		}
		set = new TreeSet<>(new IgnoreCase());
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dzzz");
		set.add("dZZZ");
		set.add("elev");
		set.add("fan");
		set.add("flower");
		System.out.println(set);
	}
}
