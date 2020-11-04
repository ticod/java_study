/*
 * File 클래스의 주요 메서드
 */
package chap18;

import java.io.File;
import java.io.IOException;

public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("d:/temp1");
		System.out.printf("%s 폴더 생성 : %b\n",
				f1.getAbsolutePath(), f1.mkdir());
		
		File f2 = new File("d:/temp1/test.txt");
		System.out.printf("%s 파일 생성 : %b\n",
				f2.getAbsolutePath(), f2.createNewFile());
		System.out.printf("파일 이름: %s, 파일 크기: %,d byte\n",
				f2.getName(), f2.length());
	}
}
