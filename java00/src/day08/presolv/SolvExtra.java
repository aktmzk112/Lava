package day08.presolv;

import javax.swing.JOptionPane;

public class SolvExtra {
/*
 * extra ]
	���� ���ڿ��� �Է¹޾Ƽ�
	�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
	�󵵸� * �� ǥ���ϼ���.
	
	  		
 */
	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("������ �Է��ϼ���");
		
		// ����
		//0. ���ڿ��� ���Ե� ���ڷ� �̷���� ���ڿ��� �����.
		String tmp = "";
		
		loop:
		for(int i=0; i<str.length(); i++) {
			char imsi = str.charAt(i);
			//tmp�� ���� ���ڰ� �ִ��� �˻��ϰ� ������ �����ش�.
			for(int j =0; j<tmp.length(); j++) {
				if(imsi == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp+= imsi;
		}
		//1. ���ԵǾ� �ִ� ������ �������� ���Ѵ�.
		int cnt = tmp.length();
//		loop:
//		for(int i=0; i < str.length(); i++ ) {
//			for(int j=0; j<i; j++) {
//				if(str.charAt(j) == str.charAt(i)) {
//					continue loop;
//				}
//				
//			}
//			++cnt;
//			
//		}
		// 2. ���Ե� �����ǹ迭�� ���� �� �ְ� �Ǿ����Ƿ� ���ڹ迭�� ī��Ʈ �迭�� �����
		char[] ch = tmp.toCharArray(); // ���Ե� ���ڸ� ������ �迭
		//���ڹ迭�� ������ �ƽ�Ű�ڵ尡 ���� ������ ���� 
		
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length-1; j++) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
			
		}
		int[] count = new int[cnt]; //���Ե� ������ �����󵵸� �⿪�� �迭
		//2. ���ڸ��� �����ϴ� ī��Ʈ ���Ѵ�
		for(int i=0; i<ch.length; i++) {
			char c = ch[i];
			for(int j=0; j<str.length(); j++) {
				if(c == str.charAt(j)) {
					count[i]+=1;
				}
			}
		}
		//3. ���
//		for(int i=0; i<ch.length; i++) {
//			System.out.printf("%3c : ",ch[i]);
//			for(int j=0; j<count[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		StringBuffer buff = new StringBuffer();
		for(int i=0; i< ch.length; i++) {
			buff.append("  ");
			buff.append(ch[i]);
//			buff.append("  ");
			buff.append("  :  ");
			for(int j=0; j<count[i]; j++) {
				buff.append("*");
			}
			buff.append("\n");
		}
			JOptionPane.showMessageDialog(null, buff.toString());
		}
		
	}


