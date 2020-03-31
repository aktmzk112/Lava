package day17;

import java.util.*;
public class Test07 {
/*
 *  얘제 ]
 *   	랜덤한 숫자 10개를 발생하고 
 *   	그 숫자를 학생서의 성적이라고 가정한다.
 *   	이증에서 80~100점인 사이의 점수만 따로 관리하려고한다
 *   	
 *   	단 중복점수는 없다 .
 */

	public Test07() {
		//TreeSet을 만들고
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		Random rnd = new Random();
		
		//점수 넣고
		while(true) {
			set.add(rnd.nextInt(101));
			
			if(set.size() == 10) break;
		}
		
		//80~100사의 점수를 따로 뽑아서 저장하고 
		TreeSet<Integer> tScore = (TreeSet<Integer>)set.subSet(80, 100); 
		// subSet() 은 반환값 타입이 SortedSet이므로 강제 형변환 해줘야한다
		
		//출력한다. (ArrayList)
		ArrayList<Integer> list = new ArrayList<Integer>(tScore);
		
		for(int s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
