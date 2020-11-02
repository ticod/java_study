package p201102;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	
	private final static Map<String, Integer> index = Map.of("NAME", 0, "WORK", 1, "POSITION", 2, "AGE", 3);
	
	private String name; // 이름
	private String work; // 업무
	private String position; // 직급
	private int age; // 나이

	public Employee(String name, String work, String position, int age) {
		this.name = name;
		this.work = work;
		this.position = position;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getWork() {
		return work;
	}

	public String getPosition() {
		return position;
	}

	public int getAge() {
		return age;
	}
	
	public static int getIndex(String memberName) {
		return index.get(memberName);
	}

	@Override
	public String toString() {
		return "name=" + name + ", work=" + work +
				", position=" + position + ", age=" + age;
	}
}

public class Test1 {
	
	
	public static void main(String[] args) throws IOException {
		Stream<Employee> st = null;
		
		// 1. emp.txt 파일을 읽어서, st 객체에 저장
		st = empFileReader();
		
		// 2. 사원들이 속한 직급 정보 출력하기
		System.out.println("=== 사원들이 속한 직급 정보 ===");
		st.map(e -> e.getPosition()).distinct()
		.forEach(p -> System.out.print(p + ","));
		System.out.println();
		
		// 3. 업무별 이름 출력하기
		System.out.println("=== 업무별 이름 출력하기 ===");
		st = empFileReader();
		st.collect(Collectors.groupingBy(e -> e.getWork()))
		.forEach((k, v) -> {
			System.out.print(k + ": ");
			for (Employee e : v) {
				System.out.print(e.getName() + " ");
			}
			System.out.println();
		});
		
		// 4. 직급별 나이의 평균 출력하기
		System.out.println("=== 직급별 나이의 평균 출력하기 ===");
		st = empFileReader();
		st.collect(Collectors.groupingBy(e -> e.getPosition(), Collectors.averagingDouble(Employee::getAge)))
		.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
	}
	
	private static Stream<Employee> empFileReader() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
		Employee e = null;
		return br.lines().map(l -> {
			String[] str = l.split(",");
			return new Employee(str[Employee.getIndex("NAME")], 
					str[Employee.getIndex("WORK")], 
					str[Employee.getIndex("POSITION")], 
					Integer.parseInt(str[Employee.getIndex("AGE")]));
		});
	}
}
