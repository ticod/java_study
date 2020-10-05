/*
 * 리턴타입으로 인터페이스 사용하기
 */
package chap8;

class LazerZet implements Printerable {
	@Override
	public void print() {
		System.out.println("레이저 printer에서 출력함");
	}
}

class InkZet implements Printerable {
	@Override
	public void print() {
		System.out.println("잉크젯 printer에서 출력함");
	}
}

class PrinterManager {
	public static Printerable getPrinter(String type) {
		if(type.equals("INK")) return new InkZet();
		else return new LazerZet();
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Printerable p = PrinterManager.getPrinter("INK");
		p.print();
		p = PrinterManager.getPrinter("LAZER");
		p.print();
		InkZet ink = (InkZet)PrinterManager.getPrinter("INK"); // 명시적 형변환 필요
//		LazerZet ink = (LazerZet)PrinterManager.getPrinter("INK"); // 런타임 에러: ClassCastException
		ink.print();
	}
}
