/*
 * 문자열 => 숫자
 */
package chap11;

public class StringEx4 {
	public static void main(String[] args) {
		// Integer.parseInt
		int i = Integer.parseInt("100");
		System.out.println(i + 1);
		// Double.parseDouble
		double d = Double.parseDouble("100.5");
		System.out.println(d + 0.1);
		System.out.println(++d);
		// Float.parseFloat
		float f = Float.parseFloat("0.1");
		System.out.println(f + 0.1f);
		System.out.println(f + 0.1);
		System.out.println(++f);
		// Integer.toBinaryString
		String binary = Integer.toBinaryString(i);
		System.out.println(binary);
		// Integer.toOctalString
		String Octal = Integer.toOctalString(i);
		System.out.println(Octal);
		// Integer.toHexString
		String hex = Integer.toHexString(i);
		System.out.println(hex);
	}
}
