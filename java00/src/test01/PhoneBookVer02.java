package test01;

import java.util.*;

class PhoneInfo2
{
	String name;
	String phoneNumber;
	String btire;
	
	public PhoneInfo2(String name , String num , String btire){
		
		this.name = name;
		phoneNumber = num;
		this.btire = btire;
		
	}
	
	public PhoneInfo2(String name, String num) {
			this.name = name;
			phoneNumber = num;
			this.btire = null;
			
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phoneNumber);
		System.out.println("������� : " + btire);
		
		System.out.println("");
	}
	
	
}


public class PhoneBookVer02 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.print("��ȣ�� �Է��ϼ���  \n");
		System.out.print("1��. ������ �Է� \n");
		System.out.print("2��. ����  \n");
		System.out.print("���ϴ� ��ȣ �Է� : ");
		
	}
	
	public static void realData() {
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		
		System.out.print("��ȣ �Է� : ");
		String num = sc.nextLine();
		
		System.out.print("������� �Է� : \n");
		String bir = sc.nextLine();
		
		PhoneInfo2 info = new PhoneInfo2(name, num,bir);
		
		System.out.println("�Է��� ���� ���");
		info.showInfo();
		
	}

	
	public static void main(String[] args) {
		int code;
		
		while(true) {
		
			menu();
			code = sc.nextInt();
			sc.nextLine();
			
		switch (code) {
		case 1:
			realData();
			break;

		case 2:
			System.out.println("�߰���");
			return;
		}

		}
	}
	
}
