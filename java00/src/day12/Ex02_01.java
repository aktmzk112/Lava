package day12;

public class Ex02_01{

	
	public Ex02_01() {
		
		String[] name = new String[] {"박광호","최두용","정우승","나","너"};
		Ex02[] e2 = new Ex02[5]; 
		
		for(int i=0; i < e2.length; i++) {
			e2[i] = new Ex02();
			e2[i].setName(name[i]);
			e2[i].setJava((int) (Math.random() * 41 + 60));
			e2[i].setDb((int) (Math.random() * 41 + 60));
			e2[i].setHtml((int) (Math.random() * 41 + 60));	
			e2[i].setJs((int) (Math.random() * 41 + 60));
			e2[i].setCss((int) (Math.random() * 41 + 60));
			e2[i].setSum();
			e2[i].setAvg();
			e2[i].toPrint();
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Ex02_01();

	}

}
