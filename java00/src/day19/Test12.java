package day19;
/*
 	Test11.java ������ �о�� 
 */
import java.io.*;
import javax.swing.*;

public class Test12 {

	public Test12() {
		//�⺻ Ÿ�� ��Ʈ�� �غ�
		FileReader fr = null;
		//���� ��Ʈ�� �غ� 
		BufferedReader br = null;
		
		try {
			
			//��Ʈ�� �ʱ�ȭ 
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			//����� �о�� ���� �𸣹Ƿ� �ݺ����� 
			String msg = "";
			while(true) {
				String str = br.readLine();
				
				if(str == null) break;
				
				msg+=str+ "\n";
			}
			
			//���� ���
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

	public static void main(String[] args) {
		new Test12();
	}

}
