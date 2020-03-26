package day13;

import java.util.*;

public class Total {

	public Total() {
		ArrayList list = new ArrayList();
		list.add(new Nemo());
		list.add(new Semo());
		list.add(new Won());

//		Nemo n1 = (Nemo) list.get(1);
		for (int i = 0; i < 10; i++) {
			System.out.print(i+1 +" ] ");
			int cnt = (int) (Math.random() * 3 + 1);
			int no1 = (int) (Math.random() * 41 + 1);
			int no2 = (int) (Math.random() * 41 + 1);
			if (cnt == 1) {
				Nemo n1 = (Nemo) list.get(0); 
//				System.out.println("»ç°¢ÇüÀÇ ³ÐÀÌ : "+n1.setArea(no1,no2));
				n1.setArea(no2, no1);
				n1.toPring();
				System.out.println("-------------------------------------------------------------------");
			} else if (cnt == 2) {
				Semo s1 = (Semo) list.get(1);
				s1.setArea(no1, no2);
//				System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : "+ s1.setArea(no2,no1));
				s1.toPring();
				System.out.println("-------------------------------------------------------------------");
			} else if (cnt == 3) {
				Won w1 = (Won) list.get(2);
//				System.out.println("¿øÀÇ ³ÐÀÌ : "+w1.setArea(no1));
				w1.setArea(no2);
				w1.toPring();
				System.out.println("-------------------------------------------------------------------");
			}
		}

	}

	public static void main(String[] args) {

		new Total();
	}

}
