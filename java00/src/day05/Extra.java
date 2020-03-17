package day05;
/*
 *  1,1,.....
 *  로 시작하는 피보나치 수열을 10개 구해라
 *  
 *  참고]
 *  	피보나치 수열
 *  		앞의 두수를 더한값들의 집합.. 
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
