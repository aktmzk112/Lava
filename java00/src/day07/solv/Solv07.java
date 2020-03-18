package day07.solv;

import java.util.Arrays;

import javax.swing.*;

public class Solv07 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("문자열 아무거나 넣어주세여 : ");
		
		
		char[] ch = new char[str.length()]; //문자열의 길이만큼 문자배열을 만들어준다 
		char[] ch1 = new char[str.length()];
		// 문자열의 길이만큼 반복해서
		// 문자를 꺼내고
		// 꺼낸 문자를 위의 문자배열의 차곡차곡 넣어준다.
		for(int i=0; i<str.length(); i++) {
			
			ch[i] = str.charAt(i);
			ch1[i] = str.charAt(str.length()-1-i);
		}
			
		String msg = "문자열: " + str + "\nch" + Arrays.toString(ch) + "\nch1" + Arrays.toString(ch1);
		JOptionPane.showMessageDialog(null, msg);
		
		
	}

}
