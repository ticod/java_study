/*
 * switch 구문 예제
 *   switch(조건값(변수, 수식)){
 *   	case 값 1 : 문장 1; break;
 *   	case 값 2 : 문장 2; break;
 *   	...
 *   	default : 문장 n;
 *   }
 */
package chap4;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		switch(score/10) {
			case 10: grade = "A"; break;
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F"; break;
		}
		System.out.println(score + "점은 " + grade + "학점 입니다.");
		String result;
		switch(score/10) {
			case 10: case 9: case 8: case 7: case 6: result = "PASS"; break;
			default: result = "FAIL"; break;
		}
		System.out.println(result);
	}
}
