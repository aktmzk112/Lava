package day08;

public class Solv02 {
/*
 * ��2]
	��,��,��,����,���� ������ �����Ϸ��� �Ѵ�.
	�л��� ���� 5���̴�
	
	2�� �迭�� ���� 
	5���� ������ �迭�� ����ÿ� 
 */
	public static void main(String[] args) {
		
		int[][] num = new int[5][5];
		String[] str = new String[] {"����","����","����","����","����","����","���"};
		String[] str2 = new String[] {"�л�1","�л�2","�л�3","�л�4","�л�5"};
		
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
