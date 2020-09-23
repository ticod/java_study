/*
 * 구동 클래스를 실행했을 때 결과가 출력되도록 SutdaCard 클래스를 구현하기
 * 멤버 변수는 int number, boolean isKwang 가 있다.
 * [결과]
 * 3
 * 1K
 */
package chap6;

class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard(){
		number = 1;
		isKwang = true;
	}
	SutdaCard(int n, boolean b){
		number = n;
		isKwang = b;
	}
	public String toString() {
		return number + ((isKwang) ? "K" : "");
	}
}

public class Exam3 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1);
		System.out.println(card2);
	}
}
