/*
 * File 클래스
 *   - 파일, 폴더의 정보 관리 - 없는 파일도 관리된다
 * 
 * 폴더 구분자
 *   - 윈도우 : \, /
 *   - 리눅스 : /
 * 
 */
package chap18;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "c:\\"; // '\' 특수문자를 쓸 것이기 때문에 두 개를 쓴다.
		File f1 = new File(filePath);
		String[] files = f1.list(); // f1의 하위 폴더, 파일들의 이름이 나옴
		for (String f : files) {
			File f2 = new File(filePath, f); // filePath 밑의 f 파일들
			if (f2.isDirectory()) {
				System.out.printf("%s: 디렉토리\n", f);
			} else {
				System.out.printf("%s: 파일(%,dbyte)\n", f, f2.length()); // f2.length() : 파일 크기 리턴
			}
		}
	}
}
