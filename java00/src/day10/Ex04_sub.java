package day10;
/*
 * ���� 4]
 	�л��� ������ �Է��ϸ� ������ ������ִ� ���α׷��� �ۼ�
 	
 	��ȭ ] 
 		�����ϰ� �ο��� ����� 
 		�� �ο��� ��ŭ ������ �����ϰ� ����
 		�Լ��� �����ϰ� �ϼ���
 */
public class Ex04_sub {
		
	public int getSum(int...no) {
		int sum=0;
		for(int i=0; i<no.length; i++) {
			sum += no[i];
		}
		return sum;
	}
}
