/*2. 다음의 결과가 나오도록 Card 클래스를 구현하기

[결과]
c1과 c2는 다른 객체입니다.
c1과 c2는 같은 내용의 카드 입니다.
c1 카드 :(Spade,1)
c2 카드 :(Spade,1)


public class Test2 {
   public static void main(String[] args) {
         Card c1 = new Card("Spade",1);
         Card c2 = new Card();
         if(c1==c2) {
              System.out.println("c1과 c2는 같은 객체입니다.");
         } else {
              System.out.println("c1과 c2는 다른 객체입니다.");
         }

         if(c1.equals(c2)) {
              System.out.println("c1과 c2는 같은 내용의 카드 입니다.");
          } else {
              System.out.println("c1과 c2는 다른 내용의 카드 입니다.");
          }

          System.out.println("c1 카드 :" + c1);
          System.out.println("c2 카드 :" + c2);
     }
}

​*/
package p201007;

class Card {
	String kind = "Spade";
	int number = 1;
	
	Card(){}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Card) {
			Card c = (Card)o;
			if(kind.equals(c.kind) && number == c.number)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return kind.hashCode() + number;
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%d)", kind, number);
	}
}

public class Test2 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card();
		if (c1 == c2) {
			System.out.println("c1과 c2는 같은 객체입니다.");
		} else {
			System.out.println("c1과 c2는 다른 객체입니다.");
		}

		if (c1.equals(c2)) {
			System.out.println("c1과 c2는 같은 내용의 카드 입니다.");
		} else {
			System.out.println("c1과 c2는 다른 내용의 카드 입니다.");
		}

		System.out.println("c1 카드 :" + c1);
		System.out.println("c2 카드 :" + c2);
	}
}
