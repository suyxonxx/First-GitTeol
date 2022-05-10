import java.util.*;

public class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue에 최대 5개 까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
//				화면으로부터 라인 단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
//					5개 이상 입력한 경우, 최근에 입력한 명령어를 5개 보여주며,
//					5개 미만 입력한 경우, 입력한 명령어의 갯수 만큼 최근에 입력한 명령어를 보여줌.
					System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
//					입력받은 명령어를 저장하고
					save(input);
					
//					LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext())
						System.out.println(++i + "." + it.next()); //1번부터 시작해야 하므로 전위형 증가 연산자를 사용.
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("입력 오류입니다.");
			}
		} //end of while
	} //end of main
	
	public static void save(String input) {
//		queue에 저장한다.
		if(!"".equals(input))
			q.offer(input);
		
//		queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if(q.size() > MAX_SIZE) //size()는 Collection 인터페이스에 정의
			q.remove();
	} //end of save method
} //end of class
