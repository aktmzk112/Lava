package day19;

import java.io.*;
import javax.swing.*;
/*
 *  DataOutputStream ���� ������ ģ���� ������ �о����
 */
public class Test08_01 {

	public Test08_01() {
		//Ÿ�� ��Ʈ�� �غ�
		FileInputStream fin = null;
		//���� ��Ʈ�� �غ�
		DataInputStream din = null;
		
		try {
			//��Ʈ�� �ʱ�ȭ �ϰ� 
			fin = new FileInputStream("src/day19/etc/DataStream_test.txt");
			din = new DataInputStream(fin);
			
			//���� ������ ������ �����Ҷ� �̸� , ���� , ����,����,��ȭ��ȣ, �̸���
			//�� ������ ������ �س��ұ� ������ ������ ���� �ݵ�� �� ������� �����;� �Ѵ�. 
			String name = din.readUTF();
			int age = din.readInt();
			float ki = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			//����ϰ� 
			String msg = "�̸� : " + name + "\n���� : " + age + "\n���� : " + ki + "\n���� : " + gen + "\n��ȭ��ȣ : " + tel + "\n���� : " + mail;
			
			JOptionPane.showMessageDialog(null, msg);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		
		}finally {
			try {
				din.close();
				fin.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}

	public static void main(String[] args) {
		new Test08_01();
		
	}

}
