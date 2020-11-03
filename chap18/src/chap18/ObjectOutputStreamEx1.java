/*
 * ObjectOutputStream 예제
 *  1. 객체를 외부로 전송할 수 있는 스트림
 *  2. 전송이 되는 객체는 반드시 Serializable interface 구현
 *  3. 객체를 외부로 전송하는 기능을 직렬화라 한다
 *  4. ObjectInputStream으로 객체를 읽을 수 있다.
 */
package chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("[%s:%d]", name, age);
	}
}

public class ObjectOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동", 20);
		Customer c2 = new Customer("김삿갓", 30);
		oos.writeObject(c1);
		oos.writeObject(c2);
		System.out.println(c1 + ", " + c2);
	}
}
