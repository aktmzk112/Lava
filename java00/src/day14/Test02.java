package day14;

import javax.swing.*;
public class Test02 {

	public static void main(String[] args) {
		//숫자 형태의 문자열을 입력받고
		String sno = JOptionPane.showInputDialog("숫자를 입력해주세요!");
		//정수 변수를 만들고 
		int no =0;
		try {
			System.out.println("*** 숫자 변환 전 ***");
			no = Integer.parseInt(sno);
			System.out.println("### 숫자 변환 후 ###");
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		
		} finally {
			// 이 블럭은 예외 발생 여부와 상관없이 반드시 실행되어야 할 명령이 가술되는 부분
			
			System.out.println("no : "+no);
		}
		
	}

}
