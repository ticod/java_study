package chap3;
/*
 * 증감 연산자
 */
public class OpEx1 {

	public static void main(String[] args) {
		int x=5, y=5;
		x++; // 후위형
		y--;
		System.out.println("x="+x+", y="+y);
		++x; // 전위형
		--y;
		System.out.println("x="+x+", y="+y);
		
		x=y=5;
		y=++x;
		System.out.println("x="+x+", y="+y);
		
		x=y=5;
		y=x++;
		System.out.println("x="+x+", y="+y);
		// System.out : 표준 출력 객체, 콘솔 출력 객체
		
		x=5;
		System.out.println("x="+ x++);
		System.out.println("x="+ ++x);
	}

}
