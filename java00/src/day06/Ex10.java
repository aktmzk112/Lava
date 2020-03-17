package day06;

import java.awt.Label;
import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		String[][] team = {{"유태희","010-0000-3333","@mail1"},{"박광호","010-1111-3333","@mail2"},{"아몰랑","알아서뭐해","집에갈래"}};
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호을 입력하세요 : ");
		int no = sc.nextInt();
		
		int no1 = -1;
//		for(int i=0; i<team.length; i++) {
//			if(str.equals(team[i][0])) {
//				no = i;
//			}
//		}
		
//		System.out.println(no);
	
		switch (no) {
		case 1:
			for(int i=0; i<team.length; i++) {
				System.out.print("회원이름 : " + team[i][0] + "\n");
			}
			
			break;
		case 2:
			for(int i=0; i<team.length; i++) {
				System.out.print("휴대폰 : " + team[i][1] + "\n");
			}
			
			break;
		case 3:
			for(int i=0; i<team.length; i++) {
				System.out.print("이메일: " + team[i][2] + "\n");
			}
			
			break;

		default:
			System.out.println("없는번호임....");
			break;
		}

		
	}

}
