package day04;

import java.util.*;
/*
 * 	5�ڸ� ������ �Է¹޾Ƽ� 
 *  �� ���ڰ� ȸ���� ���� �ƴ��� �Ǻ� 
 *  �ع�����?
 *  	�տ��� ������ �ڿ��� ������ �Ȱ�����.
 *  	�� 12321 - ȸ����
 *  
 *  	   12312 - 	ȸ���� x
 */
public class Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ 5�ڸ� �Է� : ");
		  int number = sc.nextInt();
		  int tmp = number;
		  int num = 0;
		 
		  for(int i=0; i<5; i++) {
		   
			  num = num*10 + tmp%10; 
		   System.out.println(num);
		   tmp=tmp/10; 
		   


		  }
		  
		  if (number == num) {
		   System.out.println(number + "�� ȸ����.");
		  }else {
		   System.out.println(number + "�� ȸ������ �ƴ�.");
		  }
		  }
		
	}

		
	
