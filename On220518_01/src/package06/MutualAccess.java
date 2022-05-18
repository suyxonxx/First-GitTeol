package package06;

class Counter {
	int count = 0;
	
//	synchronized : 쓰레드들을 질서정연하게 해줌.
	public void increment() {
//		일부 기능만 동기화
		synchronized(this) { //동기화 블럭
			count++;
		}
		System.out.println("1111");
		System.out.println("1111");
		System.out.println("1111");
		for(int i = 0; i < 1000000; i++) ;
	}
	
//	해당 메서드의 전체 기능을 동기화
	synchronized public void decrement() {count--;}
	public int getcount() {return count;}
}

public class MutualAccess {
	public static Counter cnt = new Counter();
	
	public static void main(String[] args) throws Exception {
		Runnable task1 = () -> {
			for(int i = 0; i < 1000; i++) {
				cnt.increment();
			}
		};
		
		Runnable task2 = () -> {
			for(int i = 0; i < 1000; i++) {
				cnt.decrement();
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join(); //t1이 참조하는 쓰레드가 종료될 때 까지 대기
		t2.join();
		
		System.out.println(cnt.getcount());
	}
}
