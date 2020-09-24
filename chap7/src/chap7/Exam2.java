/*
 * SutdaCard 클래스
 *   멤버변수: int number, boolean isKwang
 *   생성자   : 구동 클래스에 맞도록 구현
 *   멤버메서드: toString을 결과에 맞도록 오버라이딩
 *   
 * SutdaDeck 클래스 구현
 *   멤버변수: cards - SutdaCard 20장을 저장할 배열
 *   생성자: SutdaCard 20장을 생성하여 cards 배열에 저장
 *   메서드: toString() 오버라이딩하여 결과가 출력되도록 구현
 *         shuffle():cards 20장의 카드를 섞기
 *         SutdaCard pick(int index) : index에 해당하는 카드 한 장 리턴
 *         SutdaCard pick() : 임의의 카드 한장 리턴
 *         
 * [결과]
 * 1K,2,3K,4,5,6,7,8K,9,10,1,2,...
 * 7,3K,8,4,2,2,4,...
 */
package chap7;

class SutdaCard {
	int number;
	boolean isKwang;
	
	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	
	@Override
	public String toString() {
		return this.number + ((this.isKwang)?"K":"");
	}
}

class SutdaDeck {
	SutdaCard[] card = new SutdaCard[20];
	SutdaDeck(){
		for(int i = 0; i < card.length; i++) {
			card[i] = new SutdaCard(i%10+1, false);
		}
		card[0].isKwang = true;
		card[2].isKwang = true;
		card[7].isKwang = true;
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i = 0; i < card.length; i++) {
			result += (card[i] + ((i!=card.length-1)?",":""));
		}
		return result;
	}
	
	void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int f = (int)(Math.random() * card.length);
			int t = (int)(Math.random() * card.length);
			swap(f, t);
		}
	}
	
	void swap(int index1, int index2) {
		SutdaCard tmp = card[index1];
		card[index1] = card[index2];
		card[index2] = tmp;
	}
	
	SutdaCard pick(int index) {
		return card[index];
	}
	
	SutdaCard pick() {
		return card[(int)(Math.random() * card.length)];
	}
	
}

public class Exam2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println("첫 번째 카드: " + deck.pick(0));
		System.out.println("랜덤 선택 카드: " + deck.pick());
	}
}
