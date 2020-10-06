package chap9;

class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method1() {
			int iv = 300;
			System.out.println("iv=" + iv);							// 300
			System.out.println("iv2=" + iv2);						// 20
			System.out.println("this.iv=" + this.iv);				// 100
			System.out.println("Outer3.this.iv=" + Outer3.this.iv);	// 10
		}
	}
}

public class InnerEx3 {
	public static void main(String[] args) {
		Outer3.InstanceInner i = new Outer3().new InstanceInner();
		i.iv++;
		i.method1();
		
		new Outer3().new InstanceInner().method1();
	}
}
