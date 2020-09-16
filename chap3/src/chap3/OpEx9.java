/*
 * 대입 연산자 : =, +=, -=, *=, ...
 * 
 * 형식 : lvalue = rvalue
 * lvalue에는 변수만 가능
 * rvalue에는 리터럴, 변수, 수식 등 다 가능
 * rvalue의 값을 lvalue에 대입
 */
package chap3;

public class OpEx9 {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		num += 10;
		System.out.println(num);
		num /= 10;
		System.out.println(num);
		num *= 2+3;
		System.out.println(num);
	}
}
