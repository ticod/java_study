/*
 * TreeMap 예제 : key값으로 정렬
 */
package chap15;

import java.util.TreeMap;

public class MapEx2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "홍길동"); scores.put(98, "이몽룡");
		scores.put(75, "임꺽정"); scores.put(94, "김삿갓");
		scores.put(80, "성춘향"); scores.put(88, "향단이");
		System.out.println(scores);
		System.out.println("첫 번째 key: " + scores.firstKey());
		System.out.println("첫 번째 entry: " + scores.firstEntry());
		System.out.println("첫 번째 entry key: " + scores.firstEntry().getKey());
		System.out.println("첫 번째 entry value: " + scores.firstEntry().getValue());
		System.out.println("마지막 entry: " + scores.lastEntry());
		System.out.print("95점 아래 점수: ");
		System.out.println(scores.lowerEntry(95));
		System.out.print("95점 위 점수: ");
		System.out.println(scores.higherEntry(95));
		System.out.print("95점 아래 점수(95점 포함): ");
		System.out.println(scores.floorEntry(95));
		System.out.print("95점 위 점수(95점 포함): ");
		System.out.println(scores.ceilingEntry(95));
	}
}
