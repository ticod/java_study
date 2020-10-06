/*
3 
1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 
값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
단 1 부터 100까지의 숫자가 아닌 경우에는 1 과 100사이의 숫자만 입력하세요를 출력하고 
숫자 아닌 경우 숫자만 입력하세요를 출력하고 계속 입력을 받는다.
몇번의 입력만에 숫자를 맞추었는지 출력하기.
단 입력 오류된 입력도 입력 건수에 포함된다.


public class Test3 {
      public static void main(String[] args) {
      }
}
*/
package p201006;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comNum = (int)(Math.random() * 100) + 1;
		int count = 0;
		System.out.println(comNum);
		while(true) {
			int num = 0;
			count++;
			System.out.print("1부터 100까지의 숫자를 입력하세요: ");
			
			try {
				num = scan.nextInt();
				if(1 > num || 100 < num)
					throw new Exception("1과 100사이의 숫자만 입력하세요");
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				continue;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			} finally {
				scan.nextLine();
			}
			
			if(num == comNum) 
				break;
			else
				System.out.println("틀렸습니다..");
		}
		System.out.println(count + "번만에 정답을 맞추셨습니다.");
	}
}
