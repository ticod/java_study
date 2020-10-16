/*
1. 다음 결과가 나오도록 프로그램을 작성하시오

1 ~ 1000번까지의 번호를 가지는 복권이 있다.
1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

LinkedHashSet : 순서유지, 중복불가
Random
new ArrayList(Set) : Set 객체를 List객체로 생성

[결과]
3등 복권 추첨합니다.
945
123
6

2등 복권 추첨합니다.
611
404

1등 복권 추첨합니다.
797

*** 복권 추첨 결과 ***
1등:797,
2등:404,611,
3등:6,123,945, 
 */
package p201015;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test1 {
	
	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> lotto = new LinkedHashSet<>();
		
		final int MIN_RANK = 3; // 3등까지
		final int LOTTO_COUNT = MIN_RANK * (MIN_RANK + 1) / 2;
		
		// 조건을 두번 비교할 필요 X
//		for (int i = 0; i < LOTTO_COUNT; i++)
//			if(!lotto.add(random.nextInt(1000) + 1)) i--;
		while(lotto.size() < 6) {
			lotto.add(random.nextInt(1000) + 1);
		}
		List<Integer> list = new ArrayList<>(lotto);
		List<List<Integer>> rankList = new ArrayList<>();
		for (int i = 0; i < MIN_RANK; i++) {
			rankList.add(list.subList(calcLottoCount(MIN_RANK, i), calcLottoCount(MIN_RANK, i+1)));
		}
		
		System.out.println();
		int idx = 0;
		for (List<Integer> l : rankList) {
			printLotto(l, MIN_RANK - idx++);
		}
		
		System.out.println("*** 복권 추첨 결과 ***");
		for (int i = MIN_RANK - 1; i >= 0; i--) {
			System.out.println((MIN_RANK - i) + "등: " + rankList.get(i));
		}
	}
	
	public static void printLotto(List<Integer> list, int rank) {
		System.out.println(rank + "등 복권 추첨합니다");
		for (Integer number : list) {
			System.out.println(number);
		}
		System.out.println();
	}
	
	public static int calcLottoCount(int minRank, int index) {
		int lottoCount = minRank * (minRank+1) / 2;
		return lottoCount - ((minRank - index)*(minRank - index + 1))/2;
	}
}
