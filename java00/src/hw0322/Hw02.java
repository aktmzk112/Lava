package hw0322;

import java.util.Arrays;

public class Hw02 {
	Hw02_sub[] num;
	int a;
	public void getNum() {
		num = new Hw02_sub[5];
		for(int i=0; i<num.length; i++) {
			
			num[i] = new Hw02_sub();
			
			int no = (int)(Math.random() * (100-10+1)+10);
			
			
			num[i].setNum(no);
			
			
			
		}
		
		
	}
	public static void main(String[] args) {
		Hw02 h2= new Hw02();
		
		h2.getNum();
		
		for(int i=0; i<h2.num.length-1; i++) {
			for(int j=i+1; j<h2.num.length; j++) {
				if(h2.num[i].num1 < h2.num[j].num1) {
					int tmp = h2.num[i].num1;
					h2.num[i].num1 = h2.num[j].num1;
					h2.num[j].num1 = tmp;
				}
			}
		}
		
		for(int i=0; i<h2.num.length; i++) {
			h2.num[i].numPrint();
		}
	}
}
