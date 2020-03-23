package day11;

public class Semo extends Dohyung {
	int no1;
	int no2;
	
	public Semo() {
		this(10,20);
//		area = getAre();
	}
	
	public Semo(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
		area = getAre();
	}
	
	public double getAre() {
		return no1 * no2 /2.;
	}
	
	public void toPrint() {
		System.out.println("»ï°¢ÇüÀÇ ¹Øº¯ : " + no1);
		System.out.println("»ï°¢ÇüÀÇ ³ôÀÌ : " + no2);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + area);
	}
	
}
