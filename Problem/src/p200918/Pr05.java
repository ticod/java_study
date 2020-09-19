/*5. Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
java Test5 10
int num = Integer.parseInt(args[0]);

[결과]
10의 약수 : 1,2,5,10,*/
package p200918;

public class Pr05 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("java Test5");
			return;
		} else {
			System.out.println("java Test5" + args[0]);
		}
		int num = Integer.parseInt(args[0]);
		int[] result = new int[num];
		int index = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				result[index++] = i;
			}
		}
		
		System.out.print(num + "의 약수: ");
		for(int i = 0; i < index; i++) {
			System.out.print(result[i] + ((i == index - 1) ? "" : ", "));
		}
	}
}
