package day07;
/*
 * ���� 1]
	���ĺ� 10���� ������ �迭�� ����� 
	�빮�� 10���� �����ϰ� �����ؼ� �迭������ �ϰ�
	����� �迭�� ���� ����� �����ϰ� 
	����ϰ�,
	���� �迭�� �ҹ��ڷ� ������ �� 
	�� �迭�� ����ϼ���  
 */

import java.util.Arrays;

import javax.swing.*;
public class Ex01 {

	public static void main(String[] args) {
		char[] ch = new char[10];
		char[] ch2 = new char[10];
		
		for(int i=0; i<ch.length; i++) {
			ch[i] = (char) (Math.random()*('Z'-'A'+1)+'A');	
		}
		
		ch2 = ch;
		
		JOptionPane.showMessageDialog(null, Arrays.toString(ch2));
		
		for(int i=0; i<ch2.length; i++) {
			ch2[i] += 32;
		}
		JOptionPane.showMessageDialog(null, Arrays.toString(ch2));
		
		

	}

}
