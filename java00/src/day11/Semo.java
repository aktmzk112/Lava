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
		System.out.println("�ﰢ���� �غ� : " + no1);
		System.out.println("�ﰢ���� ���� : " + no2);
		System.out.println("�ﰢ���� ���� : " + area);
	}
	
}
