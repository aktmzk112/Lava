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
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phoneNumber);
		System.out.println("생년월일 : " + btire);
		
		System.out.println("");
	}
	
	
}


public class PhoneBookVer02 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.print("번호를 입력하세요  \n");
		System.out.print("1번. 데이터 입력 \n");
		System.out.print("2번. 종료  \n");
		System.out.print("원하는 번호 입력 : ");
		
	}
	
	public static void realData() {
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("번호 입력 : ");
		String num = sc.nextLine();
		
		System.out.print("생년월일 입력 : \n");
		String bir = sc.nextLine();
		
		PhoneInfo2 info = new PhoneInfo2(name, num,bir);
		
		System.out.println("입력한 정보 출력");
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
			System.out.println("잘가용");
			return;
		}

		}
	}
	
}
