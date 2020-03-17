package day01;
/*
 * 문제 5]
	
	피보나치 수열 10개를 저장할 배열을 만들고
	1부터 순자적으로 10까지 팩토리얼을 만들어서 출력
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
