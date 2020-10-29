package chap16;

import java.util.Random;

public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.print("int형 난수 3개 스트림 생성: ");
		new Random().ints(3).forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.print("0 ~ 2 int형 난수 10개 스트림 생성: ");
		new Random().ints(10, 0, 3).forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.print("long형 난수 3개 스트림 생성: ");
		new Random().longs(3).forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.print("0 ~ 9 long형 난수 3개 스트림 생성: ");
		new Random().longs(3, 0, 10).forEach(s->System.out.print(s + " "));
		System.out.println();
		
		// char형 stream은 존재하지 않는다. 그래서 intstream을 활용한다
		System.out.print("char형 난수 3개 스트림 생성: ");
		new Random().ints(3, 'A', 'Z' + 1).forEach(s->System.out.print((char)s + " "));
		System.out.println();
		
		// double형의 경우 1을 넘지 않는다.
		System.out.print("double형 난수 3개 스트림 생성: ");
		new Random().doubles(3).forEach(s->System.out.print(s + " "));
		System.out.println();
	}
}
