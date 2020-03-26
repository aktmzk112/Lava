package day13.sub;

public class Nemo implements Moyang {

	private int garo;
	private int sero;
	private double area;
	
	public Nemo() {
		
	}
	
	public Nemo(int no1, int no2) {
		garo = no1;
		sero = no2;
		setArea();
		toPrint();
	}
	@Override
	public void setArea() {
		area = garo * sero;
	}

	@Override
	public void toPrint() {
		System.out.printf("사각형의 가로 : [ %3d ] 세로 : [ %d ]  넓이는 : [ %.2f ] \n",garo,sero,area);

	}

}
