/*
3. (1) + (1+2) + (1+2+3)+... (1+2+3+...10)=220 출력하기
 */
package p200917;

public class Pr03 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print("(");
			for (int j = 1; j < i; j++) {
				sum += j;
				System.out.print(j + "+");
			}
			System.out.print(i + ") " + ((i == 10) ? "= " : "+ "));
			// System.out.print(i + ") " + "+ "); 에서 수정
		}
		System.out.println(sum);
	}
}
