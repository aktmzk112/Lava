package day04;

import java.util.*;
/*
 *  4�ڸ� ���ε� �⵵�� �Է� �޾Ƽ� 
 *  �������� ������� �Ǵ��ؼ� ����ؼ�
 *  ��!. switch ~ case �� ó�� 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		int code=0;
		
		//�ڵ常���( 4�� ������������ �� -1 100���� ���� �������¼��� - 2 400����
		//������������ -3
		
		if(year % 400 == 0) {
			code = 3;
		}else if(year % 100 == 0) {
			code = 2;
		}else if(year % 4 == 0) {
			code = 1;
		}
		
		System.out.println(code);
		
		switch (code) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("����");
			break;
		case 0:
			System.out.println("���");
			break;
		}

	}

}
