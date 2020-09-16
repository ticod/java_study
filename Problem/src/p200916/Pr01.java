/*1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로,
     소문자인 경우는 대문자로
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요*/

package p200916;

import java.util.Scanner;

public class Pr01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;

        // 문자 입력
        System.out.print("문자 입력 : ");
        ch = scan.next().charAt(0);

        // 문자 변환
        if(ch >= 'A' && ch <= 'Z') {
            ch += ('a' - 'A');
            System.out.println(ch);
        } else if(ch >= 'a' && ch <= 'z') {
            ch -= ('a' - 'A');
            System.out.println(ch);
        } else if(ch >= '0' && ch <= '9') {
            System.out.println(ch - '0' + 20);
        } else {
            System.out.println("기타 문자");
        }
    }
}
