package day10;

public class Ex02 {
	int[] num;
	Ex02_sub ex2S = new Ex02_sub();
	
	public void scrVal() {
		num = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random() * (100-0)+1);
		}
		
		ex2S.scr(num);
	
	}
	public static void main(String[] args) {
		Ex02 ex2 = new Ex02();
		
		ex2.scrVal();
		
		ex2.ex2S.toPrint();
		
		

	}

}
