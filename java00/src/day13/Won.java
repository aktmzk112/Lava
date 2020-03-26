package day13;

public class Won extends Figure {
	private int ban;
	private double area;
	@Override
	public double setArea(int... a) {
		ban = a[0];
		area =a[0]*a[0]*3.14;
		return area;
	}

	@Override
	public void toPring() {
		System.out.printf("원의 반지름은 : %d 이고 넓이는 : %.2f 입니다.\n" ,ban,area);
		
	}

}
