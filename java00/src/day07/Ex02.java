package day07;

import java.util.Arrays;

import javax.swing.*;
/*
 * ���� 2]
	���� 10���� ���� �� �迭�� ����� 
	�����ϰ� ������ 1~50 ���� ���� �߻����Ѽ�
	�迭�� ��� 
	�迭�� 5��°���� �����͸� ���� ����� ���� ��..
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] num1 = new int[10];
		int[] num2 = new int[5];

		for(int i=0; i<num1.length; i++) {
			num1[i] = (int)(Math.random() * (50-1+1)+1);
		
		}
		
		
		System.arraycopy(num1, 0, num2, 0, 5);
		JOptionPane.showMessageDialog(null, Arrays.toString(num1));
		JOptionPane.showMessageDialog(null, Arrays.toString(num2));
		
		
		
	}

}
