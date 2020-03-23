package day10;

public class Solv3 {

	public static void main(String[] args) {
		String[] name = {
				"박광호","박기윤","안홀주","김소영","이진수"
		};
		Stud[] ban = new Stud[5];
		
		for(int i=0; i<ban.length; i++) {
			ban[i] = new Stud(name[i]);
			
		}
		//출력한다 
		//출력도 반복해소 출력한다 (반복)
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	}
	
	
}
