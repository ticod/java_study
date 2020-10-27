/*
다음 결과가 나오도록 프로그램을 완성하시오

[결과]
이름 목록 :홍길동,김삿갓,이몽룡,김자바,박자바,
나이 목록 :10,30,15,25,20,
총나이의 합산 :100
나이의 평균 :20.0 
*/
/*
class Person {

      String name;
      int age;

      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      public String toString() {
             return name + ":" + age;
      }
}

public class Test1 {

	static Person[] arr = { new Person("홍길동", 10),
			new Person("김삿갓", 30),
			new Person("이몽룡", 15),
			new Person("김자바", 25),
			new Person("박자바", 20) 
	};
	
	public static void main(String[] args) {
		System.out.print("이름 목록 :");
		printString();
		System.out.print("나이 목록 :");
		printInt();
		System.out.print("총나이의 합산 :");
		printTot();
		System.out.print("나이의 평균 :");
		printAvg();
	}
	
	static void printString(Function<Person, String> f) {
	
	}
	
	static void printInt(ToIntFunction<Person> f) {
	
	}
	
	static void printTot(ToIntFunction<Person> f) {
	
	}
	
	static void printAvg(ToDoubleFunction<Person> f) {
	
	}
}
*/
package p201027;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
           return name + ":" + age;
    }
}

public class Test1 {

	static Person[] arr = { new Person("홍길동", 10),
			new Person("김삿갓", 30),
			new Person("이몽룡", 15),
			new Person("김자바", 25),
			new Person("박자바", 20) 
	};
	
	public static void main(String[] args) {
		System.out.print("이름 목록 : ");
		printString(p->p.name);
		
		System.out.print("나이 목록 : ");
		printInt(p->p.age);
		
		System.out.print("총나이의 합산 : ");
		printTot(p->p.age);
		
		System.out.print("나이의 평균 : ");
		printAvg(p->p.age);
	}
	
	static void printString(Function<Person, String> f) {
		StringBuilder sb = new StringBuilder();
		for (Person p : arr) {
			sb.append(f.apply(p) + ",");
		}
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb.toString());
	}
	
	static void printInt(ToIntFunction<Person> f) {
		StringBuilder sb = new StringBuilder();
		for (Person p : arr) {
			sb.append(f.applyAsInt(p) + ",");
		}
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb.toString());
	}
	
	static void printTot(ToIntFunction<Person> f) {
		int sum = 0;
		for (Person p : arr) {
			sum += f.applyAsInt(p);
		}
		
		System.out.println(sum);
	}
	
	static void printAvg(ToDoubleFunction<Person> f) {
		double sum = 0;
		for (Person p : arr) {
			sum += f.applyAsDouble(p);
		}
		
		System.out.println(sum / arr.length);
	}
}
