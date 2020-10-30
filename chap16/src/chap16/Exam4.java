/*
 * product.txt 파일로 6월달, BMW 판매량 수량 출력
 */
package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exam4 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		
		long count = br.lines().map(Car.fileToCar)
			.filter(c -> c.getMonth() == 6 && c.getCar().equals("BMW"))
			.peek(c -> System.out.println(c))
			.mapToInt(Car::getQty).sum();
		System.out.println(count);
	}
}
