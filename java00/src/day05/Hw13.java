package day05;

public class Hw13 {
/*
 * 		13.
			
			A
			B C
			D E F
			G H I J
			K L M N O
 */
	public static void main(String[] args) {

		char a = 'A';
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.printf("%2c",a++);
			}
			System.out.println();
		}	

	}

}
