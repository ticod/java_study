/*
1. SutdaDeck을 이용한 SutdaCard 게임을 한다고 할때. 
   게임할 인원수를 입력받아, 인원수만큼의 Gamer를 생성하고
   각각 총점을 기준으로 순위를 작성하는 프로그램을 구현하기
   단 인원수는 2 ~ 10명으로 한다. 이 범위를 벋어나는 경우 다시 입력받음.
 */
package p201019;

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
		shuffle();
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

public class Test1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		List<Gamer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		// 참가 인원 입력받기
		int gamerNumber = 0;
		while (gamerNumber < 2 || gamerNumber > 10) {
			System.out.println("섯다 게임에 참여할 인원 수 입력 (2~10)");
			gamerNumber = scan.nextInt();
		}
		
		// 참가자 카드 뽑기
		for (int i = 0; i < gamerNumber; i++) {
			list.add(new Gamer((i+1) + "번 참가자", deck.pick(), deck.pick()));
		}
		
		// 참가자 별 카드 출력
		for (Gamer g : list) {
			System.out.println(g);
		}
		
		// 순위 결정
		Collections.sort(list, (g1, g2)-> g2.getScore() - g1.getScore());
		
		// 결과 출력
		int i = 1;
		int j = 0; // 공동 등수 확인
		for (Gamer g : list) {
			j = (i != 1 && g.getScore() == list.get(i-2).getScore()) ? j + 1 : 0;
			System.out.println((i++ - j) + "등:\t" + g.name + "\t점수: " + g.getScore());
		}
		scan.close();
	}
}
