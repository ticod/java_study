/*
 * TreeSet 예제
 * lotto 번호 (1~45)의 임의의 숫자를 중복없이 6개를 찾아서 출력하기
 * TreeSet 이용
 */
package chap15;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Exam3 {
	public static void main(String[] args) {
		final int LOTTO_MAX = 45;
		final int LOTTO_COUNT = 6;
		Set<Integer> lotto = new TreeSet<>();
		while (lotto.size() < LOTTO_COUNT) {
			lotto.add(new Random().nextInt(LOTTO_MAX) + 1);
		}
		System.out.println(lotto);
		lotto = new TreeSet<>((l1, l2) -> l1 - l2);
		while (lotto.size() < LOTTO_COUNT) {
			lotto.add(new Random().nextInt(LOTTO_MAX) + 1);
		}
		System.out.println(lotto);
	}
}
