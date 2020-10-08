/*
 * StringBuffer 메서드
 */
package chap11;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// append
		// 뒤에 요소 추가
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb); // abc123Afalse
		
		// delete
		// startIndex ~ endIndex-1 삭제
		sb.delete(2, 4);
		System.out.println(sb); // ab23Afalse
		
		// deleteCharAt
		// index 삭제
		sb.deleteCharAt(4);
		System.out.println(sb); // ab23false
		
		// insert
		// index에 요소(문자열, 정수 등) 추가
		sb.insert(5, "==");
		System.out.println(sb); // ab23f==alse
		sb.insert(6, 1.23);
		System.out.println(sb); // ab23f=1.23=alse
		
		sb = new StringBuffer("ABCDEFG");
		// replace
		// startIndex ~ endIndex-1을 해당 String으로 변경
		// String의 길이가 start~end index의 범위를 벗어나는 경우 추가함
		// 즉, delete(s, e) 후에 startIndex에 해당 String을 놓는다
		sb.replace(0, 3, "abc");
		System.out.println(sb);
		sb.replace(0, 3, "ABCD");
		System.out.println(sb);
		sb.replace(0, 3, "ab");
		System.out.println(sb);
		
		// reverse
		// 문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
	}
}
