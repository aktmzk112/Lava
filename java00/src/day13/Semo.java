package day13;

public class Semo extends Figure {
	
	private int no1;
	private int no2;
	private double area;
	@Override
	public double setArea(int... a) {
		no1 = a[0];
		no2 = a[1];
		area =no1 * no2 * 0.5;
		return area;
	}

	@Override
	public void toPring() {
		System.out.printf("삼각형의 높이는 : %d 이고 밑변은 %d 이며 넓이는 : %.2f 입니다.\n",no1,no2,area);
	}
}
