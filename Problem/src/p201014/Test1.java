/*
1 
화면에서 여러개의 자연수를 입력받아 이들 중 홀수 인 자연수들을 모두 골라 그합을 구하고, 
홀수중 최대값과 최소값을 찾는 프로그램을 작성하기
홀수 들로만 이루어진 List 객체를 생성하여 출력하기

7개의 자연수 : 12 77 38 41 53 92 85 인 경우
77 41 53 85 만 홀수 이므로

77+41+53+85 = 합 
홀 수의 최대값 : 85
홀 수의 최소값 : 41
입력된 홀수 : [77,41,53,85]
 */
package p201014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		
		// 아래와 같이 선언 후, while문에서 처리해주는 방법도 있음
//		int max = 0;
//		int min = Integer.MAX_VALUE;
		
		System.out.println("자연수를 입력하세요(종료:0)");
		while (true) {
			int num = scan.nextInt();
			if (num == 0) {
				break;
			}
			if (num % 2 == 0) {
				continue;
			}
			list.add(num);
			sum += num;
		}
		
		// size라는 멤버 변수를 반환하기 때문에 굳이 변수로 뺄 필요 X
//		int listSize = list.size(); 
		if(list.size() > 0) {
			int max = list.get(0);
			int min = list.get(0);
			for (Integer i : list) {
				System.out.print(i + ((list.indexOf(i) == list.size() - 1) ? " = " : "+"));
				// 중복시 오류
				max = (max < i) ? i : max;
				min = (min > i) ? i : min;
			}
			System.out.println(sum);
			System.out.println("홀수의 최대값: " + max);
			System.out.println("홀수의 최소값: " + min);
			System.out.println("최대값의 위치: " + list.indexOf(max));
			System.out.println("최소값의 위치: " + list.indexOf(min));
			System.out.println(list);
		}
		scan.close();
	}
}
