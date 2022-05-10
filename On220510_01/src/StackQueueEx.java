import java.util.*;

public class StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack();
//		인터페이스의 객체를 생성하는 것은 불가능하므로, 다음과 같이 다형성을 활용
//		1. Queue 인터페이스의 구현체인 LinkedList를 사용
//		Queue q = new LinkedList();
//		2. Queue 인터페이스의 구현체인 AbstractQueue의 자녀클래스인 PriorityQueue를 사용
		Queue q = new PriorityQueue();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
//		스택(Stack) : 저장(push) & 추출(pop) - LIFO(Last In First Out)
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
//		큐(Queue) : 저장(offer) & 추출(poll) - FIFO(First In First Out)
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	} //end of main
}
