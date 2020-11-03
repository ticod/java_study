/*
 * FileReader 예제
 */
package chap18;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("out.txt");
		
		int data;
		System.out.println("=== read() 메서드를 이용");
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println();
		
		System.out.println("=== read(buf) 메서드를 이용");
		fis = new FileReader("out.txt");
		char[] buf = new char[1024];
		while((data = fis.read(buf)) != -1) {
			System.out.println(new String(buf, 0, data));
		}
		
		System.out.println("=== read(buf, start, len) 메서드를 이용");
		fis = new FileReader("out.txt");
		while((data = fis.read(buf, 0, buf.length)) != -1) {
			System.out.println(new String(buf, 0, data));
		}
	}
}
