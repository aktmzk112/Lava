package day10;

public class Ex03_sub {
	int[][] num1;
	int[][] sum;
	int[][] avg;
	String name;
	
	public void setNum() {
		num1 = new int[5][5];
		
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1[i].length; j++) {
				num1[i][j] = (int) (Math.random() * ( 100 - 10 + 1)+10);
			}
		}
	}
	
	
	public void setSum() {
		sum = new int[5][1];
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1[i].length; j++) {
				sum[i][j]+= num1[i][j];
			}
		}
	}
	
	public void setAvg() {
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1[i].length; j++) {
				sum[i][j]+= num1[i][j];
			}
		}
	}
}
