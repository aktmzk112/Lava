package day15;
/*
 * 문제1]
 * 	
 * 		이메일을 입력받아서
 * 		입력받은 문자열이 이메일 형식에 맞는 지 검사하세요 
 * 		이메일 형식은
 * 			알파벳과 숫자로 8자 이상으로 하고 @ 도메인주소.
 * 		참고 ] 
 * 			한글 처리 : [가-힣] - 한글은 아이디에 쓰지마세요 
 * 
 * 	
 */

import java.util.regex.*;
import javax.swing.*;
public class Ex01 {

	public Ex01() {
		
		String mail = JOptionPane.showInputDialog("메일을 입력하세요");
		Pattern pattern = Pattern.compile("^(\\w{8,})(@)(\\w*)(\\.[a-zA-Z]{2,})(\\.?[a-zA-Z]*)");

		Matcher match = pattern.matcher(mail);
		
		if(match.matches()) {
			System.out.println("정상적인 메일입니다");
			
		}else {
			System.out.println("비정상적인 메일입니다.");
		}
		
		
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
