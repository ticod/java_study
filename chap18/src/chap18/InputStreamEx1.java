/*
 * 입력 스트림 - InputStream (바이트형)
 * 
 * InputStream - 바이트형 입력 스트림 - 1Byte 단위
 * Reader - 문자형 입력 스트림 - 2Byte (1문자)단위
 * 
 * 자바의 표준 입출력 객체
 * 표준 입력 스트림 : System.in => 키보드에서 입력
 *   => InputStream
 * 표준 출력 스트림 : System.out => 콘솔창에서 출력
 *   => PrintStream
 */
package chap18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; // in이 System.in stream을 참조한다.
		int data = 0;
		while((data = in.read()) != -1) { // InputStream의 read()는 byte 단위로 읽는다.
			System.out.print((char)data); // 한글이 깨져서 출력된다.
		}
	}
}
