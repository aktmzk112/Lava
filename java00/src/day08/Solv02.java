package day08;

public class Solv02 {
/*
 * 문2]
	국,영,수,물리,역사 점수를 관리하려고 한다.
	학생의 수는 5명이다
	
	2차 배열로 만들어서 
	5명의 점수를 배열로 만드시요 
 */
	public static void main(String[] args) {
		
		int[][] num = new int[5][5];
		String[] str = new String[] {"국어","영어","수학","물리","역사","총점","평균"};
		String[] str2 = new String[] {"학생1","학생2","학생3","학생4","학생5"};
		
		for(int i = 0; i<num.length; i++) {
			for(int j=0; j<num[0].length; j++) {
				num[i][j] = (int) (Math.random() * (100-0+1)-0);
			
			}
		}

		double[][] sum = new double[5][1];
		
		
		for(int i=0; i<num.length; i++) {
			double sum2 = 0.0;
			
			for(int j=0; j<num[i].length; j++) {
				sum2 += num[i][j];
				
			}
			
			for(int k=0; k<sum[i].length; k++) {
				sum[i][k] = sum2;
			}
			
			
		}
		
		double[][] avg = new double[5][1];
		
		for(int i=0; i<avg.length; i++) {
			double avg1=0.0;
			for(int j=0; j<avg[i].length; j++) {
				avg[i][j] = sum[i][j] / 5;
			}
		}
		
		
		double[][] total = new double[5][7];
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=0; j<num[i].length; j++) {
				total[i][j] = num[i][j];
			}
			
			for(int j=0; j<sum[i].length; j++) {
				total[i][5] = sum[i][j];
			}
			for(int j=0; j<avg[i].length; j++) {
				total[i][6] = avg[i][j];
			}
			
		}
		
		
		
		
		
		System.out.printf("\t");
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		
		

		for(int i=0; i<total.length; i++) {
			
			System.out.print(str2[i]+"\t");
			for(int j = 0; j<total[i].length; j++) {
				System.out.printf("%.1f\t",total[i][j]);
			}
			
			System.out.println(); 
		}

		
		
	}

}
