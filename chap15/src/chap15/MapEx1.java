/*
 * Map 인터페이스 : (Key, Value(객체)) 쌍으로 객체를 모아서 저장한다
 * 
 * 
 */
package chap15;

import java.util.*;

public class MapEx1 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234,4567,2350,9870,3456}; // -> Map에서 4567은 사라진다. (같은 key)
		// <String, Integer> : Key : String / Value : Integer
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		// key값으로 get하면 value를 반환한다. 없으면 null
		System.out.println("김삿갓의 전화번호: " + map.get("김삿갓")); // 3456
		System.out.println("홍길동의 전화번호: " + map.get("홍길동")); // 1234
		System.out.println("성춘향의 전화번호: " + map.get("성춘향")); // null
		// map의 key 조회 -> 중복 X => Set으로 받는다
		Set<String> keys = map.keySet(); // 중복 X = set을 반환한다.
		System.out.println(keys);
		for (String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		// map의 value 조회 -> 중복 O, 순서유지 불가능 => Collection으로 받는다
		Collection<Integer> values = map.values();
		System.out.println(values);
		// map (key,value) 쌍인 객체들을 조회 => Map.Entry<Key, Value>
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m);
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		// map에서 홍길동인 객체 제거
		Integer value = map.remove("김삿갓");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map의 요소의 개수: " + map.size()); // Entry의 개수를 반환한다.
	}
}
