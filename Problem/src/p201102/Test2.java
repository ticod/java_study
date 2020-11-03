package p201102;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 명 입력: ");
		String fileName = scan.next();
		try {
			fis = new FileInputStream(fileName);
			byte[] buf = new byte[fis.available()];
			int data = 0;
			while ((data = fis.read(buf)) != -1) {
//				System.out.print(new String(buf, 0, data));
				System.out.print(new String(buf));
			}
		} catch (IOException e) {
			System.out.println("해당 파일 없음");
			return;
		}
	}
}
