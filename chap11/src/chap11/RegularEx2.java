/*
 * 정규 표현식 예제
 * 
 * . 		: 문자 하나
 * ?		: 0 또는 1
 * +		: 1개 이상
 * *		: 0개 이상
 * ^		: 문자열의 시작
 * []		: [] 지정된 문자 한개 (범위도 지정할 수 있다)
 * [^]		: [] 지정된 문자 제외
 * |		: or (두 정규식 중 하나라도 해당될시)
 * &		: and	(두 정규식 다 해당)
 * {}		: 그룹
 * \s		: 공백 한 문자
 * \S		: 공백이 아닌 한 문자
 * \d		: 숫자
 * \D		: 숫자가 아닌 한 문자
 * \w		: 특수 문자가 아닌 한 문자 ( [a-zA-Z0-9]와 같다 - 완전히 같지는 않음)
 * \W		: 특수 문자
 * {n}		: n개의 문자 (ex. \d{3} : 숫자 세개)
 * {n,}		: 최소 n개의 문자 (n개 이상)
 * {n,m}	: n~m개 문자
 */
package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {
	public static void main(String[] args) {
		String[] patterns = {
			",", "[a-z]?", "[0-9]+", "^[0-9]", "[^0-9]",
			"[a-z]*", "[a-z]+", "02|010", "\\s", "\\S", "\\d",
			"\\w", "\\W"
		};
		String[] datas = {
			"", "a", "1", "12", "012", "abc", "02",
			" ", "A", "5", "a", "*"
		};
		for (String d : datas) {
			if (d.equals("")) {
				System.out.print("빈문자 \"\"의 패턴 =>");
			} else if (d.equals(" ")) {
				System.out.print("공백문자 \" \"의 패턴 =>");
			} else {
				System.out.print(d + "문자의 패턴 =>");
			}
			for (String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if (m.matches()) {
					System.out.print(p + ", ");
				}
			}
			System.out.println();
		}
	}
}
