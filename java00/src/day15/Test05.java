package day15;
import java.util.regex.*;
import javax.swing.*;
public class Test05 {

	public Test05() {
		//��ȭ��ȣ�� �Է¹޾Ƽ� �Է��� ��ȣ�� �´� �������� �˻��غ�����! 
		String val = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է��ϼ���!");
		//1. Pattern Ŭ������ �̿��ؼ� �˻��ϰ� ���� ���Խ� ������ �����
		//		�׷��� Pattern Ŭ������ �������Լ��� ȣ���� �������� ���߾� ���� Ŭ�����̹Ƿ�
		//		�� Ŭ������ ��ü�� ������� �Լ��� �Ӽ��� static�̸鼭 ��ȯ���� Pattern�� �Լ��� ����ϸ� �ȴ�.
		//		api ������ �������ѱ� �׷� �Լ��� compile(String regex) �̹Ƿ� �ش� �Լ��� ������� 
		Pattern pattern = Pattern.compile("^0[0-9]{2}-[0-9]{3,4}-[0-9]{4}$");
		/*
		 	2. 	�� Ŭ�������� ���Խ� ������ �˻��� �޶�� ��û 
		 		������ �˻��ϴ� �Լ��� matcher()
		 		�� �Լ��� �˻����� Matcher ��� Ŭ���� Ÿ������ ��ȯ���ش�
		 		���� ����� ���� ��� ������ Matcher Ŭ���� ���� ó���� �ؾ� �� ���̴�.
		 		
		 		����� �˾Ƴ��� ��� 
		 			
		 			matches()
		 */
		Matcher match = pattern.matcher(val);
		
		// ���� �˻� ����� match�� ������ �Ǿ������� ������ ����ϸ� �ȴ�.
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� ��ȭ ��ȣ �Դϴ�");
			
		}else {
			JOptionPane.showMessageDialog(null, "Wrong Phone Number!!!");
		}
	}
	
	public static void main(String[] args) {
		new Test05();
		
	}

}
