/*
 * ObjectOutputStream 예제
 *  1. 객체를 외부로 전송할 수 있는 스트림
 *  2. 전송이 되는 객체는 반드시 Serializable interface 구현
 *     => 구현 안하면 java.io.NotSerializableException 예외 발생
 *  3. 객체를 외부로 전송하는 기능을 직렬화라 한다
 *  4. ObjectInputStream으로 객체를 읽을 수 있다.
 *  5. transient 예약어로 해당 멤버를 직렬화할 때 제외할 수 있다
 *     => 정확히는 인스턴스의 값이 제외, 기본 값으로 전송된다.
 */
package chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
	private String name;
//	private int age;
	private transient int age;
	
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
