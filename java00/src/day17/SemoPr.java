package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SemoPr {

	public SemoPr() {
		ArrayList<Semo> list = new ArrayList<Semo>();
		
		for(int i=0; i<10; i++) {
			int no1 = (int) (Math.random() * 16+5);
			int no2 = (int) (Math.random() * 16+5);
			list.add(new Semo(no1,no2));
		}
		
		//�׳� ���
		for(Semo s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		//���̸� �������� ������ ���� 
		Collections.sort(list);
		
		//������ ���
		for(Semo s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		
		//�غ� �������� ����
		Collections.sort(list , new HwSort02());
		
		for(Semo s : list) {
			System.out.print(s.getWidth() + " | ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		
		//�غ� �������� ����Ŭ���� ����Ͽ� �������� ����
		Collections.sort(list , new Comparator() {
			public int compare(Object o1, Object o2) {
				Semo s1 = (Semo) o1;
				Semo s2 = (Semo) o2;
				int result = s2.getWidth() - s1.getWidth();
				
				return result;
			}
		});
		
		for(Semo s : list) {
			System.out.print(s.getWidth() + " | ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		new SemoPr();
	}

}
