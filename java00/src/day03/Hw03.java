package day03;

public class Hw03 {
	/*
	 * 	 	���� 3]
		 		ȭ��(Fahrenheit) �µ� 100���� 
		 		����(Celcius)�µ� ����� �˾ƺ��� ���α׷��� �����ϼ���
		 		
		 		���� ] 
		 			�����µ� = 5/9 * (ȭ���µ� - 32)
	 */
	public Hw03() {


	}

	public static void main(String[] args) {
		new Hw03();
		
		//ȭ���µ� �����
		double fr = 100;
		
		//�����µ� ���
		//����] ������ ������ ���� ����� ������ ���´�.
		
		double ca = 5 /9.* (fr -32);

		//���
		System.out.println("ȭ���µ� "+ fr + " ���� �����µ� [ " + (int)(ca * 10 + 5) / 10f+ " ] �Դϴ�.");
		
	}

}
