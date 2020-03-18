package day07;
/*
 * 문제 1]
	알파벳 10개를 저장할 배열을 만들고 
	대문자 10개를 랜덤하게 추출해서 배열에저장 하고
	저장된 배열을 얕은 복사로 복사하고 
	출력하고,
	원래 배열을 소문자로 변경한 후 
	두 배열을 출력하세요  
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
