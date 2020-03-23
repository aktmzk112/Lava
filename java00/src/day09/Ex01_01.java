package day09;

public class Ex01_01 {

	public static void main(String[] args) {
		char[][] ch = new char[3][10];
		char[] han = new char[] {'가','나','다','라','마','바','사','아','자','차'};
		for(int i=0; i<1; i++)
		{
			for(int j=0; j<10; j++) {
				ch[0][j] = (char) (48+j);
				ch[1][j] = (char) ('A'+j);
			}
		}
			
		ch[2] = han;
		char[][] ch1 = new char[2][10];
		
		for(int i=0; i<ch1.length; i++) {
			for(int j=0; j<ch1[i].length; j++) {
				ch1[i][j] = ch[i][j];
				//  0  0       0  0 
				
			}
		}
		
		char[][] ch2 = new char[2][10];
		
		for(int i=0; i<ch2.length; i++) {
			for(int j=0; j<ch2[i].length; j++) {
				int no = 0;
				ch2[no][j] = ch[no][j];
				ch2[++no][j] = ch[++no][j];
				
			}
		}
		
		char[][] ch3 = new char[10][3];
		
		for(int i=0; i<ch3.length; i++) {
			for(int j=0; j<ch3[i].length; j++) {
				ch3[i][j] = ch[j][i];
			}
		}
		
		char[][] ch4 = new char[10][2];
		
		for(int i=0; i<ch4.length; i++) {
			for(int j=0; j<ch4[i].length; j++) {
				ch4[i][j] = ch[j][i];
			}
		}
		
		char[][] ch5 = new char[10][2];
		
		for(int i=0; i<ch5.length; i++) {
			for(int j=0; j<ch5[i].length; j++) {
				int no=0;
				ch5[i][no] = ch[no][i];
				ch5[i][no+1] = ch[no+2][i];
			}
		}
		
		for(int i=0; i<ch1.length; i++) {
			for(int j=0; j<ch1[i].length; j++) {
				System.out.printf("%2c",ch1[i][j]);
			}
		}
		System.out.println();
		for(int i=0; i<ch2.length; i++) {
			for(int j=0; j<ch2[i].length; j++) {
				System.out.printf("%2c",ch2[i][j]);
			}
		}
		
		System.out.println();
		for(int i=0; i<ch3.length; i++) {
			for(int j=0; j<ch3[i].length; j++) {
				System.out.printf("%2c",ch3[i][j]);
			}
		}
		System.out.println();
		for(int i=0; i<ch4.length; i++) {
			for(int j=0; j<ch4[i].length; j++) {
				System.out.printf("%2c",ch4[i][j]);
			}
		}
		System.out.println();
		for(int i=0; i<ch5.length; i++) {
			for(int j=0; j<ch5[i].length; j++) {
			}
		}
		
		for(char[] c : ch4) {
			for(int i=0; i<c.length; i++) {
				System.out.print(c[i]+" ");
			}
			System.out.println();
		}
		
	}

}
