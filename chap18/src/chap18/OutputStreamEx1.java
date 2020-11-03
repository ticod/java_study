/*
 * OutputStream : 바이트형 출력 스트림
 *   write(int) : 1byte 출력
 */
package chap18;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('1');
		out.write('2');
		out.write('3');
		
		out.write('a');
		out.write('b');
		out.write('c');
		
		out.write('가');
		out.write('나');
		out.write('다');
		
		out.flush(); // 버퍼의 내용을 목적지로 강제 전송
	}
}
