package day17;

import java.util.*;
public class Test07 {
/*
 *  ���� ]
 *   	������ ���� 10���� �߻��ϰ� 
 *   	�� ���ڸ� �л����� �����̶�� �����Ѵ�.
 *   	�������� 80~100���� ������ ������ ���� �����Ϸ����Ѵ�
 *   	
 *   	�� �ߺ������� ���� .
 */

	public Test07() {
		//TreeSet�� �����
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		Random rnd = new Random();
		
		//���� �ְ�
		while(true) {
			set.add(rnd.nextInt(101));
			
			if(set.size() == 10) break;
		}
		
		//80~100���� ������ ���� �̾Ƽ� �����ϰ� 
		TreeSet<Integer> tScore = (TreeSet<Integer>)set.subSet(80, 100); 
		// subSet() �� ��ȯ�� Ÿ���� SortedSet�̹Ƿ� ���� ����ȯ ������Ѵ�
		
		//����Ѵ�. (ArrayList)
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
