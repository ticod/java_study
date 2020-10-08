/*
 * fillZero(src, num) 함수 구현
 * 
 기능 : 주어진 문자열(숫자)로 주어진 길이의 문자열로 만들고, 
 왼쪽 빈 공간은 0으로 채운다.
 만일 주어진 문자열이 null이거나 
 문자열의 길이가 length의 값과 같으면 그대로 반환한다.
 만일 주어진 length의 값이 0과 같거나 작은 값이면 
 빈 문자열("")을 반환한다.
 반환타입 : String
 매개변수 : String src, int length
 */
package p201008;

public class Test3 {
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
		System.out.println(fillZero(null, 3));
	}
	private static String fillZero(String src, int length) {
		if(src == null) {
			return null;
		} else {
			if(length > 0) {
				return String.format("%0"+length+"d", Integer.parseInt(src));
			} else {
				return "";
			}
		}
	}
}
