import java.util.*;

public class QueueEx_t {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>(); //제네릭
//		Queue que = new LinkedList();
//		
//		que.offer("kor");
//		que.offer(10);
		
		que.offer("box");
		que.offer("toy");
		que.offer("robot");
		
		System.out.println(que);
		System.out.println("peek_" + que.peek());
		System.out.println();
		System.out.println("poll_" + que.poll());
		System.out.println(que);
		System.out.println();
		System.out.println("poll_" + que.poll());
		System.out.println(que);
		
	}
}
