package day06;

import java.util.*;
/*
 * ���� 8]
	ȸ�� �̸�, ��ȭ��ȣ, �̸��� ������ �迭�� ����� 
	�����͸� �Է��ϸ� 
	
	ȸ���� �̸��� �Է��ϸ� 
	�̸�, ��ȭ��ȣ, �̸����� ������ִ� ���α׷��� �ۼ��ϼ���
 */


public class Ex08 {
	
	//�Է¹��� �غ�
	static Scanner sc = new Scanner(System.in);

	
	//�޴� �Լ� 
	static void menu() {
		System.out.println("���ϴ� ��ȣ �Է�");
		System.out.println("1. �̸����� ȸ�� ã��");
		System.out.println("2. ����");
		System.out.print("��ȣ�� �Է��ϼ��� : ");
	}
	
	//���� ��� �Լ�
	static void deta() {
		//������ ���� ���
		String[] ename = new String[]{"������","������","�ֵο�","��ҿ�","�ڱ�ȣ"};
		String[] phone = new String[]{"010-2421-2313","010-2301-2391","010-2314-1441","010-3333-3333","010-7777-7777"};
		String[] email = new String[]{"test1@naver.com","test2@naver.com","test3@naver.com","test5@naver.com","test5@naver.com"};
		
		//�̸����� ���� �ޱ�
		System.out.print("ã�� ����� �̸��� �Է� �ϼ��� : ");
		String name = sc.nextLine();
		
		int no = -1;
		//���� ���
		for(int i=0; i<5; i++) {
			if(name.equals(ename[i])) {
				no=i;
			}
		}
		
		if(no != -1) {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.print("ȸ���̸� : " + ename[no]+"\n�޴�����ȣ : "+ phone[no] + "\n�̸��� : " + email[no] + "\n");
		System.out.println("-----------------------------------------------------------------------------");
		}else {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("���������Դϴ�.");
			System.out.println("-----------------------------------------------------------------------------");
		}
	}
	
	
	public static void main(String[] args) {
		//�ڵ� ����
		int code = 0;
		
		// �ݺ��ؼ� ���� �ޱ�
		while(true) {
			
		menu(); //�޴� �Լ� ȣ��
		code = sc.nextInt(); // �ڵ� �ޱ�
		sc.nextLine(); //�ڵ� ������ ���Ͱ� ó��
		
		switch (code) { //���� �ڵ�� switch�� ������
		case 1: //�ڵ尡 1�̸� ������ȸ �Լ� ����
			deta();			
			break;
		case 2: //�ڵ尡 2�� ����
			System.out.println("�����մϴ�");
			return;
		}
		}

		

	}

}
