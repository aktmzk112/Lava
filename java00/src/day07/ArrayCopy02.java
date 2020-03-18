package day07;

import java.util.Arrays;

/*
 * 깊은 복사
 */

import javax.swing.*;
public class ArrayCopy02 {

	public ArrayCopy02() {
			//	exec1();
			exec2();
	}
	

	
	public void exec1() {
	int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		
		int[] num2 = new int[20];
		
		//num1의 여섯번째에서 10번째 까지 데이터를 복사하여 num2 에 저장하라 
		
		System.arraycopy(num1, 5, num2, 10, 5);
		
		//복사가 된 이후에 num1[7] 을 77로 변경해주자.
		num1[7] = 77;
		
		//두 배열의 내용을 문자열로 만들어서 변수에 담는
		String msg =  "num1\t: "+Arrays.toString(num1) + "\nnum2\t: " + Arrays.toString(num2);
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void exec2() {
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		
		int[] num2 = new int[20];
		
		//num1[5] ~ num[9]를 복사하여 num2[]의 11~15 번째에 넣으세요
		
		for(int i = 0; i<5; i++) {
			num2[10+i] = num1[5+i];
		}
		
		//복사가 된 이후에 num1[7] 을 77로 변경해주자.
		num1[7] = 77;
		
		//두 배열의 내용을 문자열로 만들어서 변수에 담는
		String msg =  "num1\t: "+Arrays.toString(num1) + "\nnum2\t: " + Arrays.toString(num2);
		
		JOptionPane.showMessageDialog(null, msg);
		
		
	}
	
	public static void main(String[] args) {
		new ArrayCopy();
	}

}
