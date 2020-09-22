/*1. Card 클래스가 다음과 같을때 다음의 결과가 나오도록 구동 클래스를 완성하시오

class Card {

String kind;

int number;

static int width = 100;

static int height = 250;

​

public String toString() {

return kind + ":" + number + "(" + width + "," + height +")";

}

}

[결과]

Heart:1(100,250)

Spade:1(100,250)

Heart:1(50,80)

Spade:1(50,80)*/

package p200922;

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height +")";
	}
}

public class Pr1 {
	public static void main(String[] args) {
		final String[] KIND = {"Heart", "Spade"};
		
		Card[] c = new Card[4];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].kind = KIND[i % 2];
			c[i].number = 1;
		}
		
		for(int i = 0; i < c.length/2; i++) {
			System.out.println(c[i]);
		}
		
		Card.width = 50;
		Card.height = 80;
		for(int i = c.length/2; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
