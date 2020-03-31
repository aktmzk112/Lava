package day17;

import java.util.*;

public class Test05 {
// �����ϰ� ���ڸ� 10���� ���� �÷��ǿ� ��� ��� �ϼ��� 
// �� , �ߺ������� ����
	public Test05() {
		HashSet<Integer> set = new HashSet<Integer>();
		Random rnd = new Random();
		
		while(true) {
			//���� ���ڸ� �����ϰ� ����
			int num = rnd.nextInt(45)+1;
			//set�� ä���ΰ�
			set.add(num);
			
			// �׷��� �츮�� ���� ������ �ֱ�� �ߴ�.
			// �׷��� set�� �ߺ��� �����͸� ������� �ʰ� 
			// ���� �ߺ��� ���ڰ� �Է��� �ǐ� �Էµ� ũ��� ������ �ȵ� ���̴�.
			// set�� �Էµ� �������� ���� 10�̵Ǹ� ���̺��� �ؾ��Ѵ�.
			
			if(set.size() == 10) {
				break;
			}
		}
		
		//set ���
		
		//1. ArrayList�� ��ȯ�ؼ� ��� 
			ArrayList<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list);
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i)+ " | ");
			}
			System.out.println();
			System.out.println("------------------Iterator-----------------");
		//2. Iterator ��� ���
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
