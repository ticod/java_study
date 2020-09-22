/*3. 동전을 표현하는 Coin 클래스 구현하기

      멤버변수 :  동전의 면(side)

      멤버메서드 : flip() 

                기능 : 동전을 던져 동전의 면을 변경한다. Math.random() 메서드 이용. 앞면,뒷면 출력함.*/

package p200922;

class Coin {
	boolean side;
	// true  : 앞
	// false : 뒤
	void flip() {
		side = ((int)(Math.random() * 2) == 1);
	}
	public String toString() {
		return ((side) ? "앞면" : "뒷면");
	}
}

public class Pr3 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		
		for(int i = 0; i < 10; i++) {
			coin.flip();
			System.out.println(coin);
		}
	}
}
