package day03;

import java.util.*;
/*
 	���� 2]
 		���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���
 		
 		
 				�ڵ�	�⺻���	�����
 		������	(1)		3800		245
 		�����	(2)		2400		157
 		������	(3)		2900		169
 		�����	(4)		3200		174
 		
 		������ = �⺻��� + ��뷮 * ����� 
 		
 		������ڵ�� ��뷮�� �Է¹޾Ƽ� �������� ������ִ� ���α׷� �ۼ� 
 		
 */
public class Ex03 {

	public void showMenu() {
		System.out.println("����� �뵵�� �����ϼ���");
		System.out.println("1.������ ��� ����");
		System.out.println("2.����� ��� ����");
		System.out.println("3.������ ��� ����");
		System.out.println("4.����� ��� ����");
		System.out.println("5.���� �մϴ�");
		System.out.print("������ �����ϼ��� : ");
	}
	
	public Ex03() {
		
		Scanner sc = new Scanner(System.in);
		
		ot :
		while(true) {
			showMenu();
			int code = sc.nextInt();
		switch (code) {
		case 1:
			home(sc);
			break;
		case 2:
			indu(sc);
			break;
		case 3:
			educ(sc);
			break;
		case 4:
			comm(sc);
			break;
		case 5:
			System.out.println("�߰�!!~");
			break ot;
		default : 
			System.out.println("��ȣ�� �߸��ּ̽��ϴ� �����մϴ�.");
			return;
		}
		}
	}
	
		
	
	public void home(Scanner sc) {
		System.out.println("������� ���� �ϼ̽��ϴ�\n");
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 3800 + num * 245;
		
		System.out.println("��� ����� : "+sum+"�� �Դϴ�.");
		
	}
	
	public void indu(Scanner sc) {
		System.out.println("������� ���� �ϼ̽��ϴ�\n");
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 2400 + num * 157;
		
		System.out.println("��� ����� : "+sum+"�� �Դϴ�.");
	}
	
	public void educ(Scanner sc) {
		System.out.println("�������� ���� �ϼ̽��ϴ�\n");
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 2900 + num * 169;
		
		System.out.println("��� ����� : "+sum+"�� �Դϴ�.");
	}
	
	public void comm(Scanner sc) {
		System.out.println("������� ���� �ϼ̽��ϴ�\n");
		System.out.print("��뷮�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 3200 + num * 174;
		
		System.out.println("��� ����� : "+sum+"�� �Դϴ�.");
	}
	
	public static void main(String[] args) {
		   	new Ex03();
			  }

	}

