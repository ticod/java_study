/*
5.화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기

[결과]
삼각형의 높이를 입력하세요
3

  *
 ***
*****
 */
package p200917;

import java.util.Scanner;

public class Pr05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = 0;

        System.out.println("삼각형의 높이를 입력하세요");
        height = scan.nextInt();

        for(int i = 1; i <= height; i++){
            for(int j = 0; j < height - i; j++){
                System.out.print(" ");
            }
            for(int j = height - i; j < height + i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
