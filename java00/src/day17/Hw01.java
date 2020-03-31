package day17;

import java.util.*;
public class Hw01 {

	public Hw01() {
		HashMap<Integer , Object> map = new HashMap<Integer, Object>();
		
		ArrayList list = new ArrayList();
		
		list.add(1001);
		list.add("ÀÌ¸§");
		list.add(40);
		list.add("010-2253-1142");
		
		
		
		map.put(1,list);
		
		ArrayList list1 = (ArrayList)map.get(1);
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		for(Object le : list1) {
			System.out.println(le);
			
		}
		
		
		 
	}

	public static void main(String[] args) {
		new Hw01();
	}

}
