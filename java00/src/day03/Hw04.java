package day03;

import java.util.*;
public class Hw04 {
	/*
	 * 	 		�Ҽ����� �ִ� ���ڸ� �Է��Ѽ� 
 		�Ҽ��� ���� ��°�ڸ����� �ݿø� ��� ��� 
 		
 		����]
 			+0.005 �� �ϸ� ��°�ڸ� �ݿø� �ǰ�
 			���⿡ x100 ���ָ� ��°�ڸ����� �����ο� ���Ű� 
 			�̰��� ������ �ٲٸ� �������� ��°�ڸ� ���ϴ� �������̰� 
 			�ٽ� /100 ���� ���ָ� 
 			�ٽ� �Ҽ��� ���·� ��ȯ �ɰ��̴�.
	 */
	public Hw04() {
		//�Ҽ� �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		//�޼��� ���
		System.out.print("�Ǽ��� �Է��ض� :");
		//�Է¹޾� ������ ���
		double num = sc.nextDouble();
		//�Լ� ���� ������ �Ѱ��ָ鼭 �����ϰ� ������ �ް� 
		double result = banolim(num);
		// ������ ���
		System.out.println("�Է¹��� �Ǽ� : "+num+ "\n�ݿø��� �Ǽ� : "+result);
	}
	
	// �Ǽ��� �Ҽ��Τ��ڸ����� �ݿ������ִ� �Լ�
	public double banolim(double no1) {
		
		//��ȯ���� ���� ���� ����
		double result = 0.;
		
		// �Է¹��� ������ �ݿø�(�Ҽ���°�ڸ�����...)
		/*
		 *  double no = 123.4567 
		 *  int no1 = int (no * 1000); =>123456
		 *  no1 = no1+5;			=> 123461
		 *  no1 = (no1 / 10) / 100.;		=> 123.46
		 */
		int no2 = (int) (no1*1000);
		no2 +=5;
		result = (no2/10) /100.;
		
		//������ ��ȯ
		return result;
	}

	public static void main(String[] args) {
		new Hw04();
		
	}

}
