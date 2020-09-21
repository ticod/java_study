
/*4. 강아지, 병아리의 합과 다리수의 합을 입력받아서 

강아지의 마리수와 병아리의 마리수를 출력하기.

계산이 안될 경우 정답없음 출력하기

​

[결과]

강아지와 병아리 의 합계를 입력하세요

10

강아지와 병아리 의 다리의 합계를 입력하세요

20

강아지는0마리이고, 병아리는10마리입니다.*/

package p200921;

import java.util.Scanner;

public class Pr04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("강아지와 병아리의 합계를 입력하세요");	
		int animals = scan.nextInt();
		System.out.println("강아지와 병아리의 다리 합계를 입력하세요");
		int legs = scan.nextInt();
		
		int dog = 0, chick = 0;
		for(dog = 0; dog < animals; dog++) {
			chick = animals - dog;
			if(4 * dog + 2 * chick == legs) {
				break;
			}
		}
		if(4 * dog + 2 * chick == legs) {
			System.out.printf("강아지는 %d마리이고, 병아리는 %d마리입니다.\n", dog, chick);
		} else {
			System.out.println("정답 없음");
		}
	}
}
