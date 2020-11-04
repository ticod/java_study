/*
 * File class Example
 * 
 * c:\windows 폴더의 하위 폴더 갯수, 파일 갯수, 파일 총 크기 출력
 */
package chap18;

import java.io.File;

public class Exam3 {
	public static void main(String[] args) {
		File f = new File("c:\\windows");
		File[] fileList = f.listFiles();
		int folderCount = 0, fileCount = 0, fileSize = 0;
		
		for (File file : fileList) {
			if (file.isDirectory()) {
				folderCount++;
			} else {
				fileCount++;
				fileSize += file.length();
			}
		}
		
		System.out.printf("하위 폴더 갯수: %d, 파일 갯수: %d, 파일 총 크기: %,d byte", 
				folderCount, fileCount, fileSize);
	}
}
