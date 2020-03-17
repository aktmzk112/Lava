package day06;

import java.util.*;
/*
 * 문제 8]
	회원 이름, 전화번호, 이메일 저장할 배열을 만들고 
	데이터를 입력하면 
	
	회원의 이름을 입력하면 
	이름, 전화번호, 이메일을 출력해주는 프로그램을 작성하세요
 */


public class Ex09 {
	
	//입력받을 준비
	static Scanner sc = new Scanner(System.in);

	
	//메뉴 함수 
	static void menu() {
		System.out.println("원하는 번호 입력");
		System.out.println("1. 이름으로 회원 찾기");
		System.out.println("2. 종료");
		System.out.print("번호를 입력하세요 : ");
	}
	
	//정보 출력 함수
	static void deta() {
		//변수에 정보 담기
		String[] ename = new String[]{"유태희","김종현","최두용","김소영","박광호"};
		String[] phone = new String[]{"010-2421-2313","010-2301-2391","010-2314-1441","010-3333-3333","010-7777-7777"};
		String[] email = new String[]{"test1@naver.com","test2@naver.com","test3@naver.com","test5@naver.com","test5@naver.com"};
		
		String[][] team  = new String[3][5];
		team[0] = ename;
		team[1] = phone;
		team[2] = email;
		
		//이름으로 정보 받기
		System.out.print("찾을 사람의 이름을 입력 하세요 : ");
		String name = sc.nextLine();
		
		int no = -1;
		//정보 출력
		for(int i=0; i<team[0].length; i++) {
			if(name.equals(team[0][i])) {
				no=i;
			}
		}
		
		if(no != -1) {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.print("회원이름 : " + team[0][no]+"\n휴대폰번호 : "+ team[1][no] + "\n이메일 : " + team[2][no] + "\n");
		System.out.println("-----------------------------------------------------------------------------");
		}else {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("없는정보입니다.");
			System.out.println("-----------------------------------------------------------------------------");
		}
	}
	
	
	public static void main(String[] args) {
		//코드 변수
		int code = 0;
		
		// 반복해서 정보 받기
		while(true) {
			
		menu(); //메뉴 함수 호출
		code = sc.nextInt(); // 코드 받기
		sc.nextLine(); //코드 받은후 엔터값 처리
		
		switch (code) { //받은 코드로 switch문 돌리기
		case 1: //코드가 1이면 정보조회 함수 실행
			deta();			
			break;
		case 2: //코드가 2면 종료
			System.out.println("종료합니다");
			return;
		}
		}

		

	}

}