package day16;

//MessageFormat 
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test05 {

	public Test05() {
		/*
		 	"name : ȫ�浿, tel : 010-1111-1111, Age : 24"
		 	"name : ��û��, tel : 010-2222-2222, Age : 18"
		 	
		 	�� ��� �� ���ڿ��� ���� ������ �κ��� ������ �Ͼ��.
		 	�̷� ��� ���ڿ��� ����� ���
		 */
		
		MessageFormat form = new MessageFormat("Name : {0}, tel : {1}. Age : {2}");
		
		//������ ������  �״�� ���� 
		//����Ǵ� �κ��� {0},{1},{2} �� ������� ����Ѵ�.
		//���⼭ {} ���� ���δ� �ԷµǴ� �������� ������ �ǹ��Ѵ�.
		Object[][] date = {{"ȫ�浿","010-1111-1111",24},{"��û��","010-2222-2222",18}};
		
		//{0},{1},{2} �� �� �����͸� �迭�� �غ� 
		String result = form.format(date[0]);
		String result2 = form.format(date[1]);
		JOptionPane.showMessageDialog(null, result+"\n"+result2);
		
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}