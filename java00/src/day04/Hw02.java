package day04;
import java.util.*;
/*
 	�μ��� �Է¹�����
 	�μ��� �ּҰ������ ���
 	
 	�ּҰ������ �� ���� ������ �������� ���� ���� ��
 */
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է��ض� : ");
		int no1 = sc.nextInt();
		System.out.print("����2 �Է��ض� : ");
		int no2 = sc.nextInt();
		sc.close();
		
		if(no2 > no1) {
			int tmp = no1;
				no1 = no2;
				no2 = tmp;
		}
		 
		for(int i=no2; i<100; i++) {
			
			if(no1%i == 0 && no2%i == 0) {
				System.out.println(i);
				break;
			}
		}
		

	}

}
