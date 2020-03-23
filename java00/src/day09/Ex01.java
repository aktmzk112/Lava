package day09;

public class Ex01 {

	public static void main(String[] args) {

		char[][] ch = new char[][]{{'0','1','2','3','4','5','6','7','8','9'},
									{'A','B','C','D','E','F','G','H','I','J'},
									{'가','나','다','라','마','바','사','아','자','차'}};
		
		char[][] ch1 = new char[][]	{{'0','1','2','3','4','5','6','7','8','9'},
									{'A','B','C','D','E','F','G','H','I','J'}};
									
		char[][] ch2 = new char[][] {{'0','1','2','3','4','5','6','7','8','9'},
									{'가','나','다','라','마','바','사','아','자','차'}};
									
		char[][] ch3 = new char[10][3];
		//						{0 A 가}
		
		for(int i=0; i<ch3.length; i++) {
			int no = 0;
			
			ch3[i][no] = ch[no][i]; 
			ch3[i][++no] = ch[no][i]; 
			ch3[i][++no] = ch[no][i]; 
			
		}
		
		
		
		char[][] ch4 = new char[10][2];
		
		for(int i=0; i<ch4.length; i++) {
			for(int j=0; j<ch4[i].length; j++) {
				//	10 2        2  10 
				ch4[i][j] = ch1[j][i];
				//  0  0        0  0  = ch4[0][0] = 1
				//  0  1        1  0  = ch4[0][1] = 'A'
				//  1  0        0  1  = ch4[1][0] = '2'
				//  1  1        1  1  = ch4[1][1] = 'B'
				//	2  0        0  2  = ch4[2][0] = '3'
				//  2  1        1  2....
			}
			
			
		}
		
		char[][] ch5 = new char[10][2];
		
		for(int i=0; i<ch5.length; i++) {
			for(int j=0; j<ch5[i].length; j++) {
				ch5[i][j] = ch2[j][i];
			}
		}
		
		for(int i=0; i<ch3.length; i++) {
			for(int j=0; j<ch3[i].length; j++) {
				System.out.printf("%-2c",ch3[i][j]);
			}
			System.out.printf("\n");
		}
		
		
		System.out.println();
		for(int i=0; i<ch4.length; i++) {
			for(int j=0; j<ch4[i].length; j++) {
				System.out.printf("%-2c",ch4[i][j]);
				
			}
			System.out.println("");
		}
		
		System.out.println("");
		for(int i=0; i<ch5.length; i++) {
			for(int j=0; j<ch5[i].length; j++) {
				System.out.printf("%-2c",ch5[i][j]);
				
			}
			System.out.println("");
		}
		
		
		
	}

}
