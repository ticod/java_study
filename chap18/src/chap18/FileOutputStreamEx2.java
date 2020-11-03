/*
 * FileOutputStream으로 error 로그 파일 생성
 * 
 * new FileOutputStream("error.log", true)
 *   error.log : 저장될 파일 이름. 있는 경우 수정, 없는 경우 생성
 *   true      : 기존의 내용을 삭제하지 않고, 새로운 내용 append
 * 
 */
package chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		firstMethod();
	}
	private static void firstMethod() {
		secondMethod();
	}
	private static void secondMethod() {
		try {
			throw new Exception("파일에 예외 메세지 작성하기");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				FileOutputStream fos = new FileOutputStream("error.log", true);
				fos.write(e.getMessage().getBytes());
				e.printStackTrace(new PrintStream(fos));
				fos.write((new Date() + " : ============\n\n").getBytes());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
