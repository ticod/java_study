package chap6;

public class LocalValEx1 {
	public static void main(String[] args) {
		int num;
		boolean b = true; // 초기화 안하면 오류
		if(b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num);
		
		String grade = null;
		int score = 80;
		switch(score/10) {
		case 9 : grade = "a"; break;
		case 8 : grade = "b"; break;
		case 7 : grade = "c"; break;
		// default : grade = "d"; break;
		// 디폴트가 없다면 grade가 초기화되지 않을 가능성이 있어 오류
		// 디폴트를 넣거나, null로 초기화해준다.
		}
		System.out.println(grade);
	}
}
