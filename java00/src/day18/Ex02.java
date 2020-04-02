package day18;

import java.util.*;

/*
 	문제 2]
 		학생의 이름 번호 반 국어 영어 수학 총점 평슌
 		을 저장할 VO클래스를 만들고 
 		
 		5학생의 데이터를 입력해서 관리할 set을 만들어서 
 		이름순으로 출력
 */
public class Ex02 {

	public Ex02() {
		ArrayList<String> nSet = new ArrayList<String>();
		TreeSet<Stdu> sSet = new TreeSet<Stdu>();
		nSet.add("최두용");
		nSet.add("김소영");
		nSet.add("팽수");
		nSet.add("나");
		nSet.add("생명의은인");
		
		int no=1001;
		for(int i=0; i<5; i++) {

			
			sSet.add(new Stdu());
			
			
//			sSet.get(i).setName(nSet.get(i));
//			sSet.get(i).setBan(ban);
//			sSet.get(i).setNo(no++);
//			sSet.get(i).setKor(kor);
//			sSet.get(i).setEng(eng);
//			sSet.get(i).setMath(math);
//			sSet.get(i).setSum();
//			sSet.get(i).setAvg();

		}
		
//		TreeSet<Stdu> sSet2 = new TreeSet<Stdu>(sSet);
		
		Iterator<Stdu> itor = sSet.iterator();
		
		while(true) {
			int ban=1;
			int kor = (int) (Math.random() * 91 + 10);
			int eng = (int) (Math.random() * 91 + 10);
			int math = (int) (Math.random() * 91 + 10);
			itor.next().setKor(kor);
			itor.next().setEng(eng);
			itor.next().setMath(math);
			
			System.out.println(itor.next().getKor());
		
		}
		
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
