package day10;

import java.util.Arrays;

public class Deser {

	public static void main(String[] args) {

		
		int[][] goin = new int [5][2];
		
		for(int i=0; i<goin.length; i++) {
			
				goin[i][0]= (int) (Math.random() * (40 - -20 +1)-20);
		        goin[i][1] = i + 1;
			}//		System.out.println();
			for(int[] g : goin) {
			System.out.println(Arrays.toString(g));
			}
			System.out.println();
			for(int i=0; i<goin.length-1; i++) {
				for(int j=0; j<goin.length; j++) {
					if(goin[i][0] > goin[j][0]) {
						int[] tmp = goin[i];
						goin[i] = goin[j];
						goin[j]= tmp;
					}
				}
			}
			
			for(int i=0; i<goin.length; i++) {
				for(int j=i+1; j<goin.length; j++) {
					if(goin[i][0] > goin[j][0]) {
						int[] tmp = goin[i];
						goin[i] = goin[j];
						goin[j]= tmp;
					}
				}
			}
			for(int[] g : goin) {
			System.out.println(Arrays.toString(g));
			}
			}
	}

