package day06;

import java.awt.Label;
import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		String[][] team = {{"������","010-0000-3333","@mail1"},{"�ڱ�ȣ","010-1111-3333","@mail2"},{"�Ƹ���","�˾Ƽ�����","��������"}};
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ�� �Է��ϼ��� : ");
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
				System.out.print("ȸ���̸� : " + team[i][0] + "\n");
			}
			
			break;
		case 2:
			for(int i=0; i<team.length; i++) {
				System.out.print("�޴��� : " + team[i][1] + "\n");
			}
			
			break;
		case 3:
			for(int i=0; i<team.length; i++) {
				System.out.print("�̸���: " + team[i][2] + "\n");
			}
			
			break;

		default:
			System.out.println("���¹�ȣ��....");
			break;
		}

		
	}

}
