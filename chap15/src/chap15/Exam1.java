/*
 * List 예제 1
 * 
 * 화면에서 홀수개의 숫자를 입력받아 입력받은 숫자의 평균과 중간값 출력하기.
 */
package chap15;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		
		System.out.println("홀수개의 숫자를 입력하세요(종료:999)");
		while (true) {
			int num = scan.nextInt();
			if (num == 999) {
				break;
			}
			list.add(num);
			sum += num;
		}
		
		// list를 for문 돌릴 때는 for-each문을 사용하자
		// get()의 시간복잡도가 O(n)이기 때문에 for문 이용시 O(n^2)이 된다.
//		for (Integer i : list) {}
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3); list2.add(5); list2.add(7); list2.add(9);
		list.addAll(list2);
		
		if (list.size() % 2 == 0) {
			list.remove(list.size()-1);
		}
		
		System.out.println("입력 데이터: " + list);
		Collections.sort(list);
		System.out.println("입력 데이터: " + list);
		System.out.println("입력한 숫자의 합: " + sum);
		System.out.println("중간값: " + list.get(list.size()/2));
		System.out.println("평균값: " + sum/list.size());
		
		scan.close();
	}
}
