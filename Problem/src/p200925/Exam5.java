/*
주어진 배열을 시계방향으로 90도 회전시켜서  출력하는 프로그램을 완성하시오.
주어진 배열에 값
  **  
  **  
  *****
  *****

[결과]
  ****
  ****
  ** 
  ** 
  ** 
 */
package p200925;

public class Exam5 {
	public static void main(String[] args) {
		char[][] star = {
				{ '*', '*', ' ', ' ', ' ' },
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } 
		};
		
		final int WIDTH	 = 5;
		final int HEIGHT = 4;
		
		for(int i = 0; i < WIDTH; i++) {
			for(int j = HEIGHT-1; j >= 0; j--) {
				System.out.print(star[j][i]);
			}
			System.out.println();
		}
	}
}
