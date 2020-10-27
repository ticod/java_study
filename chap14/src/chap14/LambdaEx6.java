/*
 * Consumer - Java API FunctionalInterface 1 => stream에서 주로 사용된다.
 * accept() : 매개 변수 O, return X
 */
package chap14;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.BiConsumer;

public class LambdaEx6 {
	public static void main(String[] args) {
		Consumer<String> c1 = t->System.out.println(t+8);
		c1.accept("java");
		
		BiConsumer<String, String> c2 = (t, u) -> System.out.println(t + u);
		c2.accept("java", "8.0이후");
		
		// 매개변수 : double형, 실수형
		DoubleConsumer c3 = d -> System.out.println("java" + d);
		c3.accept(8.0);
		
		ObjIntConsumer<String> c4 = (t, i) -> System.out.println(t + i);
		c4.accept("java", 8);
		
		IntConsumer c5 = (i) -> {
			int sum = 0;
			for (; i >= 0; i--) {
				sum += i;
			}
			System.out.println(sum);
		};
		c5.accept(10);
		
		BiConsumer<String, String> c6 = (s1, s2) -> {
			System.out.println((s1.compareTo(s2) >= 0) ? s1 : s2);
		};
		c6.accept("abc", "def");
	}
}
