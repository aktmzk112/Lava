package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {

	
	//getNum()�� ����� ������ �غ���.
	//�Է¹��� ���ڿ� 10�� ���� ������ ��ȯ���ֵ��� �������̵� �غ���
	/*
	 	�������̵� ��Ģ ] 
	 		0. ����� �޾ƾ��Ѵ�. 
	 		1. �Լ� ������ �����Ѵ�.
	 		2. ���������ڴ� ���ų� �о���Ѵ�.
	 		3. ����ó���� ���ų� ���ƾ� �Ѵ� 
	 */
	
	
	public int getNum() throws NumberFormatException, Exception{
		int num;
		String sno = JOptionPane.showInputDialog("���ڸ� �Է����ּ���");
		num = Integer.parseInt(sno);
		
		
		//������ ��� ������ ���ܸ� �߻�
		
		if(num < 0) throw new NumberFormatException();
		
		return num * 10;
	}
	public static void main(String[] args) {
		new Test04();
	}

}
