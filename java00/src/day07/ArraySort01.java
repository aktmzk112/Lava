package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * 		���� ]
 * 			�ζ� �� ������ ���� �迭�� ���
 * 			���� ��ȣ���� �����ؼ� 
 * 			��� �����͸� ����� ����
 * 
 * 			�ζ� �� ������ 
 * 				1~45 ������ ���ڰ� 6�� �� �ʿ��ϴ�.
 * 	
 */
public class ArraySort01 {

	public static void main(String[] args) {
		//����
		//1. ���� 6���� ����� �迭�� �����.
		int[] lotto = new int[6];
		
		loop:
		for(int i=0; i<lotto.length; i++) {
			//2. �迭�� �����ϰ� ������ ���� 
			int no = (int)(Math.random()*(45 -1+1)+1);
			//3. ������ ������� ���� ��ȣ�� �ִ��� üũ�ϰ�
			for(int j=0; j<i; j++) {
				if(lotto[j] == no) {
					i--;
					continue loop;
				}
			}
			//�̰�츦 �����ϴ� ���� ���� �ݺ����� ��� ������ �� ���� 
			//�� �ǹ̴� ���� ��ȣ�� �������� ���ٴ� �ǹ��̹Ƿ� 
			//4. �� �濡 �� ��ȣ�� ���� �ϰ� 
			
			lotto[i] = no;
		
		}
		
		//5. ���
		JOptionPane.showMessageDialog(null, "*** ��÷��ȣ ***\n" + Arrays.toString(lotto));
		//6. �����ϰ�
		for(int i=0; i<lotto.length-1; i++) {
			//���⼭ ���� �����ʹ� �� ������ �����ʹ� ���� �ʿ䰡 �����Ƿ� �Ǹ�����
			// ���������� �̾Ƽ� ���Ѵ�.
			
			//���� ������ ���ĺ��� �� ������ ���� �ϳ��� ������ ���Ѵ�.
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		//7. ��� 
		JOptionPane.showMessageDialog(null, "<html><div style=\"color:red; text-align:center;\"> *** ��÷ ���� ��ȣ ***</div></html>\n" + Arrays.toString(lotto));
	}

}
