package day02;

import java.util.*;

public class Ex01_01 {

	public Ex01_01() {
//		 * 	문제 1]
//				 	3자리로 구성된 숫자 하나를 입력을 받은 후 또는 렌덤하게 만든 후
//				 	백자리 이하를 버린 숫자를 만들어서 출력
//				 		예]
//				 	 		4 --> 400
		
		int num = (int)(Math.random() *(999-100+1)) +100;
		int num2 = num / 100 * 100;
		System.out.println(num2);
		
	}

	public static void main(String[] args) {
		new Ex01_01();

	}

}
