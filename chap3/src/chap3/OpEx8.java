package chap3;
/*
 * 삼항 연산자 : 조건 연산자
 * (조건문) ? A : B 
 */
import java.util.Scanner;

public class OpEx8 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(((score>=70) ? "합격" : ((score>=60) ? "재시험 대상" : "불합격")) + "입니다.");
	}
}
