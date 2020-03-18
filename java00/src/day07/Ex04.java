package day07;
import java.util.Arrays;

/*
 * 문제 4] 
	전화번호를 입력하면 
	'-'를 기준으로 데이터를 분리하여 
	저장할 배열을 만들고 분리된 데이터를 순서에 맞게 입력하고 출력 
	indexOf()
	substring() 
	사용
	
 */
import javax.swing.*;
public class Ex04 {

	public static void main(String[] args) {
		String tel = JOptionPane.showInputDialog("전화번호를 입력 하세요");
		String[] sNum = new String[3];
		
		int idx = tel.indexOf('-');
		sNum[0] = tel.substring(0,idx);
		String tmp = tel.substring(idx+1);
		idx = tmp.indexOf('-');
		sNum[1] = tmp.substring(0,idx);
		sNum[2] = tmp.substring(idx+1);
		
		//010-0000-0000
//		int li = tel.indexOf('-'); //3
//		
//		String tel2 = tel.substring(0,li); //010
//		
//		String tel2_next =tel.substring(li+1); //0000-0000
//		
//		int li2 = tel2_next.indexOf('-'); //4
//		
//		String tel3 = tel2_next.substring(0,li2); //0000 2번째 
//		
//		String tel4 =tel2_next.substring(li2+1); //0000 마지막
//		
//		String[] total_tel = new String[] {tel2,tel3,tel4}; //변수 담기
		
		String msg = "전화번호 : " + sNum[0] +"  "+ sNum[1] +"  "+ sNum[2];
		
		JOptionPane.showMessageDialog(null, msg);
		
		
		
//		String a =tel.substring(0,3);
//		System.out.println(tel4);
		
//		Strint[] tel_num 
	}

}
