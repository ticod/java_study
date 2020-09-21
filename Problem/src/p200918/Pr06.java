/*6. command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
java Test6 10 20

[결과]
10과 20 의 공약수 : 1,2,5,10,*/
package p200918;

public class Pr06 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("java Test6");
			return;
		} else {
			System.out.println("java Test6 " + args[0] + " " + args[1]);
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int smallNum = (num1 < num2) ? num1 : num2;
		int[] result = new int[smallNum];
		int index = 0;
		
		for(int i = 1; i <= smallNum; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				result[index++] = i;
			}
		}
		
		// 프로그래머스 약수 - 루트?
		
		System.out.print(num1 + "과 " + num2 + "의 공약수: ");
		for(int i = 0; i < index; i++) {
			System.out.print(result[i] + ((i == index - 1) ? "" : ", "));
		}
	}
}
