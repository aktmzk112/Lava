package day05;

public class Ex01 {

	public static void main(String[] args) {
		int no1 = 1;
		int no2 = 1;
		int tmp = 0;   
		System.out.print(tmp+", "+no1+", "+no2+", ");
		
		for(int i=0; i<10; i++) {
			
			tmp = no1 + no2;  	
		 	no1 = no2; 
			no2 = tmp; 
			System.out.print(tmp+", ");
			
			
		}
		
		
		/*
		 *  1  1  1  1  2
			2  2  2  3  3
			3  3  4  4  4
			4  5  5  5  5
			6  6  6  6  6
		 */
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=5; j>0; j--) {
				
				if(j>i) {
					System.out.print(i);
				}else {
					System.out.print((i+1));
					
				}
				
			}
			System.out.println();
		}

	}

}
