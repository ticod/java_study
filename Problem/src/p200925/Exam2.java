/*
 * 11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X         X
 X       X 
  X     X  
   X   X   
    X X    
     X     
    X X    
   X   X   
  X     X  
 X       X 
X         X
 
*/
package p200925;

public class Exam2 {
	public static void main(String[] args) {
		char[][] x = new char[11][11];
		for(int i = 0; i < x.length; i++) {
			x[i][i] = 'X';
			x[i][x.length-i-1] = 'X';
		}
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}
