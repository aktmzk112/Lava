package day15;

import java.util.regex.*;
import javax.swing.*;

public class Ex02 {

	public Ex02() {
		String pw = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���");
		//��й�ȣ�� ���� �ҹ���, �빮��, Ư�����ڷ� �̷���� 11�ڸ� �̻����� 
		
		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W)[A-Za-z\\d\\W]{8,}$");
	
		Matcher matcher = pattern.matcher(pw);
		
		if(matcher.matches()) {
			System.out.println("�������� �н����� �Դϴ�.");
		}else {
			System.out.println("���� �ҹ��� / �빮�� / Ư������ �������� ���弼��");
		}
		
		
	
	}

	public static void main(String[] args) {
		new Ex02();
	
	}

}
