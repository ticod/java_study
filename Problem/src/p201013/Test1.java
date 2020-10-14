/*
1. 다음 결과가 나오도록 프로그램을 작성하시오

[결과]
찾고자 하는 번호를 입력하세요(종료:q)
3456
012-3456-7890
013-3456-7890
찾고자 하는 번호를 입력하세요(종료:q)
1111111
찾는 번호가 없습니다.
찾고자 하는 번호를 입력하세요(종료:q)
7890
012-3456-7890
013-3456-7890
찾고자 하는 번호를 입력하세요(종료:q)
q

public class Test1 {
	public static void main(String[] args) {
		String[] phoneNumberArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890",
		};
	}

	​*/
package p201013;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	public static void main(String[] args) {
		String[] phoneNumberArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890",
		};
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
			String str = scan.nextLine();
			if (str.equals("q")) {
				break;
			}
			// replace, matches를 이용한 풀이
			// 
			Pattern p = Pattern.compile(".*"+str+".*");
			int matchCount = 0;
			for (String phoneNumber : phoneNumberArr) {
				Matcher m = p.matcher(phoneNumber.replace("-", ""));
				if (m.matches()) {
					System.out.println(phoneNumber);
					matchCount++;
				}
			}
			if (matchCount == 0) {
				System.out.println("찾는 번호가 없습니다.");
			}
			// m.find를 이용한 풀이 (선생님 풀이)
			// -을 포함하여 검색은 X
			Pattern p2 = Pattern.compile(str);
			int matchCount2 = 0;
			for (String phoneNumber : phoneNumberArr) {
				Matcher m = p2.matcher(phoneNumber);
				if (m.find()) {
					System.out.println(phoneNumber);
					matchCount2++;
				}
			}
			if (matchCount2 == 0) {
				System.out.println("찾는 번호가 없습니다.");
			}
		}
	}
}
