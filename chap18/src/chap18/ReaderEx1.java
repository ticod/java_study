/*
 * 입력 스트림 - Reader (문자형)
 */
package chap18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
//		Reader in = System.in; // System.in은 InputStream이기 때문에 컴파일 에러!
		Reader in = new InputStreamReader(System.in); // InputStreamReader로 변환해준다.
		int data;
		while((data = in.read()) != -1) { // Reader의 read()이므로 2byte단위 (문자 단위)로 읽는다.
			System.out.print((char)data);
		}
	}
}
