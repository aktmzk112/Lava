package day05;



public class Solv10 {
/*
 * 		10.
			1
			2  3
			4  5  6
			7  8  9  10
			11 12 13 14 15
 */
	public Solv10() {
//		solv1();
		solv2();
	}

	public void solv1() {
		
		int no =1;
		int i = 0;
		while(i < 5) {
				
			int j=0;
			while(j <= i) {
				System.out.printf("%3d",no++);
				j++;
			
			}
			System.out.println(); // 줄 바꿈!
			
			//while 문을 사용할때는 카운터 변수 증감식을 별도로 처리해야 한다.
			i++;
		}
		
	}

	public void solv2() {
		for(int i = 0; i <5; i++) {
			
			// 각 행의 시작 숫자 만들기
			int no =1;
			for(int j=0; j <= i; j++)  no += j;
			
			// 각 행의 각 셀의 숫자 출력하기
			for(int j = 0; j<=i; j++) {
				System.out.printf("%3d", no + j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		
		new Solv10();


	
	}

}
