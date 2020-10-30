/*
 * map method 예제
 */
package chap16;

import java.util.Arrays;
import java.util.List;

class Member {
	
	public static int MALE = 0;
	public static int FEMALE = 1;
	private String name;
	private int gender;
	private int age;
	
	public Member(String name, int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
}

public class Exam3 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
					new Member("홍길동", Member.MALE, 30),
					new Member("장옥정", Member.FEMALE, 20),
					new Member("이몽룡", Member.MALE, 45),
					new Member("성춘향", Member.FEMALE, 27)
		);
		
		System.out.println("남자 나이의 평균: " +
				list.stream().filter(m -> m.getGender() == Member.MALE)
					.mapToInt(m -> m.getAge()).average().getAsDouble()
		);
		
		
		System.out.println("여자 나이의 평균: " +
				list.stream().filter(m -> m.getGender() == Member.FEMALE)
					.mapToInt(Member::getAge).average().getAsDouble()
		);
		
		System.out.print("남자 회원 이름: ");
		list.stream().filter(m -> m.getGender() == Member.MALE)
			.forEach(m -> System.out.print(m.getName() + " "));
		System.out.println();
		
		System.out.print("여자 회원 이름: ");
		list.stream().filter(m -> m.getGender() == Member.FEMALE)
			.map(Member::getName).forEach(s -> System.out.print(s + " "));
		System.out.println();
	}
}
