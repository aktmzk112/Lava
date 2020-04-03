package day19;

/*
 	 ���� 2] FileInputStream
 	 	day19.etc ��Ű���� �ִ� sample.txt ���� �о�� 
 */
import java.io.*;
import java.util.Arrays;
public class Test02 {

	public Test02() {
		// ���� ���Ͽ� ������ Ÿ�Ͻ�Ʈ��(�⺻��Ʈ��)�� �غ� 
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day19/etc/sample.txt");
			/*
			// 1. �� ���ڸ� �о�� 
			int ch = fin.read();
			System.out.println("���� ���� : " + (char)ch);
			*/
			
			/*
			//2. �������ڸ� �о� ���� 
			//�� ��ũ���� ����Ʈ����� ��Ʈ���̰� ������ ó���� ����Ʈ�� ó���Ѵ�.
			//���� �� ���ڴ� ����Ʈ������ �Ѱ��̰� �������ڴ� ����Ʈ������ �������� �� ���̴�.
			//�̰��� �ϳ��� ������ ������ �Ϸ��� ����Ʈ �迭�� �ʿ��ϴ�.
			byte[] buff = new byte[1024]; //1KByte
			
			int len = fin.read(buff);
			
			//���ڿ��� ��������
			String str = new String(buff,0,len);
			
			//�������
			System.out.println("���� ���� : " + str);
			System.out.println("���� ���� �� : " + len);
			*/
			
			//3.���� ��ü�� �о��
			// �̷��� �ϸ� 1KBye�� ���� ���̰� ���Ͽ��� �� �̻� �����Ͱ� �ִ�.
			
			byte[] buff = new byte[1024];
			// ���� �ݺ��ؼ� ������ ������� ó���غ��� 
			while(true) {
				//���� �۾��� ���� ������ �𸣹Ƿ� ����ؼ� �ݺ���Ų��.
//				Arrays.fill(buff,(byte)0);
				int len = fin.read(buff);
				
				if(len == -1) {
					// ���̻� ���� �����Ͱ� ������ �ݺ��� �����Ѵ�.
					// �̶� read()�� ���� �����Ͱ� ������ -1�� ȯȯ���ش�
					break;
				}
				
				String str = new String(buff,0,len);
//				System.out.println("######���� ���ڿ�#####");
				System.out.print(str);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		new Test02();
	}

}
