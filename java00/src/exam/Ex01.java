package exam;

import java.util.Arrays;

/*
	JOptionPane ���� ���ڸ� �Է� �޾� 
	�迭�� ����� 
	�迭�� ����� �� �ִ� ������ŭ ���ڸ� �Է¹޾Ƽ� 
	�� ���ڵ��� ���� �����ִ� ���α׷��� �ۼ��ϼ��� 
	��,���� ���ϴ� ����� �Լ��� ���� ó�� 
	 
 */
import javax.swing.*;

public class Ex01 {
	//�迭�� ���������� ����
	int[] num;
	
	public Ex01() {
		
		String cntstr = JOptionPane.showInputDialog("�迭�� ���� �Է��ϼ���");
		int cnt = Integer.parseInt(cntstr);
		num = new int[cnt];
		int sum;
		
		//���� �Է�
		for (int i = 0; i < num.length; i++) {
			String str = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���");
			num[i] = Integer.parseInt(str);
		}
		//���� ���
		JOptionPane.showMessageDialog(null, "�Է��� ���ڴ� \n"+Arrays.toString(num));
		
		//�հ� ���
		sum = getSum();
		String sumStr = "������ �� ���� : " + getSum() + "�Դϴ�";
		JOptionPane.showMessageDialog(null, sumStr);
			
		

	}

	//num[]�迭�� �����ִ� �Լ�
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
