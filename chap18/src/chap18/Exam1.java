/*
 * FileOutputStream 예제
 * 
 * 화면에서 파일 명을 입력받고,
 * exit 문자가 입력될 때 까지 저장할 데이터를 입력받는다.
 */
package chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		Scanner scan = new Scanner(System.in);
		fos = new FileOutputStream(scan.nextLine());
		String input = null;
		while(!(input = scan.nextLine()).equals("exit")) {
			fos.write((input + "\n").getBytes());
		}
		scan.close();
	}
}
