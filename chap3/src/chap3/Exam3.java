package chap3;
/*
 * 화면에서 금액 입력받아 500, 100, 50, 10, 1원 동전으로 바꾸기
 * 단, 전체 동전은 최소 개수로 바꿈
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원  : 4개
 * 1원   : 1개
 */
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price = 0;
		
		System.out.println("금액을 입력하세요");
		price = scan.nextInt();
		System.out.println();
		
		System.out.println("500원\t: " + price/500 + "개");
		System.out.println("100원\t: " + price%500/100 + "개");
		System.out.println("50원\t: " + price%500%100/50 + "개");
		System.out.println("10원\t: " + price%500%100%50/10 + "개");
		System.out.println("1원\t: " + price%500%100%50%10/1 + "개");
	}
}
