/*
 * 
 */
package chap11;

import java.util.Arrays;

class Value implements Comparable<Value> {
	int value;

	Value(int value) {
		this.value = value;
	}
	
	@Override
	public int compareTo(Value o) {
		return o.value - value; // 내림차순
//		return value - o.value; // 오름차순
		/*
		 * 메서드의 값이 음수인지 양수인지에 따라
		 * 정렬 순서가 달라진다.
		 */
	}
}

public class ArraysEx2 {
	public static void main(String[] args) {
		Value[] arr = { new Value(100), new Value(10), new Value(50), new Value(70) };
//		Arrays.sort(arr); // ClassCastException (cast = 형변환)
		//         : 클래스의 형변환 실패
		// Comparable로 형변환에 실패함 => Comparable 인터페이스를 구현해줘야 함
		
		Arrays.sort(arr);
		for(Value v : arr) System.out.println(v.value);
		
		String[] arr2 = {"a", "b", "A", "Z", "a"};
		Arrays.sort(arr2);
		for(String s : arr2) System.out.println(s);
	}
}
