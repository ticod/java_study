/*4. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의 하시오

   멤버 변수

          String name //학생이름

          int ban,no,kor,eng,math  //반,번호,국어점수,영어점수,수학점수

   멤버 메서드

          1. getTotal

             기능 : 국어,영어,수학 점수의 합 반환

           2. getAverage

              기능 : 총점(국어,영어,수학 점수의 합) 을 과목수로 나눈 평균 반환

              리턴타입 : float*/

package p200922;

class Student {
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return getTotal() / 3.0F;
	}
	
	public String toString() {
		return "학생 번호: " + no + "\n" +
				"이름: " + name + "\n" +
				"국어 점수: " + kor + "\n" +
				"영어 점수: " + eng + "\n" +
				"수학 점수: " + math + "\n" +
				"총합: " + getTotal() + "\n" +
				"평균: " + getAverage();
	}
}

public class Pr4 {
	public static void main(String[] args) {
		Student[] st = new Student[5];
		
		for(int i = 0; i < st.length; i++) {
			st[i] = new Student();
			st[i].no = i+1;
			st[i].kor = (int)(Math.random() * 101);
			st[i].eng = (int)(Math.random() * 101);
			st[i].math = (int)(Math.random() * 101);
		}
		st[0].name = "철수";
		st[1].name = "영희";
		st[2].name = "바둑";
		st[3].name = "길동";
		st[4].name = "영수";
		
		for(Student s : st) {
			System.out.println(s);
			System.out.println();
		}
	}
}
