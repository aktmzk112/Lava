package day12;

public class Nemo extends Figure {
	private int no1,no2;
	private double area;
	
	@Override
	public void setArea(int...a) {
		no1 = a[0];
		no2 = a[1];
		area = no1 * no2;

	}

	@Override
	public void toPrint() {
		System.out.printf("사각형의 가로 : [%3d ] 세로 : [ %d ]  넓이는 : [ %.2f ] \n",no1,no2,area);

	}


}
