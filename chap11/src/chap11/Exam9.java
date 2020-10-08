/*
 * Random 클래스 예제
 * 
 * true / false 값을 난수로 발생
 * 시스템 혹은 사용자에서 3번 연속 true가 나온 쪽이 승리
 * 
 * 여러 개의 난수 시드를 만들고 싶다면
 * System.currentTimeMilis에 변수를 더한 시드를 주면 된다.
 */
package chap11;

import java.util.Random;

public class Exam9 {
	public static void main(String[] args) {
		int userPoint = 0, comPoint = 0;
		boolean user, com;
		while (true) {
			user = getRandomBool();
			com = getRandomBool();
			System.out.println("시스템 " + user + "\t사용자 " + com);
			userPoint = getPoint(user, userPoint);
			comPoint = getPoint(com, comPoint);
			if (userPoint == 3 && comPoint == 3) {
				System.out.println("비겼습니다.");
				break;
			} else if (userPoint == 3) {
				System.out.println("이겼습니다!");
				break;
			} else if (comPoint == 3) {
				System.out.println("졌습니다...");
				break;
			}
		}
	}

	static boolean getRandomBool() {
		return new Random().nextBoolean();
	}

	static int getPoint(boolean b, int point) {
		return (b) ? ++point : 0;
	}
}
