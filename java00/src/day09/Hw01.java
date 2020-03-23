package day09;

public class Hw01 {
 /*
 * 문제 1
	반지름을 랜덤하게 발생하여 
	그 반지름을 입력하면 원의 넒이를 구해주는 함수와
	원의 둘레를 구해주는 함수를 제작 후 실행 
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
		System.out.println("원의 반지름 : " +no);
		System.out.println("원의 둘레 : " +no2);
		System.out.println("원의 넓이 : " +no3);
	}

	public static void main(String[] args) {
		new Hw01();
		
	}

}
