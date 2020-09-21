
/*1. 다음 결과가 나오도록 프로그램을 구현하시오

 [결과]

46

47 37

48 38 29

49 39 30 22

50 40 31 23 16

51 41 32 24 17 11

52 42 33 25 18 12 7

53 43 34 26 19 13 8 4

54 44 35 27 20 14 9 5 2

55 45 36 28 21 15 10 6 3 1

​

1.가변 배열 선언

2.각행의 1차원 배열 객체 생성

3.배열의 내부에 숫자 채우기

4.결과 출력*/

package p200921;

public class Pr01 {
	public static void main(String[] args) {
		String[][] result = new String[10][];
		for(int i = 0; i < 10; i++) {
			result[i] = new String[i+1];
		}
		int num = 1;
		for(int i = result.length - 1; i >= 0; i--) {
			for(int j = i; j < result.length; j++) {
				result[j][i] = (num++) + "\t";
			}
		}
		
		for(String[] r : result) {
			for(String s : r) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}
