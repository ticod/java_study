/*
2.
        1. Student 클래스 구현하기
        멤버변수 : 이름,국어점수, 영어점수, 수학점수
        멤버메서드
        String toString() : 각멤버변수값,총점,평균 출력
        int getTotal() : 점수의 합 리턴
        int compareTo() : 이름 오름차순으로 정렬되도록 구현
		2. main 메서드 완성하기
		
        [결과]

기본정렬방식
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)

총점기준 내림차순 정렬
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)

국어 점수내림차순 정렬
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)

영어 점수내림차순 정렬
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)

수학 점수내림차순 정렬
임꺽정:국어(60),영어(75),수학(100),총점(235),평균(78.33)
이몽룡:국어(80),영어(95),수학(95),총점(270),평균(90.00)
김삿갓:국어(95),영어(85),수학(75),총점(255),평균(85.00)
홍길동:국어(90),영어(80),수학(70),총점(240),평균(80.00)
*/
package p201016;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;
    final int subjectCount = 3;
    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor + eng + math;
    }
    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.name);
    }
    @Override
    public String toString() {
        return String.format("%s:국어(%d),영어(%d),수학(%d),총점(%d),평균(%.2f)",
                            name, kor, eng, math, getTotal(), (double)getTotal()/subjectCount);
    }
}

public class Test2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("홍길동", 90, 80, 70));
        list.add(new Student("김삿갓", 95, 85, 75));
        list.add(new Student("이몽룡", 80, 95, 95));
        list.add(new Student("임꺽정", 60, 75, 100));

        System.out.println("기본정렬방식");
        TreeSet<Student> set1 = new TreeSet<>();
        set1.addAll(list);
        for(Student s : set1) System.out.println(s);

        System.out.println("총점기준 내림차순 정렬");
        TreeSet<Student> set2 = new TreeSet<>((s1, s2) -> s2.getTotal() - s1.getTotal());
        set2.addAll(list);
        for(Student s : set2) System.out.println(s);

        System.out.println("국어 점수내림차순 정렬");
        TreeSet<Student> set3 = new TreeSet<>((s1, s2) -> s2.kor - s1.kor);
        set3.addAll(list);
        for(Student s : set3) System.out.println(s);

        System.out.println("영어 점수내림차순 정렬");
        TreeSet<Student> set4 = new TreeSet<>((s1, s2) -> s2.eng - s1.eng);
        set4.addAll(list);
        for(Student s : set4) System.out.println(s);

        System.out.println("수학 점수내림차순 정렬");
        TreeSet<Student> set5 = new TreeSet<>((s1, s2) -> s2.math - s1.math);
        set5.addAll(list);
        for(Student s : set5) System.out.println(s);
    }
}

// makeTreeSet, setPrint 구현

//public class Test2 {
//    public static void main(String[] args) {
//        List<Student> list = new ArrayList<Student>();
//        list.add(new Student("홍길동", 90, 80, 70));
//        list.add(new Student("김삿갓", 95, 85, 75));
//        list.add(new Student("이몽룡", 80, 95, 95));
//        list.add(new Student("임꺽정", 60, 75, 100));
//
//        System.out.println("기본정렬방식");
//        Set<Student> set = makeTreeSet(list);
//        setPrint(set);
//
//        System.out.println("총점기준 내림차순 정렬");
//        set = makeTreeSet(list, (s1, s2) -> s2.getTotal() - s1.getTotal());
//        setPrint(set);
//
//        System.out.println("국어 점수내림차순 정렬");
//        set = makeTreeSet(list, (s1, s2) -> s2.kor - s1.kor);
//        setPrint(set);
//
//        System.out.println("영어 점수내림차순 정렬");
//        set = makeTreeSet(list, (s1, s2) -> s2.eng - s1.eng);
//        setPrint(set);
//
//        System.out.println("수학 점수내림차순 정렬");
//        set = makeTreeSet(list, (s1, s2) -> s2.math - s1.math);
//        setPrint(set);
//    }
//
//    public static <T> Set<T> makeTreeSet(List<T> s, Comparator<T> c) {
//        Set<T> set = new TreeSet<T>(c);
//        set.addAll(s);
//        return set;
//    }
//
//    public static <T> Set<T> makeTreeSet(List<T> s) {
//        Set<T> set = new TreeSet<T>();
//        set.addAll(s);
//        return set;
//    }
//
//    public static <T> void setPrint(Set<T> s) {
//        for(T t : s) System.out.println(t);
//    }
//}
