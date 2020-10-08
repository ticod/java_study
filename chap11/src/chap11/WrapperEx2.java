/*
 * Character 클래스의 여러 메서드
 */
package chap11;

public class WrapperEx2 {
	public static void main(String[] args) {
		char[] data = {'A', 'a', '1', '&', '가'};
//		String s = new String(data); << 다음과 같이 String 생성이 가능하다.
		char d = 'a';
		
		for(char c : data) {
			if(Character.isUpperCase(c)) {
				System.out.println(c + ": 대문자 입니다.");
			} else if(Character.isLowerCase(c)) {
				System.out.println(c + ": 소문자 입니다.");
			} else if(Character.isDigit(c)) {
				System.out.println(c + ": 숫자 입니다.");
			} else {
				System.out.println(c + ": 그 외 문자 입니다.");
			}
			
			if(Character.isAlphabetic(c)) {
				System.out.println("문자입니다.");
			} else {
				System.out.println("문자가 아닙니다.");
			}
		}
	}
}
