package day08.presolv;
/*
 * ���� 4] 
	��ȭ��ȣ�� �Է��ϸ� 
	'-'�� �������� �����͸� �и��Ͽ� 
	������ �迭�� ����� �и��� �����͸� ������ �°� �Է��ϰ� ��� 
	indexOf()
	substring() 
	���
	
 */

import java.util.Arrays;

import javax.swing.*;
public class Solv04 {

	public static void main(String[] args) {
		/*
		 *  ��ȭ���� xxx-xxxx-xxxx�� �������� �Է¹������̰� �� ��ȣ�� ���ڿ��� ������ �ϰ�
		 	���ڿ� ���� - �� ������ŭ �ݺ��� �Ͽ� ��ȣ�� ������ 
		 	�迭�� �����ϸ� �ȴ�.
		 */
		
		//1. �Է¹޾Ƽ� ������ ����
			String phone = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է� �ϼ���!!");
		//2. '-' �� ������ ī��Ʈ �ϰ� 
			int cnt = 0;
			for(int i=0; i<phone.length(); i++) {
				char ch = phone.charAt(i);
				if( ch<'0' || ch >'9' ) {
					++cnt;
				}
			}
			
			
		//3. �и��� ���ڿ��� �Է��� �迭�� �����
		// ==> ��ȭ��ȣ�� �и��� �ϰ� �Ǹ� '-'�� �������� 1���� �� ���� ���ڿ��� �и��� �ȴ�.
		String[] arr = new String[cnt +1];
		
		//4. �迭�� ���ڿ��� �߶� �Է�
		//�߷��� ���ڿ��� ������ ������ �����
		//ó������ ��ü ���ڿ� ��� ������ �Ǿ�� �Ѵ�
		String tmp = phone;
		int idx =0;
		for(int i=0; i<cnt; i++) {
			//'-' �� ���ؽ��� �˾Ƴ���.
			for(int j=0; j<tmp.length(); j++) {
				if(tmp.charAt(j) < '0' || tmp.charAt(j) > '9') {
					idx = j;
					break;
				}
			}
			
			idx = tmp.indexOf('-');
			
			//���� '-'�� �ε����� �˾Ƴ����� 
			//'-' �������� ���ڿ��� �����ؾ��Ѵ�.
			arr[i] = tmp.substring(0,idx);
			
			//�޹�ȣ�� �ٽ� �߶� tmp �� ����
			//�ٽ� �� �� ��ɵ� �ݺ�
			tmp = tmp.substring(idx+1);
			
			
			
		}
		arr[cnt] = tmp;
		//5. ���!
		JOptionPane.showMessageDialog(null, "�Է��� ��ȣ :" + phone + "\n�Ҹ��ѹ迭 : "+Arrays.toString(arr));
		
	
		
	}

}
