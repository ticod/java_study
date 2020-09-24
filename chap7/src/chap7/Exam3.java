/*
 * Product 클래스
 *   멤버변수	: 가격, 포인트
 *   생성자	: 가격을 입력받고, 가격의 10%포인트로 저장
 * 
 * Tv 클래스
 *   생성자	: 가격을 100 설정하기
 *   toString:"Tv" 리턴
 * Computer 클래스
 *   생성자	: 가격을 200 설정하기
 *   toString:"Computer" 리턴
 */
package chap7;

/*
 * Product 클래스
 *   멤버변수	: 가격, 포인트
 *   생성자	: 가격을 입력받고, 가격의 10%포인트로 저장
 * 
 * Tv 클래스
 *   생성자	: 가격을 100 설정하기
 *   toString:"Tv" 리턴
 * Computer 클래스
 *   생성자	: 가격을 200 설정하기
 *   toString:"Computer" 리턴
 */
class Product {
	int price, point;
	Product(int price){
		this.price = price;
		this.point = price/10;
	}
}

class Tv extends Product {
	Tv(){
		super(100);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer(){
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

/*
 * Buyer 클래스
 *   멤버 변수		: money = 500, point
 *     			  Product[] items = new Product[5];
 *     			  int cnt;
 *   멤버 메서드
 *      void buy(Product p)
 *      1. p상품의 가격을 money에서 차감
 *      2. p상품의 point를 나의 point에 더함
 *      3. items에 p상품을 추가, cnt++
 *      4. p상품을 출력
 */

class Buyer {
	int money = 500;
	int point, cnt;
	Product[] items = new Product[5];
	
	void buy(Product p) {
		this.money -= p.price;
		this.point += p.point;
		items[cnt++] = p;
		System.out.println(p+"구입함");
	}
}

public class Exam3 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer cm = new Computer();
		Buyer b = new Buyer();
		b.buy(tv); b.buy(cm);
		System.out.println("고객의 잔액: " + b.money);
		System.out.println("고객의 포인트: " + b.point);
		System.out.print("구매한 제품: ");
		for(int i = 0; i < b.cnt; i++) {
			System.out.print(b.items[i] + ", ");
		}
		System.out.println();
	}
}
