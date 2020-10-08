/*
 * round, truncate 구현
 * 
 * 
 */
package chap11;

public class Exam7 {
	public static void main(String[] args) {
		System.out.println(round(3.1215, 1));
		System.out.println(round(3.1215, 2));
		System.out.println(round(3.1215, 3));
		System.out.println(round(3.1215, 4));
		System.out.println(round2(3.1215, 1));
		System.out.println(round2(3.1215, 2));
		System.out.println(round2(3.1215, 3));
		System.out.println(round2(3.1215, 4));
		System.out.println(truncate(3.15345, 1));
		System.out.println(truncate(3.15345, 2));
		System.out.println(truncate(3.15345, 3));
		System.out.println(truncate(3.15345, 4));
		System.out.println(truncate2(3.15345, 1));
		System.out.println(truncate2(3.15345, 2));
		System.out.println(truncate2(3.15345, 3));
		System.out.println(truncate2(3.15345, 4));
	}

	static double round(double d, int i) {
		String s = String.format("%." + i + "f", d);
		return Double.parseDouble(s);
	}
	
	static double round2(double d, int i) {
		int num10 = 1;
		for(int a = 0; a < i; a++) num10 *= 10;
		return (int)(d * num10 + 0.5) / (double)num10;
	}

	static double truncate(double d, int i) {
		String s = String.format("%f", d);
		s = s.substring(0, s.indexOf('.') + 1 + i);
		return Double.parseDouble(s);
	}
	
	static double truncate2(double d, int i) {
		int num10 = 1;
		for(int a = 0; a < i; a++) num10 *= 10;
		return (int)(d * num10) / (double)num10;
	}
}
