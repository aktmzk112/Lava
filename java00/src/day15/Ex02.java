package day15;

import java.util.regex.*;
import javax.swing.*;

public class Ex02 {

	public Ex02() {
		String pw = JOptionPane.showInputDialog("비밀번호를 입력하세요");
		//비밀번호는 영문 소문자, 대문자, 특수문자로 이루어진 11자리 이상으로 
		
		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W)[A-Za-z\\d\\W]{8,}$");
	
		Matcher matcher = pattern.matcher(pw);
		
		if(matcher.matches()) {
			System.out.println("정상적인 패스워드 입니다.");
		}else {
			System.out.println("영문 소문자 / 대문자 / 특수문자 조합으로 만드세요");
		}
		
		
	
	}

	public static void main(String[] args) {
		new Ex02();
	
	}

}
