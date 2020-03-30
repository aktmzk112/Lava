package exam;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex01_pro {

	public Ex01_pro() {

		int len = 0;

		while (true) {

			// �������� ���ڿ� �Է�
			String snum = JOptionPane.showInputDialog("�迭�� ���̸� �Է��ϼ���!");

			// ���ڿ��� ������ ��ȯ

			try {
				len = Integer.parseInt(snum);
				// �� ������ �д´ٸ� ���� ���ڷ� ��ȯ������ ������ ������ �� ���̹Ƿ�
				// �� �ݺ����� �������ش�.
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "���ڰ� �ƴ� ���ڸ� �Է��߽��ϴ�.");
				continue;
			}

		}
		// ���� �迭�� ���̴� ���������� �迭�� �����
		int[] num = new int[len];

		// �迭�� ����� ���� ���� �迭�� ���ڸ� ä���ش�..
		loop: for (int i = 0; i < len; i++) {
			while (true) {
				String sno = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���!");
				try {
					int no = Integer.parseInt(sno);
					// �� ������ �����ϴ� ���� ���� ������ ��ȯ������ ���������� ������ �� ����̴�.
					// �迭�� ��ä���ָ� �ȴ�
					num[i] = no;
					continue loop;
				} catch (Exception e) {
					// �̰��� �迭�� ä�� ���ڸ� ������ ����̹Ƿ�
					// ���ڸ� �ٽ� ������ �ڴ�.
					continue;
				}
			}

		}
		// ���� �迭�� �ϼ��� �Ǿ����� ���� ��������
		int sum = getSum(num);
		
		// �������
		JOptionPane.showMessageDialog(null,"num[] : "+  Arrays.toString(num) + "\n" + "sum: " + sum );
	}

	/*
	 * public int getSum(int[] arr) {
	 * 
	 * int sum=0; 
	 * for(int i=0; i < arr.length; i++)
	 *  { 
	 *  	sum += arr[i];
	 *   }
	 * 
	 * return sum; }
	 */
	public int getSum(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		new Ex01_pro();
	}

}
