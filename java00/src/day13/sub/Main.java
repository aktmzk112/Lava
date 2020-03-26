package day13.sub;

import java.util.*;

public class Main {

	public Main() {
		ArrayList list = new ArrayList();

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ] ");
			int cnt = (int) (Math.random() * 3 + 1);
			int no1 = (int) (Math.random() * 41 + 10);
			int no2 = (int) (Math.random() * 41 + 10);

			if (cnt == 1) {
				list.add(new Samgak(no1, no2));
			} else if (cnt == 2) {
				list.add(new Nemo(no2, no1));
			} else {
				list.add(new Won(no2));

			}

		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
