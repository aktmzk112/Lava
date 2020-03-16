package day05;

/*
 * 		2.
			    *
			   **
			  ***
			 ****
			*****
		
 */
public class Hw02 {

	public Hw02() {
		sam2();
		
	}
	
	public void sam2() {
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>=0; j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new Hw02();

	}

}
