/*
 * Vector 예제 : Collection 프레임워크 이전 클래스
 *               List 인터페이스의 구현 클래스
 *               이전 사용된 메서드와 List를 구현한 메서드가 함께 존재.
 *               
 * add() : return true
 * addElement() : return void
 * 
 */
package chap15;

import java.util.List;
import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
		list.add(0.3); // return true
		// Collection의 add를 overriding함 => return true
		// Set과 같은 컬렉션에서 요소를 넣었을 때 검사하여 false를 리턴해야할 수도 있기 때문에
		// 반환값을 boolean으로 뒀고, 이에 따라 오버라이딩을 위해 return true한다.
		// 다만, List의 add는 어느 요소값이 들어가도 옳기때문에 true를 반환한다.
		// 출처: https://stackoverflow.com/questions/24173117/why-does-list-adde-return-boolean-while-list-addint-e-returns-void //
		list.add(Math.PI);
		list.addElement(5.0); // Vector의 원래 메서드 : return void, 기능은 add와 동일
		
		/*
		 * Wrapper class는 자동 형변환이 일어나지 않는다. 즉
		 * 5 => Double형으로 자동 형변환이 일어나지 않음.
		 * 5는 Integer형으로 Boxing(형변환)이 일어남.
		 */
		
		// Collection의 method가 아님 => return void
		
		for (Double d : list) {
			System.out.println(d);
		}
		
		double num = 5.0;
		int index = list.indexOf(num);
		if (index < 0) {
			System.out.println(num + "은 list에 없습니다.");
		} else {
			System.out.println(num + "의 위치: " + index);
		}
		num = 0.3;
		// list 객체에서 num 객체의 위치 리턴
		System.out.println(list.indexOf(num, 0));
		// contains:
		if (list.contains(num)) {
			list.removeElement(num);	
			System.out.println(num + "삭제됨");
		}
		list.remove(5.0);
		System.out.println(list + ", " + list.size());
		
		List<Double> listList = new Vector<>();
		((Vector)listList).removeElement(0);
		((Vector)listList).addElement(5.0); // List에는 addElement 메서드가 존재하지 않는다.
	}
}
