/*
 * Supplier - Java API FunctionalInterface 2
 * get() : 매개 변수 X, return O
 */
package chap14;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaEx7 {
	public static void main(String[] args) {
		Supplier<String> s1 = ()->"java";
		System.out.println(s1.get());
		
		IntSupplier s2 = ()->new Random().nextInt(6) + 1;
		System.out.println(s2.getAsInt());
		
		IntSupplier s3 = ()->100*101/2;
		System.out.println(s3.getAsInt());
		
		double[] arr = {1.1, 2.4, 2.4, 5.3, 10.3};
		DoubleSupplier s4 = ()->{
			double sum = 0;
			for (double d : arr) {
				sum += d;
			}
			return sum;
		};
		System.out.println(s4.getAsDouble());
	}
}
