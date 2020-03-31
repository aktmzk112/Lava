package day17;

import java.util.*;
public class Test02 {

	public Test02() {
		ArrayList<Samgak> list = new ArrayList<Samgak>();
	
		//list 삼각형 채워주기
		for(int i=0; i<10; i++) {
			int no1 = (int) (Math.random() * 16 +5);
			int no2 = (int) (Math.random() * 16 +5);
			list.add(new Samgak(no1,no2));
		}
		//리스트 내용중 면적 출력
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		
		// 정렬을 해보자, 지금 리스트에 입력되어있는 객체는 
		// 서로 크리를 비교할 수 없는 상태이므로
		// 비교자를 만들어서 입력해주고 비교해보자
		
		Collections.sort(list,new HwSort01());
		
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		System.out.println();
		
		//이번에는 높이를 기준으로 내림차순 정렬 하자
		Collections.sort(list,new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Samgak) o2).getHeight()-((Samgak)o1).getHeight();
			}
		});
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i).getHeight() + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test02();
	}

}
