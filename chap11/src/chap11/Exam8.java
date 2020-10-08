/*
 * delChar 메서드 구현하기
 */
package chap11;

public class Exam8 {
	public static void main(String[] args) {
		System.out.println(
				delChar("(1!2@3&4~5)", "~!@#$%^&*()")); // 12345
		System.out.println(
				delChar("(1!2@3&4~5)", "12345")); // (!@^~)
	}
	
	static String delChar(String str, String del) {
		StringBuffer sb = new StringBuffer(str);
		for(int i = 0; i < del.length(); i++) {
			int idx = sb.indexOf(Character.toString(del.charAt(i)));
			if(idx >= 0) {
				sb.deleteCharAt(idx);
			}
		}
		return sb.toString();
	}
	
	// str에 del이 없다면 append
	static String delChar2(String str, String del) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length(); i++) {
			if(del.indexOf(str.charAt(i)) < 0)
				sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	// 2번과 동일하지만 contains 활용
	static String delChar3(String str, String del) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length(); i++) {
			if(!del.contains(str.charAt(i) + ""))
				sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
