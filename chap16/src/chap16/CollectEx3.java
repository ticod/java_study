/*
 * Collector 구현
 * 
 * Collector<supplier, accumulator, combiner>
 * supplier에서 받은 객체를 accumulator에서 모아서 combiner로 리턴
 */
package chap16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CollectEx3 {
	public static void main(String[] args) {
		String[] strArr = {"aaa", "bbb", "ccc"};
		Stream<String> st = Stream.of(strArr);
		String result = st.collect(new ConcatCollector());
		System.out.println(Arrays.deepToString(strArr));
		System.out.println("result = " + result);
	}
	
	static class ConcatCollector implements Collector<String, StringBuilder, String> {
		
		/*
		 * 공식 문서

			creation of a new result container (supplier())
			  - 새 결과를 담을 컨테이너를 만든다
			incorporating a new data element into a result container (accumulator())
			  - 결과 컨테이너에 새 데이터 요소를 통합한다.
			combining two result containers into one (combiner())
			  - 두 개의 결과 용기를 하나의 결과 용기로 통합한다.
			performing an optional final transform on the container (finisher())
			  - 용기에 선택적 최종 변환 수행
		 */

		@Override
		public Supplier<StringBuilder> supplier() {
			System.out.println("supplier");
			return StringBuilder::new; // StringBuilder 객체 생성
		}

		@Override
		public BiConsumer<StringBuilder, String> accumulator() {
			// 매개 변수 O, return X
			System.out.println("accumulator");
			return StringBuilder::append; // StringBuilder에 String을 붙임
		}

		@Override
		public BinaryOperator<StringBuilder> combiner() {
			System.out.println("combiner");
			return (sb, sb2) -> sb.append(sb2);
		}

		@Override
		public Function<StringBuilder, String> finisher() {
			System.out.println("finisher");
			return sb -> sb.toString();
		}

		@Override
		public Set<Characteristics> characteristics() {
			System.out.println("characteristics");
			return Collections.emptySet();
		}
		
	}
}
