package day10;
/*
 * ����1]
	
	���� ������, �ѷ�, ���̸� ������ Ŭ������ ����� 
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ����
	�� �ɹ��� �ʱ�ȭ �ϰ� 
	��� �ϼ��� 
 */
public class Semo {
	int ban;
	double no1;
	double no2;
	
	public void setSemo(int semo) {
			ban = semo;
			
			no1= ban*2*3.14;
			no2= ban*ban*3.14;
			
	}
	
	public void semoPrint() {
		System.out.println("���� �������� : " + ban);
		System.out.println("���� �ѷ� : " +  no1);
		System.out.println("���� ���� : " + no2);
		System.out.println();
	}
}
