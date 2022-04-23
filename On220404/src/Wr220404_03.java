
public class Wr220404_03 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		int namba = 0;
		
//		얘네 둘은 그냥 동일하게 작용함. 순혈 덧셈가문 출신들임.
		namba = namba + 1;
		System.out.println(namba);
		namba += 1;
		System.out.println(namba);
		
//		얘네 둘은 별다른 변수들의 개입 없이 단일 변수 연산에만 쓰인다면 동일하게 작용함.
		++namba; //전위형 - 연산부터 먼저, 대입은 나중에
		System.out.println(namba);
		namba++; //후위형 - 대입부터 먼저, 연산은 나중에
		System.out.println(namba);
		System.out.println("");

		System.out.println("-2-");
//		다른 변수들이 개입한다면, 다음과 같이 성질이가 나와버림.
		int nambawan = 0, nambatwo = 0, nambasam = 0;
//		전·후위형 연산을 진행할 땐, 먼저 위와 같이 변수명들을 필요한 만큼 지정해주어야 함.
//		하나의 변수만을 가지고 println 뒤의 괄호 안에 ++~ or ~++을 냅다 쌩으로 집어넣고 돌리면
//		이상한 결과가 도출됨.
		
		nambatwo = ++nambawan;
		System.out.println("nambawan : " + nambawan + ", " + "nambatwo : " + nambatwo);
		
		nambasam = nambawan++;
		System.out.println("nambawan : " + nambawan + ", " + "nambasam : " + nambasam);
		System.out.println("");

		System.out.println("-3-");
//		전위형과 후위형의 원리
		int jeonI = 1;
		int jeonJ = 1;
		
		jeonI += 1;
		jeonJ = jeonI; //전위형 → jeonJ = ++jeonI
		
		System.out.println("jeonI : " + jeonI + ", " + "jeonJ : " + jeonJ);
		
		int whooI = 1;
		int whooJ = 1;
		
		whooJ = whooI;
		whooI += 1; //후위형 → whooJ = whooI++
		
		System.out.println("whooI : " + whooI + ", " + "whooJ : " + whooJ);
		System.out.println("");

		System.out.println("-4-");
//		아래는 '이딴식으로 작성하지 마라' 라는 뜻으로 들어놓은 예시들임.
//		중요) 연산식의 우항에서는 같은 변수를 두 번 이상 사용하지 말아야 함.
//		참고) 아래에서 ++nambawan을 nambatwo로, nambawan++을 nambasam으로 바꾸고 돌려도 똑같이 나옴 지뢰가 따로 없음.
		System.out.println(nambawan++ - ++nambawan);
		System.out.println(++nambawan - nambawan++);
		
	}

}

