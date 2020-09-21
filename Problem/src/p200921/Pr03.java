
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
	int krw500;
	int krw100;
	int krw50;
	int krw10;
	int krw5;
	int krw1;
	int sum;
	
	void sum() {
		sum = krw500 * 500 + krw100 * 100 + krw50 * 50 + krw10 * 10 + krw5 * 5 + krw1 * 1;
	}
	
	Boolean calc(int price) {
		int tmp = (price/500 > krw500) ? krw500 : price/500;
		price -= tmp * 500;
		krw500 -= tmp;
		
		tmp = (price/100 > krw100) ? krw100 : price/100;
		price -= tmp * 100;
		krw100 -= tmp;
		
		tmp = (price/50 > krw50) ? krw50 : price/50;
		price -= tmp * 50;
		krw50 -= tmp;
		
		tmp = (price/10 > krw10) ? krw10 : price/10;
		price -= tmp * 10;
		krw10 -= tmp;
		
		tmp = (price/5 > krw5) ? krw5 : price/5;
		price -= tmp * 5;
		krw5 -= tmp;
		
		tmp = (price/1 > krw1) ? krw1 : price/1;
		price -= tmp * 1;
		krw1 -= tmp;
		
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
		
		Wallet w = new Wallet();
		w.krw500 = COUNT;
		w.krw100 = COUNT;
		w.krw50 = COUNT;
		w.krw10 = COUNT;
		w.krw5 = COUNT;
		w.krw1 = COUNT;
		System.out.println();
		
		if(!w.calc(price)) {
			System.out.println("금액이 부족합니다.");
			return;
		} else {
			System.out.println("500원: " + (COUNT - w.krw500) + "개");
			System.out.println("100원: " + (COUNT - w.krw100) + "개");
			System.out.println("50원: " + (COUNT - w.krw50) + "개");
			System.out.println("10원: " + (COUNT - w.krw10) + "개");
			System.out.println("5원: " + (COUNT - w.krw5) + "개");
			System.out.println("1원: " + (COUNT - w.krw1) + "개");
		}
		System.out.println();
		
		System.out.println("남은 동전 500원: " + w.krw500 + "개");
		System.out.println("남은 동전 100원: " + w.krw100 + "개");
		System.out.println("남은 동전 50원: " + w.krw50 + "개");
		System.out.println("남은 동전 10원: " + w.krw10 + "개");
		System.out.println("남은 동전 5원: " + w.krw5 + "개");
		System.out.println("남은 동전 1원: " + w.krw1 + "개");
	}
}
