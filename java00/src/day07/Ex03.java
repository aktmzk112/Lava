package day07;
/*
 * ���� 3] 
	ȸ�� �̸�, ��ȭ��ȣ, �̸��� ������ �迭�� ����� 
	
	
	�̸��� �Է��ϸ� 
	
	�׻���� �����͸� ��� ������ �迭�� ���� 
	�����͸� �ְ� ��� �Ͻÿ�
	
 */

import java.util.Arrays;

import javax.swing.*;
public class Ex03 {

	public static void main(String[] args) {
		String[] ename = new String[]{"������","������","�ֵο�","��ҿ�","�ڱ�ȣ"};
		String[] phone = new String[]{"010-2421-2313","010-2301-2391","010-2314-1441","010-3333-3333","010-7777-7777"};
		String[] email = new String[]{"test1@naver.com","test2@naver.com","test3@naver.com","test5@naver.com","test5@naver.com"};
		
		
		
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ��� : ");
		int idx=-1;
		for(int i=0; i<ename.length; i++) {
			if(ename[i].equals(name)) {
				idx = i;
			}
		}
		String[] member = new String[] {ename[idx],phone[idx],email[idx]};
		
		String mag = "�̸� :  "+member[0]+ " \n" + "��ȭ��ȣ  : " + member[1] + "\n" + "����  : " + member[2]; 
		JOptionPane.showMessageDialog(null, mag);
		

	}

}
