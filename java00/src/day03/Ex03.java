package day03;

import java.util.*;
/*
 	문제 2]
 		전기 요금을 계산하는 프로그램을 작성하세요
 		
 		
 				코드	기본요금	사용요금
 		가정용	(1)		3800		245
 		산업용	(2)		2400		157
 		교육용	(3)		2900		169
 		상업용	(4)		3200		174
 		
 		전기요금 = 기본요금 + 사용량 * 사용요금 
 		
 		사용자코드와 사용량을 입력받아서 전기요금을 계산해주는 프로그램 작성 
 		
 */
public class Ex03 {

	public void showMenu() {
		System.out.println("계산할 용도를 선택하세요");
		System.out.println("1.가정용 요금 계산기");
		System.out.println("2.산업용 요금 계산기");
		System.out.println("3.교육용 요금 계산기");
		System.out.println("4.상업용 요금 계산기");
		System.out.println("5.종료 합니다");
		System.out.print("종류를 선택하세요 : ");
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
			System.out.println("잘가!!~");
			break ot;
		default : 
			System.out.println("번호를 잘못주셨습니다 종료합니다.");
			return;
		}
		}
	}
	
		
	
	public void home(Scanner sc) {
		System.out.println("가용용을 선택 하셨습니다\n");
		System.out.print("사용량을 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 3800 + num * 245;
		
		System.out.println("사용 요금은 : "+sum+"원 입니다.");
		
	}
	
	public void indu(Scanner sc) {
		System.out.println("산업용을 선택 하셨습니다\n");
		System.out.print("사용량을 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 2400 + num * 157;
		
		System.out.println("사용 요금은 : "+sum+"원 입니다.");
	}
	
	public void educ(Scanner sc) {
		System.out.println("교육용을 선택 하셨습니다\n");
		System.out.print("사용량을 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 2900 + num * 169;
		
		System.out.println("사용 요금은 : "+sum+"원 입니다.");
	}
	
	public void comm(Scanner sc) {
		System.out.println("상업용을 선택 하셨습니다\n");
		System.out.print("사용량을 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 3200 + num * 174;
		
		System.out.println("사용 요금은 : "+sum+"원 입니다.");
	}
	
	public static void main(String[] args) {
		   	new Ex03();
			  }

	}

