/*
 * Coin 클래스를 이용
 * 두 개의 Coin 객체를 생성, myCoin / youCoin
 * 앞 면이 연속 3번 나오면 승리 => myCoin 승리 / youCoin 승리 / 비김
 */
package chap6;

class Coin {
	boolean side;
	void flip() {
		side = ((int)(Math.random()*2) == 1) ? true : false;
	}
	public String toString() {
		return (side) ? "앞면" : "뒷면";
	}
}

public class Exam5 {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		
		int myCoinCount = 0;
		int youCoinCount = 0;
		
		while(true) {
			myCoin.flip();
			youCoin.flip();
			
			if(myCoin.side)		myCoinCount++;
			if(youCoin.side)	youCoinCount++;
			
			System.out.println(myCoin + "\t" + youCoin);
			
			if(myCoinCount >= 3 || youCoinCount >= 3) {
				break;
			}		
		}
		if(myCoinCount == youCoinCount) {
			System.out.println("비김");
		} else if (myCoinCount == 3) {
			System.out.println("myCoin 승리");
		} else {
			System.out.println("youCoin 승리");
		}
	}
}
