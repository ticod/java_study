/*
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 */
package programmersLv1;

public class ReplaceStringWithInteger {
	public static void main(String[] args) {
		System.out.println(new ReplaceStringWithInteger().solution("1234"));
		System.out.println(new ReplaceStringWithInteger().solution("-1234"));
		System.out.println(new ReplaceStringWithInteger().solution("14189544"));
		System.out.println(new ReplaceStringWithInteger().solution("+1234"));
	}
	
    public int solution(String s) {
        int answer = 0;
        
        int temp = 1;
        for(int i = s.length() - 1; i >= 1; i--){
            answer += (s.charAt(i)-'0') * temp;
            temp *= 10;
        }
        
        if(s.charAt(0) == '-'){
            answer = -answer;
        } else if (s.charAt(0) != '+') {
            answer += (s.charAt(0)-'0') * temp;
        }        
//        answer = Integer.parseInt(s);
        
        return answer;
    }
}
