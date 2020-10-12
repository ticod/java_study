/*
 * format(str, len, align) 함수 구현

 메서드명 : String format (String str,int len,int align)
 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 나머지 공간은 공백으로채운다.(0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬) 
 */
package p201008;

public class Test1 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 8, 0));
		System.out.println(format(str, 8, 1));
		System.out.println(format(str, 8, 2));
		System.out.println(format(str, 2, 0));
	}

	private static String format(String str, int len, int align) {
		int space = len - str.length();
		if(space < 0) {
			return str.substring(0, len);
		} else {
			// 가독성을 위해 switch문 사용
			switch (align) {
				case 0:
					return String.format("%s%"+space+"s", str, " ");
				case 1:
					int frontHalf = (int) Math.round(space / 2.0);
					int half = space/2;
					return String.format("%"+frontHalf+"s%s%"+half+"s", " ", str, " ");
				case 2:
					return String.format("%"+space+"s%s", " ", str);
				default:
					return "";
			}
		}
	}
}
