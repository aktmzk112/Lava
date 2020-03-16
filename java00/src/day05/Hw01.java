package day05;


/*
 * 		1. 
			*
			**
			***
			****
			*****
 */
public class Hw01 {

	public Hw01() {
		samgr();
	}
	public void samgr(){
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new Hw01();

	}

}
