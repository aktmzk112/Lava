package day06;

import java.util.*;
/*
 ���� 6]
	���ڿ��� �Է¹޾� 
	���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����Ͻÿ�.
	
	����]
		���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ�
		���ڿ�.charAt(��ġ��);
							
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[10];
		System.out.print("���ڿ� �Է�: " );
		String str = sc.nextLine();
		System.out.println();
		
		System.out.println("�Է��� ���ڿ� : " + str);
		System.out.print("���� ���� : ");
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			
			System.out.print( ch[i] + " | ");
		
		}
		
	}

}
