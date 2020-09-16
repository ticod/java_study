/*2. 시스템과 가위(1), 바위(2), 보(3)를 하기
    시스템은 1,2,3 중의 한개의 숫자를 저장하고, 한개의 숫자를 입력받아 가위바위보 게임하기*/

package p200916;

import java.util.Scanner;

public class Pr02 {
    public static void main(String[] args) {
        int com = (int)(Math.random() * 10 % 3) + 1;
        Scanner scan = new Scanner(System.in);

        // 입력
        System.out.print("숫자 입력(1:가위, 2:바위, 3:보): ");
        int input = scan.nextInt();

        // 컴퓨터 값 출력
        switch(com){
            case 1:
                System.out.println("컴퓨터는 가위를 냈습니다!");
                break;
            case 2:
                System.out.println("컴퓨터는 바위를 냈습니다!");
                break;
            case 3:
                System.out.println("컴퓨터는 보를 냈습니다!");
                break;
        }

        // 가위바위보 결과
        if(input == com) {
            System.out.println("비겼습니다.");
        } else if((input == 1 && com == 3) || input == com + 1) {
            System.out.println("이겼습니다!");
        } else {
            System.out.println("졌습니다...");
        }
    }
}
