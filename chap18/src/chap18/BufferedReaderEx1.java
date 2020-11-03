/*
 * 보조 스트림
 *   1. 새로운 기능을 추가한 IO스트림
 *   2. 객체 생성시 다른 스트림을 매개변수로 받는다.
 *      new BufferedReader(Reader)
 *      new BufferedInputStream(InputStream)
 *      
 *   BufferedReader : 버퍼 기능을 확장하여 성능 향상시킴
 *              => readLine() : 문자형 데이터를 읽을 때 한 줄씩 읽는 기능
 *   
 */
package chap18;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 키보드로부터 한 줄씩 입력
		 * InputStream System.in
		 * new InputStreamreader (InputStream)
		 * : InputStream => Reader 형태로 변경
		 * BufferedReader : 문자형 입력 스트림
		 *   br : 표준 입력을 한 줄씩 읽을 수 있도록 BufferedReader 타입의 객체
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(data);
			fw.write(data + "\n");
		}
		fw.flush();
		fw.close();
		br.close();
	}
}
