package day11;

public class Nemo extends Dohyung{
	int garo;
	int sero;
	
	public Nemo() {
		this(10,30);
	
	} 
	
	public Nemo(int no1, int no2) {
		garo = no1;
		sero = no2;
		getArea();
	}
	
	
	public void getArea() {
		area = garo * sero;
	}
	
	public void toPrint() {
		System.out.printf("�簢���� ���� : %3d \n�簢���� ���� : %3d\n�簢���� ���� : %3.1f",garo, sero , area);
	}
}
