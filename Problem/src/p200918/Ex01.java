/*숫자 맞추기 게임
시스템이 4자리의 서로 다른 수를 저장한 후
사용자가 저장된 수를 맞추는 게임
자리수도 맞는 경우 : 스트라익
자리수는 틀리지만 숫자가 존재하면 : 볼
4스트라익이 되면 정답

알고리즘
1. 시스템의 수를 지정 (Random함수 사용) 중복 되지 않도록 서로다른 4자리 수 저장(0 ~ 9)
2. 화면으로 부터 4자리 정수를 입력
3. 시스템의 수와 입력된 수를 비교하여
스트라익, 볼을 결정, 화면 출력
4. 4스트라익이 될때 까지 2,3 을 계속 실행 
5. 정답인 된경우 몇번만에 정답을 맞췄는지 
입력 갯수를 화면에 출력하기
​
[결과]
서로다른 4자리 정수를 입력하세요
1234

1234:2스트라익, 0볼

서로다른 4자리 정수를 입력하세요
5678

5678:0스트라익, 2볼

서로다른 4자리 정수를 입력하세요
6742

6742:2스트라익, 1볼

서로다른 4자리 정수를 입력하세요
6734

6734 정답입니다.

4번 만에 맞추셨습니다. 게임을 종료합니다.*/
package p200918;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int MAXIMUM = 10;
		int[] usrNumber = new int[4];
		int[] comNumber = new int[4];
		int count = 0;
		String answer;
		
		// 초기화
		int[] randomArr = new int[MAXIMUM];
		for(int i = 0; i < MAXIMUM; i++) {
			randomArr[i] = i;
		}
		for(int i = 0; i < 1000; i++) {
			int a = (int)(Math.random() * MAXIMUM);
			int b = (int)(Math.random() * MAXIMUM);
			int tmp = randomArr[a];
			randomArr[a] = randomArr[b];
			randomArr[b] = tmp;
		}
		for(int i = 0; i < comNumber.length; i++) {
			comNumber[i] = randomArr[i];
		}
		
		// 테스트 답안 출력
		for(int i = 0; i < 4; i++) {
			System.out.print(comNumber[i]);
		}
		System.out.println();
		
		// 야구 게임 시작
		while(true) {
			int ball = 0, strike = 0;
			
			System.out.println("서로 다른 4자리 정수를 입력하세요");
			answer = scan.next();
			
			// 입력값 검사
			boolean check = false;
			if(answer.length() != usrNumber.length) continue;
			for(int i = 0; i < answer.length() - 1; i++) {
				if(answer.charAt(i) < '0' || answer.charAt(i) > '9' || check) {
					check = true;
					break;
				}
				for(int j = i+1; j < answer.length(); j++) {
					if(answer.charAt(i) == answer.charAt(j)) {
						check = true;
						break;
					}
				}
			}
			if(check) continue;
			
			// 숫자로 변환
			for(int i = usrNumber.length - 1; i >= 0; i--) {
				usrNumber[i] = (int)(answer.charAt(i) - '0');
			}
			
			// 스트라이크, 볼 계산
			for(int i = 0; i < usrNumber.length; i++) {
				for(int j = 0; j < comNumber.length; j++) {
					if(usrNumber[i] == comNumber[j]) {
						if(i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			
			count++;
			if(strike == usrNumber.length) {
				break;
			} else {
				System.out.println(answer + ": " + strike + "스트라이크, " + ball + "볼");
			}
		}
		System.out.println("정답입니다!");
		System.out.println(count + "번 만에 맞추셨습니다. 게임을 종료합니다.");
	}
}
