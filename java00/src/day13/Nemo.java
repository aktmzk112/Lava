package day13;

public class Nemo extends Figure {
	private int garo;
	private int sero;
	private double area;
	@Override
	public double setArea(int... a) {
		garo = a[0];
		sero = a[1];
		area=garo + sero;
		return area;
	}
	
	@Override
	public void toPring() {
		System.out.printf("사각형의 가로는 %d 이고 세로는 %d 이고 넓이는 : %.2f 입니다\n",garo,sero,area);
	}

}
