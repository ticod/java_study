/*
 * Map 예제
 * 1. 대한민국=서울, 캐나다=오타와, 영국=런던을 HashMap에 저장하고,
 *    화면에서 나라 이름을 입력받아 해당 나라의 수도를 출력하는 프로그램 구현하기
 *    만약 등록된 나라가 아닌 경우 등록된 나라가 아닙니다. 메세지 출력하기
 */
package chap15;

import java.util.*;

public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] countrys = { "대한민국", "캐나다", "영국" };
		String[] capitals = { "서울", "오타와", "런던" };
		Map<String, String> map = new HashMap<>();
		final String end = "종료";

		for (int i = 0; i < countrys.length; i++) {
			map.put(countrys[i], capitals[i]);
		}
		while (true) {
			System.out.println("나라 이름을 입력하세요");
			String input = scan.next();
			if (input.equals(end)) {
				System.out.println("프로그램 종료");
				break;
			}
			if (map.containsKey(input)) {
				System.out.println(input + "의 수도는 " + map.get(input));
			} else {
				System.out.println("등록된 나라가 아닙니다.");
			}
		}
		scan.close();
	}
}


