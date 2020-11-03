/*
 * PrintStream - 보조 IO 스트림
 *   1. OutputStream 하위 클래스 - byte형 출력 스트림
 *   2. write() 기능을 다양하게 확장
 *      print(), println(), printf() 메서드 추가
 *      => 모든 자료형을 출력할 수 있다.
 *      => 예외처리 생략 가능
 *   3. stdin, stderr 객체의 자료형이다.
 *      (System.out, System.err)
 */
package chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65);
		ps.write(65);
		ps.println('A');
		ps.flush();
		
		ps.close();
		fos.close();
	}
}
