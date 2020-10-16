/*
 * Stacn & Queue
 * 
 * Stack : LIFO (Last In First Out)
 *    Stack 클래스 : Vector 클래스의 하위 클래스 (= List 객체)
 *       push(Object o) : 객체를 stack에 추가
 *       Object pop()   : stack의 객체를 꺼냄, return (삭제 O)
 *       Object peek()  : stack의 객체를 return (삭제 X)
 *    
 * Queue : FIFO (First In First Out)
 *    Queue 인터페이스 : LinkedList로 구현됨 => 객체 생성시 LinkedList로 생성
 *       offer(Object o) : 객체를 queue에 추가
 *       Object poll()   : queue의 객체를 꺼냄, return (삭제 o)
 *       Object peek()   : queue의 객체를 return (삭제 x)
 */
package chap15;

import java.util.*;

public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] cars = {"소나타", "그랜저", "SM5", "K9"};
		Stack<String> stack = new Stack<>();
		for (String s : cars) {
			stack.push(s);
		}
		System.out.println("스택에 저장된 객체의 개수: " + stack.size());
		System.out.println(stack.peek());
		System.out.println("스택에 저장된 객체의 개수: " + stack.size());
		System.out.println(stack.pop());
		System.out.println("스택에 저장된 객체의 개수: " + stack.size());
		System.out.println(stack.pop());
		System.out.println("스택에 저장된 객체의 개수: " + stack.size());
		
		System.out.println("=============================");
		
		Queue<String> queue = new LinkedList<>();
		for (String s : cars) {
			queue.offer(s);
		}
		System.out.println("큐에 저장된 객체의 개수: " + queue.size());
		System.out.println(queue.peek());
		System.out.println("큐에 저장된 객체의 개수: " + queue.size());
		System.out.println(queue.poll());
		System.out.println("큐에 저장된 객체의 개수: " + queue.size());
		System.out.println(queue.poll());
		System.out.println("큐에 저장된 객체의 개수: " + queue.size());
	}
}
