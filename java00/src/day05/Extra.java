package day05;
/*
 *  1,1,.....
 *  �� �����ϴ� �Ǻ���ġ ������ 10�� ���ض�
 *  
 *  ����]
 *  	�Ǻ���ġ ����
 *  		���� �μ��� ���Ѱ����� ����.. 
 *  		1, 1, 2, 3, 5,....
 *  
 */


public class Extra {
	public Extra() {
			ex1();
			
	}
	
	public void ex1(){
		int no = 1;
		int no2 = 1;
		
		System.out.print(no + ", " + no2+", ");
		for(int i = 0; i< 8; i++) {
			int result = no + no2;
			no = no2;
			no2 = result;
			System.out.print(no2 + ", ");
			
		}
		
	}
	
	public static void main(String[] args) {
		new Extra();
	}
}
