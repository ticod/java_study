package programmersLv1;

public class CaesarCipher {
	public static void main(String[] args) {

	}
	
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        final int ALPHABET_COUNT = 26;
        
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp >= 'a' && temp <= 'z') {
                temp = (char)((temp - 'a' + n) % ALPHABET_COUNT + 'a');
            }
            else if(temp >= 'A' && temp <= 'Z') {
                temp = (char)((temp - 'A' + n) % ALPHABET_COUNT + 'A');
            }
            sb.append(temp);
        }
        
        answer = sb.toString();
        return answer;
    }
}
