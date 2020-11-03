/*
 * FileInputStream 예제 : 파일의 내용을 읽어 화면에 출력
 * 
 *   int read() : 1byte씩 읽어서 내용을 return
 *   int read(byte[] buf) : buf의 크기만큼 읽어 buf에 데이터 저장
 *              읽은 바이트 수를 return
 *   int read(byte[] buf, int start, int len) : buf로 len바이트만큼 읽어서 start 인덱스부터 buf에 저장
 *              읽은 바이트 수를 return
 *   available() : 읽기 가능 byte 수 return
 */
package chap18;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/chap18/InputStreamEx1.java");
		System.out.println("read() 메서드를 이용하여 읽기");
		int data = 0;
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println();
		
		fis = new FileInputStream("src/chap18/InputStreamEx1.java");
		System.out.println("read(byte[]) 메서드를 이용하여 읽기");
//		byte[] buf = new byte[300];
		byte[] buf = new byte[fis.available()]; // available() : fis를 읽기 가능한 byte 수
		data = 0;
		while((data = fis.read(buf)) != -1) {
			// data : 실제로 읽은 바이트 수 return
			// buf  : 읽은 내용 저장
			System.out.print(new String(buf, 0, data));
			// byte[]를 String으로 변환!
		}
		System.out.println();
		
		fis = new FileInputStream("src/chap18/InputStreamEx1.java");
		System.out.println("read(byte[], int start, int len) 메서드를 이용하여 읽기");
		buf = new byte[300];
		data = 0;
		while((data = fis.read(buf, 10, buf.length - 10)) != -1) {
			// data : 실제로 읽은 바이트 수 return
			// buf  : 읽은 내용 저장
			System.out.print(new String(buf, 0, data));
			// byte[]를 String으로 변환!
		}
	}
}
