package day17;

import java.util.*;
public class Test01 {

	public Test01() {
		ArrayList<Sagak> list = new ArrayList<Sagak>(); 
		
		for(int i=0; i < 10; i++) {
			int no1 = (int) (Math.random() * 16 + 5);
			int no2 = (int) (Math.random() * 16 + 5);
			list.add(new Sagak(no1,no2));
		}
		
		for(Sagak s : list) {
			System.out.print(s.getArea() + " | ");
		}
		System.out.println();
		//이제 이 ArrayList 를 정렬하자 
		//정렬하는 방법은 Collections 클래스에 소속된 sort() 함수를 호출하면 내림 차순 정렬이 된다.
		Collections.sort(list);
		
		for(Sagak s : list) {
			System.out.print(s.getArea() + " | ");
		}
		
		System.out.println();
		//이제 가로를 기준으로 정렬할려고 한다.
		Collections.sort(list , new HwSort());
		for(Sagak s : list) {
			System.out.print(s.getWidth() + " | ");
		}
	}

	public static void main(String[] args) {

		new Test01();
	}

}
