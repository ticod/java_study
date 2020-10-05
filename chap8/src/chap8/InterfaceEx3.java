/*
 * 인터페이스에는 멤버가 없을 수도 있다.
 */
package chap8;

interface Repairable {}

class Unit {
	final int MAX;
	int hp;
	Unit(int hp){
		this.MAX = hp;
		this.hp = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank() {super(150);}
	public String toString() {return "Tank";}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {super(125);}
	public String toString() {return "Dropship";}
}

class Marine extends GroundUnit {
	Marine() {super(40);}
	public String toString() {return "Marine";}
}

class Scv extends GroundUnit implements Repairable {
	Scv() {super(60);}
	public String toString() {return "Scv";}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			u.hp = u.MAX;
			System.out.println(r + " 수리 완료");
		}
//		r.hp = r.MAX // r에는 hp, MAX 멤버가 존재하지 않아 에러
		// 따라서 위와 같이 Unit으로 형변환 후 Unit 멤버에 접근을 한다.
	}
}

public class InterfaceEx3 {
	public static void main(String[] args) {
		Tank t = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		Scv s = new Scv();
		
		System.out.println(t + " [" + t.hp + "]");
		System.out.println(d + " [" + d.hp + "]");
		System.out.println(s + " [" + s.hp + "]");
		
		t.hp -= 50;
		d.hp -= 30;
		s.hp -= 55;
		
		System.out.println(t + " [" + t.hp + "]");
		System.out.println(d + " [" + d.hp + "]");
		System.out.println(s + " [" + s.hp + "]");
		
		s.repair(t); s.repair(d);
//		s.repair(m);
		s.repair(s);
		
		System.out.println(t + " [" + t.hp + "]");
		System.out.println(d + " [" + d.hp + "]");
		System.out.println(s + " [" + s.hp + "]");
	}
}
