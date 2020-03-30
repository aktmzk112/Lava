package day16;

import java.util.*;

public class Test07 {

	public Test07() {
		Vector vec = new Vector();
		System.out.println(vec.capacity()); // 백터의 사이즈 확인

		for (int i = 0; i < 11; i++) {
			vec.add(i);
		}
		for (Object obj : vec) {
			System.out.println((int) obj);
		}
		System.out.println(vec.capacity()); // 백터의 사이즈 확인

		for (int i = 0; i < 10; i++) {
			vec.add(i);
		}
		System.out.println(vec.capacity()); // 백터의 사이즈 확인

	}

	public static void main(String[] args) {
		new Test07();
	}

}
