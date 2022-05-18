package package07;

public class ThreadEx1Lamda {
	public static void main(String[] args) {
		ThreadEx1Lamda_1 t1 = new ThreadEx1Lamda_1();
		Runnable r = () -> {for(int i = 0; i < 5; i++) {
//							Thread.currentThread() : 현재 실행중인 Thread를 반환함.
							System.out.println(Thread.currentThread().getName());
							}
						};
		Thread t2 = new Thread(r); //생성자 Thread(Runnable target) {...
		
		t1.start();
		t2.start();
	}
}

class ThreadEx1Lamda_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName()); //조상인 Thread의 getName()을 호출
		}
	}
}

//class ThreadEx1Lamda_2 implements Runnable {
//	@Override
//	public void run() {
//		for(int i = 0; i < 5; i++) {
//			Thread.currentThread() : 현재 실행중인 Thread를 반환함.
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
