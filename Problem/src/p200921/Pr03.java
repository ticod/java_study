
/*3. 다음 결과가 나오도록 프로그램 작성하시오

동전의 종류가 500, 100, 50, 10, 5, 1 이고,

각각의 동전이 5개가 있다고 가정할때

지정된 갯수만큼만 동전 변경하고, 변경 후의 남은 동전의 갯수 출력하기

[결과] 

금액을 입력하세요

36000

동전이 부족합니다.

​

금액을 입력하세요

3010

500원:5

100원:5

50원:0

10원:1

5원:0

1원:0

남은 동전 500원:0개

남은 동전 100원:0개

남은 동전 50원:5개

남은 동전 10원:4개

남은 동전 5원:5개

남은 동전 1원:5개*/

package p200921;

import java.util.Scanner;

class Wallet {
	final int[] KRW = {500, 100, 50, 10, 5, 1};

	int[] coin = new int[6];
	
	void init(int cnt) {
		for(int i = 0; i < 6; i++) {
			coin[i] = cnt;
		}
	}
	
	Boolean calc(int price) {
		for(int i = 0; i < 6; i++) {
			int tmp = (price/KRW[i] > coin[i]) ? coin[i] : price/KRW[i];
			price -= tmp * KRW[i];
			coin[i] -= tmp;
		}
		
		if(price != 0) {
			return false;
		} else {
			return true;
		}
	}
}

public class Pr03 {
	public static void main(String[] args) {
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int price = scan.nextInt();
		final int COUNT = 5;
		// 5개인 경우 전체 금액보다 입력한 금액이 높은 경우만 계산이 불가하다.
		
		Wallet w = new Wallet();
		w.init(COUNT);
		System.out.println();
		
		if(!w.calc(price)) {
			System.out.println("금액이 부족합니다.");
			return;
		} else {
			for(int i = 0; i < 6; i++) {
				System.out.printf("%d원: %d개\n", w.KRW[i], COUNT - w.coin[i]);
			}
		}
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("남은 동전 %d원: %d개\n", w.KRW[i], w.coin[i]);
		}
	}
}
