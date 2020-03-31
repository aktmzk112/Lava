package day17;

import java.util.*;

public class Test05 {
// 랜덤하게 숫자를 10개를 만들어서 컬렉션에 담고 출력 하세요 
// 단 , 중복데이터 제외
	public Test05() {
		HashSet<Integer> set = new HashSet<Integer>();
		Random rnd = new Random();
		
		while(true) {
			//먼저 숫자를 랜덤하게 생성
			int num = rnd.nextInt(45)+1;
			//set에 채워두고
			set.add(num);
			
			// 그런데 우리는 숫자 열개만 넣기로 했다.
			// 그런데 set은 중복되 데이터를 허락하지 않고 
			// 따라서 중복된 숫자가 입력이 되먄 입력된 크기는 변경이 안될 것이다.
			// set에 입력된 데이터의 수가 10이되면 빠이빠이 해야한다.
			
			if(set.size() == 10) {
				break;
			}
		}
		
		//set 출력
		
		//1. ArrayList로 변환해서 출력 
			ArrayList<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list);
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i)+ " | ");
			}
			System.out.println();
			System.out.println("------------------Iterator-----------------");
		//2. Iterator 사용 방법
			Iterator<Integer> itor = set.iterator();
			while(itor.hasNext()) {
				System.out.print(itor.next() + " | ");
			}
			System.out.println();
	}

	public static void main(String[] args) {
		new Test05();
	}

}
