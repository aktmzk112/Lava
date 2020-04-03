package day19;

/*
 	������ ���Ͽ� �����ϴ� ���α׷��� �ۼ� �ϼ���.
 	
 	�� , ���� ��Ʈ�� Buffered ��Ʈ���� ����ϼ���
 	 
 */
import java.io.*;
import javax.swing.*;
public class Test07 {

	public Test07() {
		//1. �������� ��Ʈ�� �غ�
		FileOutputStream fout = null;
		//2. �ʿ信 ���� ������Ʈ�� ���� �� �� �ִ�.
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("src/day19/etc/buff_test.txt");
			bout = new BufferedOutputStream(fout);
			
			//������ ������ �غ�
			String str = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���");
			byte[] buff = str.getBytes();
			
			
			//���� ���ۿ� ���� ���ϱ��� �����Ͱ� �Ѿ ���̴�
			bout.write(buff);
			//���� ���۰� ä������ �ʾ����Ƿ� 
			//������ ������ FileOutputStream ���� ���� ���� �ʾҴ�.
			//���� ���� ������ �ȉ��
			
			//�Ϸ���� �ʿ��� ����� 
			//�۹��� ������ ������ ��� �����ִ� ��� �ε� 
			bout.flush();
			// ���� ���۵� ��ũ���� ����� ��쿡�� ���������� flush()�Լ��� ���� �ؾ� �Ѵ�.
			
			JOptionPane.showMessageDialog(null, "***���� �Ϸ�***");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				bout.close();
				fout.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	
	}

	public static void main(String[] args) {
		new Test07();
	}

}
