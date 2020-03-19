package day08;
/*
 * 문제 0] 
	구구단을 출력하는데 
	단과 곱을 배열을 만들어서 차리하고 출력하세요 '
 */
public class Solv00 {

	public static void main(String[] args) {
		int[] dan = new int[8];
		int[] gob = new int[9];
		
		
		for(int i=0; i<dan.length; i++) {
			dan[i] += i+2;
		}
		
		for(int i=0; i<gob.length; i++) {
			gob[i] += i+1;
		}
		
		
		int sum = 0;
		for(int i=0; i<dan.length; i++) {
			for(int j=0; j<gob.length; j++) {
				sum = dan[i] * gob[j];
				System.out.println(dan[i]+" x "+gob[j] + " = " + sum);
			}
			System.out.println("-------------");
		}

	}

}
