package chap4;

public class SwitchEx2 {
	public static void main(String[] args) {
		/*
		 * Math.random() : 0 <= x < 1.0 x (임의의 수, 난수) 리턴
		 * Math.random() * 10 : 0 <= x < 10.0 리턴
		 * (int)(Math.random() * 10) : 0 <= x < 10 리턴 (0~9)
		 * (int)(Math.random()* 10) + 1 : 1~10 임의의 수 리턴
		 */
		int num = (int)(Math.random() *10) + 1;
		switch(num) {
		case 1 : System.out.println("축하합니다. 자전거에 당첨되셨습니다.");
				break;
		case 2 : System.out.println("축하합니다. USB에 당첨되셨습니다.");
				break;
		case 3 : System.out.println("축하합니다. 키보드에 당첨되셨습니다.");
				break;
		default: System.out.println("아쉽습니다. 다음 기회에"); // 4 ~ 10
		}
	}
}
