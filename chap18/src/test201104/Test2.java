/* 2. src/chap18 폴더의 .java 파일 중 InputStream 관련 모든 소스를 
InputStream예제.txt 파일로 생성하기
InputStream 관련 모든 소스 : XXXInputStreamXXX.java */
package test201104;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {
	public static void main(String[] args) throws IOException {
		String filePath = "./src/chap18/";
		File f = new File(filePath);
		BufferedReader fbr = null;
		PrintWriter pw = new PrintWriter(new FileWriter("InputStream예제.txt"));
		
		String[] fileList = f.list();
		for (String fileName : fileList) {
			if (fileName.contains("InputStream") && fileName.endsWith(".java")) {
				fbr = new BufferedReader(new FileReader(filePath + fileName));
				pw.println("\n\n************" + fileName + "************\n\n");
				String dataline = null;
				while ((dataline = fbr.readLine()) != null) {
					pw.println(dataline);
					pw.flush();
				}
			}
		}
	}
}
