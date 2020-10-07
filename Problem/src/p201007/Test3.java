/*3.  다음 결과가 나오도록 Student 클래스 구현하기
학생이 학번과 이름이 같으면 같은 학생으로 출력하고자 합니다.

[결과]
s1과 s2는 다른 객체입니다.
s1 학생과 s2 학생은 같은 학생입니다.
학생1:studno=1, name=홍길동, major=경영
학생2:studno=1, name=홍길동, major=컴공

public class Test3 {
   public static void main(String[] args) {
         Student s1 = new Student(1,"홍길동","경영");
         Student s2 = new Student(1,"홍길동","컴공");
         if(s1 == s2) {
             System.out.println("s1과 s2는 같은 객체입니다.");
          } else {
             System.out.println("s1과 s2는 다른 객체입니다.");
          }

          if(s1.equals(s2)) {
             System.out.println("s1 학생과 s2 학생은 같은 학생입니다.");
          } else {
             System.out.println("s1 학생과 s2 학생은 다른 학생입니다.");
           }

           System.out.println("학생1:" + s1);
          System.out.println("학생2:" + s2);
    }
}

*/
package p201007;

class Student {
	int studno;
	String name, major;
	Student(int studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return String.format("studno=%d, name=%s, major=%s", studno, name, major);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			if(name.equals(s.name) && studno == s.studno)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studno + name.hashCode();
	}
}

public class Test3 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동", "경영");
		Student s2 = new Student(1, "홍길동", "컴공");
		if (s1 == s2) {
			System.out.println("s1과 s2는 같은 객체입니다.");
		} else {
			System.out.println("s1과 s2는 다른 객체입니다.");
		}

		if (s1.equals(s2)) {
			System.out.println("s1 학생과 s2 학생은 같은 학생입니다.");
		} else {
			System.out.println("s1 학생과 s2 학생은 다른 학생입니다.");
		}

		System.out.println("학생1:" + s1);
		System.out.println("학생2:" + s2);
	}
}
