package programmersLv1;

public class GreedySportswear {

	public static void main(String[] args) {
		GreedySportswear gs = new GreedySportswear();
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		System.out.println(gs.solution(5, lost, reserve)); // 5
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        answer = n - lost.length;
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(reserve[j] == -1) continue;
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        for(int l : lost){
            if(l == -1) continue;
            for(int i = 0; i < reserve.length; i++){
                if(reserve[i] == -1) continue;
                if(l-1 == reserve[i]){
                    answer++;
                    reserve[i] = -1;
                    break;
                }
                else if(l+1 == reserve[i]){
                    answer++;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
