package exam;

import java.util.Arrays;

/*
	JOptionPane 으로 숫자를 입력 받아 
	배열을 만들고 
	배열이 기억할 수 있는 갯수만큼 숫자를 입력받아서 
	그 숫자들의 함을 구해주는 프로그램을 작성하세요 
	단,합을 구하는 기능은 함수를 만들어서 처리 
	 
 */
import javax.swing.*;

public class Ex01 {
	//배열을 전역변수로 지정
	int[] num;
	
	public Ex01() {
		
		String cntstr = JOptionPane.showInputDialog("배열을 수를 입력하세요");
		int cnt = Integer.parseInt(cntstr);
		num = new int[cnt];
		int sum;
		
		//숫자 입력
		for (int i = 0; i < num.length; i++) {
			String str = JOptionPane.showInputDialog("숫자를 입력하세요");
			num[i] = Integer.parseInt(str);
		}
		//숫차 출력
		JOptionPane.showMessageDialog(null, "입력한 숫자는 \n"+Arrays.toString(num));
		
		//합계 출력
		sum = getSum();
		String sumStr = "숫자의 총 합은 : " + getSum() + "입니다";
		JOptionPane.showMessageDialog(null, sumStr);
			
		

	}

	//num[]배열을 더해주는 함수
	public int getSum() {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
