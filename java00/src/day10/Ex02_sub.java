package day10;

/*
 * ���� 2]
	10���� ������ ������ �Է��� �迭�� ����� (�迭�� ���̴� 10���� �Ѵ�.)
	�� �迭�� ��� ������
	����, ����� ������ ������ִ� ���α׷��� �ۼ�
	��, �Է�, �������, ��հ»�, ����� �Լ��� �����ϼ��� 
 */
public class Ex02_sub {
	int[] no1;
	int no2;
	double no3;
	
	public void scr(int[] num1) {
		no1 = num1; 
//		int sum = 0;
		for(int i=0; i<no1.length; i++) {
			no2 += no1[i];
		}
		
		no3 = no2/10.;
	}
	
	public void toPrint() {
		for(int i=0; i<no1.length; i++) {
			System.out.println("���� " +i+"�� : " + no1[i]);
		}
		System.out.println("------------------------------");
		System.out.println("������ : " + no2);
		System.out.println("����� : " + no3);
	}
	
	
}
