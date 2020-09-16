/*4. 점수를 입력받아
    95점 이상인 경우 A+ 90 ~ 94 : A0
    89 ~ 85점 이상인 경우 B+ 80 ~ 84 : B0
    79 ~ 75점 이상인 경우 C+ 70 ~ 74 : C0
    69 ~ 65점 이상인 경우 D+ 60 ~ 64 : D0
    그외는 F 로 출력하기.
    중첩 반복문을 이용하여 구현하기*/

package p200916;

import java.util.Scanner;

public class Pr04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 점수 입력
        System.out.print("점수를 입력하세요 : ");
        int score = scan.nextInt();

        // 학점 계산
        String grade;
        if(score >= 90){
            if(score >= 95)
                grade = "A+";
            else
                grade = "A0";
        } if(score >= 80){
            if(score >= 85)
                grade = "B+";
            else
                grade = "B0";
        } if(score >= 70){
            if(score >= 75)
                grade = "C+";
            else
                grade = "C0";
        } if(score >= 60){
            if(score >= 65)
                grade = "D+";
            else
                grade = "D0";
        } else
            grade = "F";

        // 학점 출력
        System.out.println("학점은 " + grade +"입니다.");
    }
}
