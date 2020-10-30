/*
 * 대용량 데이터 만들기
 * 
 * 대용량 데이터 파일 만들어서 stream에서 활용하기
 */
package chap16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class GeneratorProductFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		String[] cars = 
			{"아반떼", "그랜저", "SM7", "BMW", "벤츠", "K9"};
		String[] remarks = {"몰라요", "싫어요", "그냥그래요", "좋아요"};
		int limit = 0;
		int con = 0;
		fos = new FileOutputStream("product.txt");
		PrintStream ps = new PrintStream(fos);
		while (limit++ < 100) {
			ps.print((int)(Math.random()*12) + 1 + ",");
			con = (int)(Math.random() * 3) + 1;
			ps.print(con + ",");
			ps.print(cars[(int)(Math.random() * cars.length)] + ",");
			ps.print((int)(Math.random() * 5) + 1);
			if (con == 3) {
				ps.print(",");
				ps.print(remarks[(int)(Math.random() * 3)]);
			}
			ps.println();
		}
		ps.flush();
		ps.close();
	}
}
