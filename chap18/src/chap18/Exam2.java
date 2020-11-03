/*
 * 화면에서 파일 명을 입력받고,
 * 출력을 시작할 시작라인, 종료 라인 수를 입력받아
 * 시작 라인부터 라인 수의 내용을 화면에 출력
 * 단, 출력시 라인 수도 함께 출력 (Scanner 사용 X)
 */
package chap18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일 명 입력");
		String fileName = br.readLine();
		System.out.println("출력할 시작 라인과, 출력할 라인 수 입력");
		String[] stdnum = br.readLine().split(" ");
		int start = Integer.parseInt(stdnum[0].trim());
		int end = Integer.parseInt(stdnum[1].trim());
		br.close();
		br = new BufferedReader(new FileReader(fileName));
		int line = 0;
		String data = null;
		while ((data = br.readLine()) != null) {
			line++;
			if (line < start) continue;
			if (line >= end + start) break;
			System.out.println(line + " : " + data);
		}
//		for (int i = 0; i < start; i++) {
//			br.readLine();
//		}
//		for (int i = start; i < start + end; i++) {
//			System.out.println(i + " : " + br.readLine());
//		}
		br.close();
	}
}
