package day02;

import java.util.*;

public class Ex01_01 {

	public Ex01_01() {
//		 * 	���� 1]
//				 	3�ڸ��� ������ ���� �ϳ��� �Է��� ���� �� �Ǵ� �����ϰ� ���� ��
//				 	���ڸ� ���ϸ� ���� ���ڸ� ���� ���
//				 		��]
//				 	 		4 --> 400
		
		int num = (int)(Math.random() *(999-100+1)) +100;
		int num2 = num / 100 * 100;
		System.out.println(num2);
		
	}

	public static void main(String[] args) {
		new Ex01_01();

	}

}
