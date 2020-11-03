/*
 * FileWriter 예제 : 파일에 텍스트 형태의 데이터를 저장
 * 
 * void write(int data) : 1문자 출력
 * void write(char[] buf) : buf의 내용을 파일에 출력
 * void write(char[] buf, int start, int len) :
 *               buf의 start부터 len만큼 파일에 출력
 * void write(String data) : data 내용을 파일에 출력
 */
package chap18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 출력");
		FileWriter fos = new FileWriter("out2.txt");
		
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');
		
		char[] buf = "\n반갑습니다. FileWriter 예제입니다".toCharArray();
		fos.write(buf);
		fos.write(buf, 1, 6);
		fos.write("안녕하세요 홍길동입니다");
		fos.flush();
	}
}
