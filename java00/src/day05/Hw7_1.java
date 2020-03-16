package day05;
/*
 * 				1  2  3  4  5
				6  7  8  9  10
				11 12 13 14 15
				16 17 18 19 20
				21 22 23 24 25
 */
public class Hw7_1 {

	public static void main(String[] args) {
		
		for(int i =0; i<25; i++) {
			if(i != 0 && i % 5 ==0) {
				System.out.println();
			}
			System.out.printf("%3d",i+1);
		}
	}

}
