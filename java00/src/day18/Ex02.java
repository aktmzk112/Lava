package day18;

import java.util.*;

/*
 	���� 2]
 		�л��� �̸� ��ȣ �� ���� ���� ���� ���� ��
 		�� ������ VOŬ������ ����� 
 		
 		5�л��� �����͸� �Է��ؼ� ������ set�� ���� 
 		�̸������� ���
 */
public class Ex02 {

	public Ex02() {
		ArrayList<String> nSet = new ArrayList<String>();
		TreeSet<Stdu> sSet = new TreeSet<Stdu>();
		nSet.add("�ֵο�");
		nSet.add("��ҿ�");
		nSet.add("�ؼ�");
		nSet.add("��");
		nSet.add("����������");
		
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
