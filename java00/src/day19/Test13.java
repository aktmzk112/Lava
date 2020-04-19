package day19;
/*
 	day19/etc/pome.txt.
 	������ �о��
 	
 	FileInputStream ���� �а�
 	BufferedReder�� ����
 	
 	�̷��� ũ�Ⱑ �ٸ� ��Ʈ���� �������ִ� ���� ��Ʈ����
 	InputStreamReader / OutputStreamWriter
 	�� �ִ�. 
 	
 */
import java.io.*;
import javax.swing.*;
public class Test13 {

	public Test13() {
		//Ÿ�� ��Ʈ�� �غ�
		FileInputStream fin = null;
		//���� ��Ʈ�� �غ� -1		
		InputStreamReader ir =null;
		//���� ��Ʈ�� �غ� -2		
		BufferedReader br = null;
		
		try {
			//��Ʈ�� ����� 
			fin = new FileInputStream("src/day19/etc/poem.txt");
			ir = new  InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			StringBuffer buff = new StringBuffer();
			while(true) {
				String str = br.readLine();
				if (str == null) break;
				
				buff.append( str + "\n");
			}
			
			JOptionPane.showMessageDialog(null, buff.toString());
			
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				br.close();
				ir.close();
				fin.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

	public static void main(String[] args) {
		new Test13();
	}

}