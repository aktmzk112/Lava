package day01;
/*
 * ���� 5]
	
	�Ǻ���ġ ���� 10���� ������ �迭�� �����
	1���� ���������� 10���� ���丮���� ���� ���
 */
public class Ex05 {

	
	public static void main(String[] args) {
		int no = 1;
		int no2 = 1;
		int[] pibo = new int[10];
		
		for(int i = 0; i<pibo.length; i++) {
			int result = no + no2;
			no = no2;
			no2 = result;
			pibo[i] = no2;
			
			System.out.print(pibo[i] + ", ");
		}
		
	}

}
