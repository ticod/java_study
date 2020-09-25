/*
 * 추상 클래스 예제
 * 
 * 회사의 직원(Employee)은 여러 유형으로 나뉜다.
 * 모든 직원은 직원구분, 이름, 주소, 소속부서를 가진다.
 * 1. 정규직원(FormalEmployee) : 직원번호, 직급, 연봉
 *                            급여 = 연봉 / 12
 * 2. 비정규직원(InformalEmployee) : 계약 만료일(Date type), 기본임금
 *                               급여 = 기본임금
 * 3. 임시직원(TempEmployee) : 시간당임금, 근무시간
 *                          급여 = 시간당임금 * 근무시간
 * 모든 직원은 급여를 받는다. (getPay())
 * 모든 직원들은 자신의 멤버 변수의 내용을 입력받아 객체로 생성한다.
 */
package chap7;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Employee {
	String type, name, addr, dept;
	
	Employee(String type, String name, String addr, String dept){
		this.type = type;
		this.name = name;
		this.addr = addr;
		this.dept = dept;
	}
	
	int test(int i) {
		return i;
	}
	
	abstract long getPay();
}

class FormalEmployee extends Employee {
	String empNo;
	String position;
	int pay;
	
	FormalEmployee(String name, String addr, String dept, String empNo, String position, int pay) {
		super("정규직", name, addr, dept);
		this.empNo = empNo;
		this.position = position;
		this.pay = pay;
		this.pay = test(pay);
	}
	
	int test2(int i) {
		return i;
	}
	
	@Override
	long getPay() {
		return pay / 12;
	}
}

class InformalEmployee extends Employee {
	int wage;
	Date expireDate;
	
	InformalEmployee(String name, String addr, String dept, int wage, Date expireDate) {
		super("비정규직", name, addr, dept);
		this.wage = wage;
		this.expireDate = expireDate;
	}
	
	@Override
	long getPay() {
		return wage;
	}
}

class TempEmployee extends Employee {
	int hourlyWage, officeHour;
	
	TempEmployee(String name, String addr, String dept, int hourlyWage, int officeHour) {
		super("임시직", name, addr, dept);
		this.hourlyWage = hourlyWage;
		this.officeHour = officeHour;
	}
	
	@Override
	long getPay() {
		return hourlyWage * officeHour;
	}
}

public class Exam4 {
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		Date exDate = new Date();	// 오늘 날짜
		/*
		 * Date.getTime() : 1970년 이후부터의 현재까지의 시간을 밀리초(ms) 리턴
		 * Date.setTime() : 시간 설정
		 *  
		 */
		exDate.setTime(exDate.getTime() + (1000L*60*60*24*365));	// 1년 후의 날짜 등록
		//                                    ms  s  m  h   d
		emps[0] = new FormalEmployee("박정규", "서울", "총무부", "001", "과장", 50000000);
		emps[1] = new InformalEmployee("유비정", "서울", "기획부", 1000000, exDate);
		emps[2] = new TempEmployee("손임시", "서울", "영업부", 25000, 10);
		
		long total = 0;
		for(Employee e : emps) {
			System.out.println(e.type + "=>" + e.name + ":" + e.getPay());
			total += e.getPay();
			if(e instanceof InformalEmployee) {
				System.out.println("계약 만료일: " + new SimpleDateFormat("yyyy-MM-dd").format(((InformalEmployee) e).expireDate));
			}
		}
		System.out.println("전체 직원 급여:" + total);
	}
}
