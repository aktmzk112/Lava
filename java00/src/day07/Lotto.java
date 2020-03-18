package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lotto {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog(
				"1. 번호생성  "
				+ "2. 종료"
				+ "");
		
	 if(str.equals("1")) {
		int[] num1 = new int[6];
		int bo = 0;
		int tmp = 0;
		
		for(int i=0; i<num1.length; i++) {
			num1[i] = (int)(Math.random() * (45-1+1))+1;
			bo = (int)(Math.random() * (45-1+1))+1;
		}
		
		for(int i=0; i<num1.length; i++) {	
			for(int j=i; j<num1.length; j++) {

					if(num1[i] > num1[j]) {
						tmp = num1[i];
						num1[i] = num1[j];
						num1[j] = tmp;
				}
				
			}
			
		}
		
			String msg = "로또번호 : " + Arrays.toString(num1) + "\n보서스 번호 : " + "[ "+ bo + " ]";
			JOptionPane.showMessageDialog(null, msg);
//			System.out.println("보너스 번호 : "+bo);
	 }
	 else {
		 JOptionPane.showMessageDialog(null, "종료합니다 !!!");
		 
	 }
	 
	 }

}
