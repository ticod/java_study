/*
 * ObjectInputStream
 *  - ObjectOutputStream에서 만든 파일을 불러오기
 */
package chap18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		System.out.println("복원된 객체: " + c1 + "," + c2);
	}
}
