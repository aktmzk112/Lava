package day09;

public class Hw01 {
 /*
 * ���� 1
	�������� �����ϰ� �߻��Ͽ� 
	�� �������� �Է��ϸ� ���� ���̸� �����ִ� �Լ���
	���� �ѷ��� �����ִ� �Լ��� ���� �� ���� 
 */
	
	int no1;
	
	public Hw01() {
		int no =ran();
		double no2 = res();
		double no3 = res2();
		
		own(no,no2,no3);
		
	}
	
	public int ran() {
		no1 = (int) (Math.random() * (100-1+1)+1);
		
		return no1;
	}
	public double res() {
		double result = 2* no1*3.14;
			
		 return result;
	}
	
	public double res2() {
		double result = no1*no1*3.14;
		
		return result;
	}
	
	public void own(int no, double no2, double no3) {
		System.out.println("���� ������ : " +no);
		System.out.println("���� �ѷ� : " +no2);
		System.out.println("���� ���� : " +no3);
	}

	public static void main(String[] args) {
		new Hw01();
		
	}

}
