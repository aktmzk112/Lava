package day19;

/*
 	���� ������ ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��غ���.
 	 
 */
import java.io.*;
import javax.swing.*;
public class Test10 {

	public Test10() {
		//�⺻ ��Ʈ�� �غ�
		FileWriter fw = null;
		
		try {
			//��Ʈ�� �ʱ�ȭ 
			fw = new FileWriter("src/day19/etc/FileWriter_test.txt");
			
			/*
			//1. �ѱ��ڸ�(2byte) ����
			char ch = '��';
			fw.write(ch);
			*/
			
			/*
			//2 �������� ����
			String str = "���� �׻� �� �˴ϴ�.";
			char[] ch = str.toCharArray();
			fw.write(ch);
			*/
			
			//3. ���ڿ��� �����غ���
			String str = "DOGBOT�� �Ӹ��� ���� ��� ��ũ���� ž���ߴ�. �� ȭ�鿣 ������ ����ǥ�� ����ǥ�� �ߴµ� �κ��� ����� �˷��ִ� ���̴�."
					+ " ���� �ÿ��� ��� �簢���� ȭ�鿡 �߸�, ���� ���� �� �������̴�.";
			fw.write(str);
			/*
			 	 char���� ��Ʈ���� �ؽ�Ʈ �����͸� ó���ϵ��� �Ǿ��ֱ� ������ 
			 	 �⺻ �Լ��� + ���� ó�� ����� �߰��Ǿ���.
			 	 
			 */
			JOptionPane.showMessageDialog(null, "���� �Ϸ�!");
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}

	public static void main(String[] args) {
		new Test10();
	}

}
