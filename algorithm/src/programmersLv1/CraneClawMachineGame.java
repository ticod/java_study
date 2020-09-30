/*
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 */
package programmersLv1;

public class CraneClawMachineGame {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(new CraneClawMachineGame().solution(board, moves));
	}
	
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int N = board.length;
        int[] basket = new int[N * N];
        int basketIndex = 0;
        
        for(int move : moves) {
            for(int i = 0; i < N; i++) {
                if(board[i][move-1] != 0) {
                    basket[basketIndex] = board[i][move-1];
                    board[i][move-1] = 0;
                    if(basketIndex != 0) {
                         if(basket[basketIndex-1] == basket[basketIndex]) {
                             basketIndex -= 2;
                             answer += 2;
                         }
                    }
                    basketIndex++;
                    break;
                }
            }
        }
        
        return answer;
    }
}
