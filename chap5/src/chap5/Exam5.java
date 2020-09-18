/*
 * command 라인에 숫자로 이루어진 문자열들을 입력받아
 * 모든 자리수의 합을 출력, 숫자로만 이루어진 문자열이 아닌 경우 문자열 제외하기.
 */
package chap5;

public class Exam5 {
	public static void main(String[] args) {
		int sum = 0;
		
		if(args.length == 0) {
			System.out.println("매개 변수가 없습니다");
		} else {
			int len = args.length;
			int index = 0;
			for(String a : args) {
				boolean check = true;
				for(int i = 0; i < a.length(); i++) {
					if(a.charAt(i) < '0' || a.charAt(i) > '9') {
						check = false;
						len--;
						index--;
						break;
					}
				}
				if(check) {
					for(int i = 0; i < a.length(); i++) {
						sum += (int)(a.charAt(i) - '0');
						System.out.print(a.charAt(i) + (((index == len - 1) && (i == a.length() - 1)) ? "=" : "+"));
					}
				}
				index++;
			}
			System.out.println(sum);
			System.out.println(len);
			
		}
	}
}
