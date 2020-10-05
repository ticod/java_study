package chap8;

abstract class Animal {
	String type;
	abstract void eat();
	Animal(String type){
		this.type = type;
	}
}

interface Flyable {
	void fly();
}

class Dove extends Animal implements Flyable {
	Dove(){
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println("비둘기는 작은 벌레를 잡아먹는다.");
	}
	@Override
	public void fly() {
		System.out.println("비둘기는 날아다닌다.");
	}
}

class Monkey extends Animal {
	Monkey(){
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println("원숭이는 나무에서 열매를 따먹는다.");
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat(); // 비둘기는 작은 벌레를 잡아먹는다.
		if(a instanceof Flyable) {
			((Flyable)a).fly(); // 비둘기는 날아다닌다.
		}
		a = new Monkey();
		a.eat(); // 원숭이는 나무에서 열매를 따먹는다.
		if(a instanceof Flyable) {
			((Flyable)a).fly(); // 실행 안됨
		}
	}
}
