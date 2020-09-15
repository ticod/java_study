package chap3;
/*
1. 다음 프로그램의 결과값을 예측해 보시오.
class OpEx01 {
	public static void main (String []args) {
		System.out.println (6 ^ 3); 
	}
}
6 = 0000 0110 이다. (원래는 integer형이므로 32bit)
3 = 0000 0011 이다.
^ 연산자는 XOR 연산자이므로 6^3 (XOR) = 0000 0101이고, 5가 출력된다.

2. 다음 프로그램의 결과값을 예측해 보시오.
class OpEx02 {
	public static void main (String []args) {
		System.out.println (3/2); 
		System.out.println (3<2); 
		System.out.println (3*4); 
		System.out.println (3<<2);
		System.out.println (3*2^2); 
	}
}
1        :두 int형 정수의 나누기이므로 결과값도 int형인 1
false  : 3이 2보다 작은지 비교하는 관계 연산자로, false
12      : 곱하기 연산
12      : 시프트 연산으로, 0000 0011 << 2 = 0000 1100
4        : 곱하기, XOR 연산으로, 우선순위가 곱하기 우선이므로 3*2 = 6, 6^2 = 0000 0100

3. 아래 프로그램의 실행 결과를 기술하시오. 
class OpEx03{
	public static void main(String args[]) {
		int a=10,b=20;
		int c;
		c = ++a + ++b;
		System.out.println("1.a="+a+"\tb="+b+"\tc="+c);
		c = a++ + b++;
		System.out.println("2.a="+a+"\tb="+b+"\tc="+c);
		c = a++ + ++b;
		System.out.println("3.a="+a+"\tb="+b+"\tc="+c);
		c = ++a + b++;
		System.out.println("4.a="+a+"\tb="+b+"\tc="+c);
		
		c = --a + --b;
		System.out.println("5.a="+a+"\tb="+b+"\tc="+c);
		c = a-- + b--;
		System.out.println("6.a="+a+"\tb="+b+"\tc="+c);
		c = a-- + --b;
		System.out.println("7.a="+a+"\tb="+b+"\tc="+c);
		c = --a + b--;
		System.out.println("8.a="+a+"\tb="+b+"\tc="+c);
	}
}
1. a = 11, b = 21, c = 32
2. a = 12, b = 22, c = 32
3. a = 13, b = 23, c = 35
4. a = 14, b = 24, c = 37
5. a = 13, b = 23, c = 36
6. a = 12, b = 22, c = 36
7. a = 11, b = 21, c = 33
8. a = 10, b = 20, c = 31
전위 연산자는 제일 먼저 계산되고, 후위 연산자는 제일 마지막에 계산된다.

4. 밑변과 높이를 입력받아 삼각형의 넓이를 구하시오  OpEx04.java
[결과]
밑변의 길이 : 7
높이의 길이 : 5
넓이 : 17.5
*/
import java.util.Scanner;

public class Pr0915_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = 0;			// 밑변
		int altitude = 0; 	// 높이
		
		// 밑변, 높이 입력
		System.out.print("밑변의 길이 : ");
		base = scan.nextInt();
		System.out.print("높이의 길이 : ");
		altitude = scan.nextInt();
		
		// 넓이 출력 (밑변 * 높이 / 2)
		System.out.println("넓이 : " + (base * altitude / 2.0));
	}
}
