package day07;

import javax.swing.*;

public class ArrayText01 {

	public static void main(String[] args) {
		//문자열 변수 비교
		
		String str1 = "hyunwoo";
		String str2 = "hyunwoo";
		
		String str3 = new String("hyunwoo");
		String str4 = new String("hyunwoo");

		JOptionPane.showMessageDialog(null, "str1 == str2 : "+ (str1 == str2)+ "\nstr1 == str3" + (str1==str3)+"\nstr3 == str4" + (str3==str4));
	}

}
