/*
 * 정규 표현식 예제 : 문자의 형식을 지정하여
 */
package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "car", "combat", "count", "cTT", "data", "disk", "c"};
		/*
		 * c[a-z]* 	: 첫 번째 문자가 c이면서, 이후의 문자들이 소문자
		 *            * : 0개 이상
		 * c[a-z] 	: 첫 번째 문자가 c고, 두 번째 문자는 소문자
		 *            => *이 없기 때문에 두 번째 문자가 없을 경우도 제외된다.
		 * c[a-z]+ 	: 첫 번째 문자가 c이면서, 이후의 문자들이 소문자
		 *            + : 1개 이상
		 *            ? : 0개 또는 1개
		 */
		Pattern p = Pattern.compile("c[a-z]+");
		for (String s : data) {
			Matcher m = p.matcher(s); // s가 p에 맞는지 확인
			if (m.matches()) { // 맞다면 true
				System.out.println(s + ",");
			}
		}
		System.out.println();
		
		String names = "홍길동,    김삿갓 ,    이몽룡   ,  성춘향   ,  임꺽정 ";
		/*
		 * \\s : 공백, * : 0개 이상
		 * \\s*,\\s* : ,를 기준으로 앞 뒤 공백을 포함하여 문자열을 나눈다
		 */
		String[] arr = names.split("\\s*,\\s*");
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
