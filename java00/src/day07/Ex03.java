package day07;
/*
 * 문제 3] 
	회원 이름, 전화번호, 이메일 저장할 배열을 만들고 
	
	
	이름을 입력하면 
	
	그사람의 데이터를 모두 저장할 배열을 만들어서 
	데이터를 넣고 출력 하시요
	
 */

import java.util.Arrays;

import javax.swing.*;
public class Ex03 {

	public static void main(String[] args) {
		String[] ename = new String[]{"유태희","김종현","최두용","김소영","박광호"};
		String[] phone = new String[]{"010-2421-2313","010-2301-2391","010-2314-1441","010-3333-3333","010-7777-7777"};
		String[] email = new String[]{"test1@naver.com","test2@naver.com","test3@naver.com","test5@naver.com","test5@naver.com"};
		
		
		
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요 : ");
		int idx=-1;
		for(int i=0; i<ename.length; i++) {
			if(ename[i].equals(name)) {
				idx = i;
			}
		}
		String[] member = new String[] {ename[idx],phone[idx],email[idx]};
		
		String mag = "이름 :  "+member[0]+ " \n" + "전화번호  : " + member[1] + "\n" + "메일  : " + member[2]; 
		JOptionPane.showMessageDialog(null, mag);
		

	}

}
