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
		
		//그냥 출력
		for(Semo s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		//넓이를 기준으로 정렬을 하자 
		Collections.sort(list);
		
		//정렬후 출력
		for(Semo s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		
		//밑변 기준으로 정렬
		Collections.sort(list , new HwSort02());
		
		for(Semo s : list) {
			System.out.print(s.getWidth() + " | ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
		
		//밑변 기준으로 무명클래스 사용하여 내림차순 정렬
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
