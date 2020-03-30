package day15;

import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Random ran1 = new Random();
		
		
		for(int i=0; i<50; i++) {
		
			int rnd = ran1.nextInt(110 );
			boolean bRnd = ran1.nextBoolean();
			System.out.println("rnd : " + rnd + ", bRnd : "+bRnd);
		}
		
		System.out.println();
		Random r1 = new Random(10);
		
		for(int i=0; i<3; i++) {
			
			int rnd = r1.nextInt(100);
			boolean bRnd = r1.nextBoolean();
			System.out.println("rnd : " + rnd + ", bRnd : "+bRnd);
		}
		
	}

}
