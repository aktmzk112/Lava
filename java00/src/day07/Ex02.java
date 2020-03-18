package day07;

import java.util.Arrays;

import javax.swing.*;
/*
 * 문제 2]
	정수 10개를 저장 할 배열을 만들고 
	랜덤하게 정수를 1~50 까지 수중 발생시켜서
	배열에 담고 
	배열의 5번째까지 데이터를 깊은 복사로 복사 해..
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
