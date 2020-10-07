/*
 * String 클래스의 주요 메서드
 */
package chap11;

public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		
		// charAt(int index)
		// s 문자열에서 4번 index (5번째) 문자를 return
		System.out.println(s.charAt(4)); // E
		
		// compareTo(String)
		// 'A' - 'a' = -32 return, 정렬시 사용되는 메서드
		// 0이면 같은 문자열
		System.out.println(s.compareTo("abc")); // -32
		// compareToIgnoreCase : 대소문자 상관 X
		System.out.println(s.compareToIgnoreCase("abc"));
		
		// concat(String) : +연산
		System.out.println(s.concat("abc")); // s + "abc"
		
		// endsWith(String) : 문자열의 끝이 String인지?
		// startsWith(String) : 문자열의 시작이 String인지?
		System.out.println(s.endsWith("GH")); // true
		System.out.println(s.startsWith("ABC")); // true
		
		// equals(String) : 똑같은가?
		// equalsIgnoreCase(String) : 대소문자 상관 없이
		System.out.println(s.equals("ABCDEFGH")); // true
		System.out.println(s.equals("abcdefgh")); // true
		
		s = new String("This is a String");
		
		// indexOf(int ch) / indexOf(String)
		// ch/String의 위치 인덱스값 리턴
		System.out.println(s.indexOf('i')); // 2
		System.out.println(s.indexOf("is")); // 2
		// indexOf(int ch, int index)
		// index부터 시작하여(포함하여) ch의 문자 인덱스값 리턴
		System.out.println(s.indexOf('i', 5)); // 5
		System.out.println(s.indexOf('i', 15)); // -1 : 해당 문자 없음
		// lastIndexOf() : 뒤에서부터 찾음
		// 단, 반환되는 index값은 똑같이 앞에서 시작된다.
		System.out.println(s.lastIndexOf("is")); // 2
		
		// length() : 문자열의 길이 리턴
		System.out.println(s.length()); // 16
		
		// replace(원본, 변경) : 원본 문자열 => 변경 문자열
		// 새로운 객체가 생성되고, 반환한다. 반환값을 받지 않으면 원본 문자열 유지
		System.out.println(s.replace("is",  "QR")); // ThQR QR a String
		
		// substring
		System.out.println(s.substring(5)); // 5번 index 이후의 문자열 return    => is a String
		System.out.println(s.substring(5, 13)); // 5 ~ (13 - 1) index의 문자열 return  => is a Str
		
		// toLowerCase() : 소문자로 변경
		// toUpperCase() : 대문자로 변경
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		// trim() : 양쪽 공백 제거
		System.out.println("    문자열 trim    ");
		System.out.println("    문자열 trim    ".trim());
		
		// split(String) : 문자열 분리
		// 해당 문자열을 기준으로 잘라서 배열에 넣음
		String[] sarr = "홍길동,이몽룡,김삿갓".split(",");
		for(String ss : sarr) System.out.println(ss);
	}
}
