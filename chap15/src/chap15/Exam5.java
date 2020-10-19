/*
 * HashMap 예제 - Sutda
 * 
 * SutdaCard 클래스
 *   멤버 변수 : int num, boolean isKwang
 *   생성자 : 멤버 값들을 입력받아 객체 생성
 *            매개변수가 없는 경우 1, true인 객체 생성
 *   멤버 메서드 : toString() overriding
 *                 1K, 2, 3, ...
 *  
 * SutdaDeck 클래스
 *   멤버 변수: List<SutdaCard> cards;
 *              static Map<String, Integer> jokbo;
 *   생성자 : 매개변수 X
 *            SutdaCard 20장을 cards List에 저장
 *            1 ~ 10의 숫자를 가진 카드가 각각 2장씩,
 *            숫자 값이 1, 3, 8인 카드 중 한 장은 isKwang이 true
 *   멤버 메서드 : SutdaCard pick() : 첫 번째 카드를 제거하며 리턴
 *                 void shuffle() : cards 섞어주는 기능 => Collections.shuffle 메서드 이용
 *                 
 * Gamer 클래스
 *   멤버 변수 : String name
 *               SutdaCard c1, c2
 *   생성자 : 멤버 변수 값을 입력받아 객체 생성
 *   멤버 메서드 : int getScore() : c1, c2 카드의 점수 return
 *                   c1, c2 카드가 jokbo에 있는 경우 jokbo 점수 return
 *                   jokbo에 없는 경우 (c1.num + c2.num) % 10 return
 *                 toString() overriding
 *                   이름, 카드 2장을 문자열로 리턴
 */
package chap15;

import java.util.*;

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public String toString() {
		return num + ((isKwang)?"K":"");
	}
}

class SutdaDeck {
	List<SutdaCard> cards = null;
	static Map<String, Integer> jokbo = null;
	
	final int KWANG_ONE = 1;
	final int KWANG_THREE = 3;
	final int KWANG_EIGHT = 8;
	
	static {
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for (int i = 1; i <= 10; i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}
	
	SutdaDeck() {
		cards = new ArrayList<>();
		for(int i = 0; i < 20; i++) {
			cards.add(new SutdaCard(i%10+1, isKwangNumber(i+1)));
		}
	}
	
	private boolean isKwangNumber(int num) {
		return num == KWANG_ONE || num == KWANG_THREE || num == KWANG_EIGHT;
	}
	
	public SutdaCard pick() {
		return cards.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
}

class Gamer {
	String name;
	SutdaCard c1, c2;
	
	Gamer(String name, SutdaCard c1, SutdaCard c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public int getScore() {
		Integer score = 0;
		if (c1.isKwang && c2.isKwang) {
			score = SutdaDeck.jokbo.get("KK");
		} else {
			score = SutdaDeck.jokbo.get("" + c1.num + c2.num);
			if (score == null) {
				score = (c1.num + c2.num) % 10; 
			}
		}
		return score;
	}
	
	public String toString() {
		return name + ":" + c1 + c2;
	}
}

public class Exam5 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		List<Gamer> list = new ArrayList<>();
		list.add(new Gamer("홍길동", deck.pick(), deck.pick()));
		list.add(new Gamer("김삿갓", deck.pick(), deck.pick()));
		list.add(new Gamer("이몽룡", deck.pick(), deck.pick()));
		for (Gamer g : list) {
			System.out.println(g);
		}
		System.out.println("deck에 남은 카드의 갯수: " + deck.cards.size());

		Collections.sort(list, (g1, g2)-> g2.getScore() - g1.getScore());
		Gamer first = list.get(0);
		Gamer second = list.get(1);
		if (first.getScore() == second.getScore()) {
			System.out.println(first.name + "과(와) "+ second.name +"이(가) 비김");
		} else {
			System.out.println(first.name + "이(가) " + first.getScore() + "점으로 이겼습니다!");
		}
	}
}
