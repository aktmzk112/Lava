package day15;
/*
 * ����1]
 * 	
 * 		�̸����� �Է¹޾Ƽ�
 * 		�Է¹��� ���ڿ��� �̸��� ���Ŀ� �´� �� �˻��ϼ��� 
 * 		�̸��� ������
 * 			���ĺ��� ���ڷ� 8�� �̻����� �ϰ� @ �������ּ�.
 * 		���� ] 
 * 			�ѱ� ó�� : [��-�R] - �ѱ��� ���̵� ���������� 
 * 
 * 	
 */

import java.util.regex.*;
import javax.swing.*;
public class Ex01 {

	public Ex01() {
		
		String mail = JOptionPane.showInputDialog("������ �Է��ϼ���");
		Pattern pattern = Pattern.compile("^(\\w{8,})(@)(\\w*)(\\.[a-zA-Z]{2,})(\\.?[a-zA-Z]*)");

		Matcher match = pattern.matcher(mail);
		
		if(match.matches()) {
			System.out.println("�������� �����Դϴ�");
			
		}else {
			System.out.println("���������� �����Դϴ�.");
		}
		
		
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
