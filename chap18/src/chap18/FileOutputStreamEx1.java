/*
 * FileOutputStream 예제 : 파일에 데이터를 파일로 저장
 *                         파일이 존재하지 않으면 파일 생성
 *                         파일이 존재하면 파일 수정
 * void write(int data) : 1byte 출력
 * void write(byte[] buf) : buf의 내용 출력
 * void write(byte[] buf, int start, int lne) : 
 *                   buf의 내용을 start부터 len만큼 출력
 *                   
 * FileNotFoundException을 처리해 줘야 하는 이유
 *   파일이 없으면 만드는데도 예외를 굳이 처리해줘야 하는 이유?
 *   * 파일을 생성할 권한이 없는 경우 예외 발생 *
 */
package chap18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException  {
		System.out.println("out.txt 파일에 출력됩니다");
		FileOutputStream fos = new FileOutputStream("out.txt");
		
		fos.write('1');
		fos.write('2');
		fos.write('3');
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('가');
		fos.write('나');
		fos.write('다');
		byte[] buf = "\n반갑습니다. FileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf, 1, 6);
	}
}
