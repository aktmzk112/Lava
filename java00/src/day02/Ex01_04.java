package day02;

import java.util.*;

public class Ex01_04 {

	public Ex01_04() {
//	 	���� 4]
//		 		�Ҽ����� �ִ� ���ڸ� �Է��Ѽ� 
//		 		�Ҽ��� ���� ��°�ڸ����� �ݿø� ��� ��� 
//		 		
//		 		����]
//		 			+0.005 �� �ϸ� ��°�ڸ� �ݿø� �ǰ�
//		 			���⿡ x100 ���ָ� ��°�ڸ����� �����ο� ���Ű� 
//		 			�̰��� ������ �ٲٸ� �������� ��°�ڸ� ���ϴ� �������̰� 
//		 			�ٽ� /100 ���� ���ָ� 
//		 			�ٽ� �Ҽ��� ���·� ��ȯ �ɰ��̴�.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� �Ҽ� �Է� : ");
		
		float num = sc.nextFloat();
		
		float num2 = num + 0.005f;
		System.out.println(num2);
		float num3 = num2 * 100;
		System.out.println(num3);
		int num4 = (int) num3;
		System.out.println(num4);
		float num5 = (float) num4 /100f;
		
		System.out.println(num5);
		
		
		
		
	}

	public static void main(String[] args) {
		new Ex01_04();

	}

}
