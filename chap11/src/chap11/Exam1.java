/*
 * hashCode 예제
 */
/*
1. equals() 로 비교시 두개의 오브젝트가 같다면, hashCode() 값도 같아야 한다.

2. equals() 로 비교시 false 라면, hashCode() 값은 다를수도, 같을수도 있다. 
   그러나 성능을 위해서는 hashCode() 값이 다른것이 낫다. 
   그래야 해싱 알고리즘으로 Set 에 해당 오브젝트가 존재하는지 아닌지 빠르게 검색할 수 있다.

3. hashCode() 값이 같다고 해서, eqauls() 가 true 를 리턴하는 것은 아니다. 
   해싱 알고리즘 자체의 문제로, 같은 해시값이 나올 수 있다.

출처: https://anster.tistory.com/160 [Old Lisper]
*/
package chap11;

class Card {
	String kind;
	int number;
	final int NUMBER_MAX = 10;
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
	    if(obj instanceof Card) {
	    	Card otherCard = (Card)obj;
	    	return this.kind.equals(otherCard.kind) &&
		    		this.number == otherCard.number;
	    }
	    return false;
	}
	@Override
	public int hashCode() {
//		int code = 0;
//		code = kind.charAt(0) * (NUMBER_MAX+1) + number;
//		return code;
		return kind.hashCode() + number;
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println("c1의 identity hash: " + System.identityHashCode(c1));
		System.out.println("c2의 identity hash: " + System.identityHashCode(c2));
		
		if(c1.equals(c2)) System.out.println("같은 카드");
		else System.out.println("다른 카드");
		if(c1 == c2) System.out.println("같은 객체");
		else System.out.println("다른 객체");
	}
}
