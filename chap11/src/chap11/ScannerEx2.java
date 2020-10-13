/*
 * Scanner를 이용하여 파일의 정보 읽기
 *   hasNextLine()
 *   hasNextDouble()
 *     읽을 값이 있는지에 따라 boolean 반환
 *   
 *   nextLine()
 *   nextDouble()
 *     다음 값을 읽어들임
 *   
 *   useDelimiter()
 *     공백이 아닌 다른 구분자를 사용할 때 (정규식도 가능하다)
 */
package chap11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException {
		StringBuffer sb = new StringBuffer("ADSFASDF");
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0, totalSum = 0;
		while (scan.hasNextLine()) { // 읽을 수 있는 라인이 있는지? - true/false
			String line = scan.nextLine(); // 한 줄 읽기 (엔터값 기준)
			Scanner scan2 = new Scanner(line); // Scanner에 String이 들어감
			scan2 = scan2.useDelimiter(","); // ,를 구분자로 사용
			double sum = 0;
			int i = 0;
			String name = scan2.next(); // 첫 값을 name에 넣음
			System.out.print(name + ":");
			while (scan2.hasNextDouble()) { // 다음 값이 double인지? - true/false
				double score = scan2.nextDouble(); // 다음 값을 score로 읽어들임
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.printf("sum=%4.1f, avg=%4.2f\n", sum, sum/i);
			cnt++;
		}
		System.out.println("처리 인원수: " + cnt);
	}
}
