package day19;

/*
 	���� 1]
 		Ű���带 �̿��ؼ� ���ڸ� �Է� �޾ƺ��� 
 */
import java.io.*;
import java.util.*;
public class Test01 {
/*
 	 ����] 
 	 	Ű���� ���� �ܺ� ��ġ�̴�. 
 	 	���־��̴� �ܺ� ��ġ�̱� ������ �̹� 
 	 	��ũ������ �غ��� ������ ���� �Ѵ�.
 	 	
 	 		�غ�� ���� : System.in
 	 		
 */
	public Test01() {
		System.out.print("�� ���ڸ� �Է��� �ּ���! : ");
		//	���� ����
		int ch = 0;
		
		try {
			//1.
			
//			ch=System.in.read();
//			System.out.println("�Է��� ���� : " + (char) ch);
			
			//2 ***
			
			/*
			byte[] buff = new byte[256];
			//	256�� ���ڿ� ���� �ѹ��� ���� �������� ���� ��������.
			int len = System.in.read(buff); //System.in.read(buff) �� ��ȯ���� ���� ������ ���� int�� ��ȯ �Ѵ�
			//���� ����� ���ڿ��� �������
			String str = new String(buff,0,len);
			System.out.println("���� ���� : " + str);
			*/
			
			//3 �ַ� ��Ʈ��ũ ó���� �Ҷ� ���� ����ϴ� ��� 
			byte[] buff = new byte[256];
			Arrays.fill(buff,(byte) 'A');
			
			int len = System.in.read(buff,10,10);
			//�غ�� �迭�� buff�� 11�� ����� ���� ������ ����ϼ���...
			//�ִ� 100������ ��������...(==> 100���ڸ� �Է¹��� �� �ִ�.)
			String str = new String(buff,0,len+10);
			// \n�� �������� 
			str = str.replaceAll("\r\n", "");
			System.out.println("�Է��� ���ڿ� : " + str);
			
				
//			Arrays.fill(buff, (byte) 'A');
//			
//			System.out.println(Arrays.toString(buff));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}	
