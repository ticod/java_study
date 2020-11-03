/*
1. 반복문을 이용하여 
파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
파일명에 exit 가 입력되면, 프로그램 종료.
해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력

[결과]
파일명을 입력하세요(종료:exit)
aaa.txt =>존재하는 경우
aaa.bak 파일에 aaa.txt의 내용을 복사하기

파일명을 입력하세요(종료:exit)
bbb.txt =>존재하지 않는 경우
해당 파일이 없습니다. 
파일명을 입력하세요(종료:exit)
exit
 */
package p201103;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Scanner scanner = new Scanner(System.in);
		String file = null;
		String newFile = null;
		byte[] buf = new byte[1024];
		
		while (true) {
			System.out.println("파일명을 입력하세요(종료:exit)");
			file = scanner.nextLine();
			if (file.equals("exit")) {
				break;
			}
			try {
				fis = new FileInputStream(file);
				newFile = file.split("\\.")[0] + ".bak";
				fos = new FileOutputStream(newFile);
				while (fis.read(buf) != -1) {
					fos.write(buf);
				}
				System.out.println(file + " => " + newFile + " 복사 완료");
			} catch (FileNotFoundException e) {
				System.out.println("해당 파일이 없습니다.");
			}
		}
		System.out.println("종료");
		scanner.close();
	}
}
