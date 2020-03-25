package day12.sub;

import day12.*;

public class Test04_01 extends Test04 {
	public Test04_01() {
		Test04 t1 = new Test04();
//		t1.no1 = 10;
//		t1.no2 = 20;
		super.no3 = 30;
		t1.no4 = 50;
	}

	public static void main(String[] args) {

		new Test04_01();

	}

}
