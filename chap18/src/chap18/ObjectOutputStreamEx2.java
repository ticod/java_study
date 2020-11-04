/*
 * ObjectOutputStream 예제 2 - 상속에서 직렬화
 * 
 * writeUTF : 직렬화에 String 객체를 추가한다
 * defaultWriteObject : 기본적인 직렬화 대상인 값 출력
 * readUTF : writeUTF로 직렬화한 String 객체를 복원하는데 사용
 * defaultReadObject : 기본 직렬화 대상 복원
 */
package chap18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserInfo {
	protected String name;
	protected String password;
	
	public UserInfo() {}
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String.format("[%s,%s]", name, password);
	}
}

class User extends UserInfo implements Serializable {
	private int age;
	
	public User(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("[%s,%s,%d]", name, password, age);
	}

	/*
	 * 직렬화에 추가할 수 있는 기능
	 */
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}

public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));
		User u1 = new User("홍길동", "1234", 20);
		User u2 = new User("김삿갓", "5678", 30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println("사용자: " + u1 + ", " + u2);
	}
}
