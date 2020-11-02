package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductGrouptEx1 {
	public static void main(String[] args) throws IOException {
		ProductGrouptEx1 pg = new ProductGrouptEx1();
		Stream<Car> car = pg.makeCar();
		Map<Integer, List<Car>> map = car.filter(s -> s.getCon() == 2)
				.collect(Collectors.groupingBy(s -> s.getMonth()));
		/*
		 * partitioningBy와의 차이점
		 * 
		 * partitioningBy : Predicate가 매개 변수 -> boolean을 기준으로 나눈다.
		 * groupingBy : Function이 매개 변수 -> 나누는 데 상관 X
		 */
		System.out.println("\n=== 월 별 판매 건수 ===");
		map.forEach((k, v) -> {
			System.out.println(k + "월 판매 목록 ===");
			System.out.println(k + "월 판매 건수 : " + 
					v.stream().count());
			System.out.println(k + "월 판매 건수 : " + 
					v.size());
			for (Car c : v) {
				System.out.println("car: " + c);
			}
		});
		Map<Integer, Long> countByMonth = pg.makeCar().filter(s -> s.getCon() == 2)
				.collect(Collectors.groupingBy(c->c.getMonth(), Collectors.counting()));
		countByMonth.forEach((k, v) -> {
			System.out.println(k + "월 판매 건수: " + v);
		});
		/*
		 * counting() : 개수를 value로 만든다.
		 */
		
		/* qty에 맞게 판매 건수를 판매 수량으로 변겅해보기 */
		System.out.println("\n=== 월 별 판매 수량 ===");
		Map<Integer, Integer> qtyByMonth = pg.makeCar().filter(s -> s.getCon() == 2)
				.collect(Collectors.groupingBy(c -> c.getMonth(), Collectors.summingInt(Car::getQty)));
		qtyByMonth.forEach((k, v) -> {
			System.out.println(k + "월 판매 수량: " + v);
		});
		
		/* 자동차 별 반품 수량 */
		System.out.println("\n=== 자동차 별 반품 수량 ===");
		Map<String, Long> returnByCar = pg.makeCar().filter(s -> s.getCon() == 3)
				.collect(Collectors.groupingBy(c -> c.getCar(), Collectors.summingLong(Car::getQty)));
		returnByCar.forEach((k, v) -> {
			System.out.println(k + " 반품 수량: " + v);
		});
	}
	
	private Stream<Car> makeCar() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		Stream<Car> car = br.lines()
				.map(s -> {
					String[] str = s.split(",");
					String temp = "";
					try {
						temp = str[4];
					} catch (ArrayIndexOutOfBoundsException e) {}
					return new Car(Integer.parseInt(str[0]), Integer.parseInt(str[1]), str[2],
							Integer.parseInt(str[3]), temp);
				});
		return car;
	}
}
