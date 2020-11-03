/*
 * Writer : 문자형 출력 스트림
 *   write(int) : 1문자 단위로 출력함
 */
package chap18;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);
		
		out.write('1');
		out.write('2');
		out.write('3');
		
		out.write('a');
		out.write('b');
		out.write('c');
		
		out.write('가');
		out.write('나');
		out.write('다');
		
		out.flush();
	}
}
