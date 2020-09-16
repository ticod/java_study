/*3. 시스템과 주사위 던지기
    시스템이 주사위를 던저 나온 값을 저장하고,
    사용자의 주사위를 던저 나온값을 시스템의 값과 비교하여, 시스템의 주사위 값이 크면 시스템 승리
    사용자의 주사위 값이 크면 사용자 승리
     시스템과 사용자의 주사위값이 같으면 동점입니다.
    출력하기.*/

package p200916;

public class Pr03 {
    public static void main(String[] args) {
        int com = (int)(Math.random() * 10 % 6) + 1;
        int user = (int)(Math.random() * 10 % 6) + 1;

        // 주사위 값 출
        System.out.println("컴퓨터의 주사위 값은 " + com + "입니다!");
        System.out.println("당신의 주사위 값은 " + user + "입니다!");

        // 승부 출력
        if(user > com)
            System.out.println("이겼습니다!");
        else if (user == com)
            System.out.println("비겼습니다.");
        else
            System.out.println("졌습니다...");
    }
}
