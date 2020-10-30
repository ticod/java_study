package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

class Car {
	int month, con, qty;
	String car, remark;
	
	Car(){}
	Car(int month, int con, String car, int qty, String remark) {
		this.month = month;
		this.con = con;
		this.qty = qty;
		this.car = car;
		this.remark = remark;
	}
	
	static Function<String, Car> fileToCar = s -> {
		String[] str = s.split(",");
		String temp = "";
		try {
			temp = str[4];
		} catch (ArrayIndexOutOfBoundsException e) {
			temp = "";
		}
		return new Car(Integer.parseInt(str[0]),
				Integer.parseInt(str[1]), str[2],
				Integer.parseInt(str[3]), temp);
	};

	public int getMonth() {
		return month;
	}

	public int getCon() {
		return con;
	}

	public int getQty() {
		return qty;
	}

	public String getCar() {
		return car;
	}

	public String getRemark() {
		return remark;
	}

	@Override
	public String toString() {
		return "Car [month=" + month + ", con=" + con + ", qty=" + qty + ", car=" + car + ", remark=" + remark
				+ "]";
	}

}

public interface MapEx2 {
	public static void main(String[] args) throws IOException {
		// file의 내용을 stream으로
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		
		// file의 내용을 Car객체의 스트림으로
		// map method 사용을 위해 Function 인터페이스 구현
		Function<String, Car> fileToCar = s -> {
			String[] str = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			} catch (ArrayIndexOutOfBoundsException e) {
				temp = "";
			}
			return new Car(Integer.parseInt(str[0]),
					Integer.parseInt(str[1]), str[2],
					Integer.parseInt(str[3]), temp);
		};
		
		// 차 이름이 그랜저인 상품 출력
		br.lines().map(fileToCar).filter(c -> c.getCar().equals("그랜저"))
		.forEach(c -> System.out.println(c));
		
		// 차 이름이 K9인 상품 출력
		br = new BufferedReader(new FileReader("product.txt"));
		br.lines().map(fileToCar).filter(c -> c.getCar().equals("K9"))
		.forEach(c -> System.out.println(c));
	}
}
