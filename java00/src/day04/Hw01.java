package day04;


import java.util.*;
/*
 	�μ��� �Է¹�����  
 	�μ��� �ִ������� ���ؼ� ������ִ� ���α׷� �ۼ�
 	
 	�ִ�����]
 		�μ��� ���� �� �ִ� �ִ� ��..?
 */
public class Hw01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int no1 = sc.nextInt();
		System.out.print("����2�� �Է��ϼ��� : ");
		int no2 = sc.nextInt();
		
		if(no2 > no1) {
			int tmp = no1;
				no1 = no2;
				no2 = tmp;
		}
		for(int i = no2; i>0; i--) {
			
			if(no1%i == 0 && no2%i ==0) {
				System.out.println(no1 + " �� " +no2+" �� �ִ� ������� " + i + " �Դϴ�.");
				break;
			}

			

			}
		}
		
	}

