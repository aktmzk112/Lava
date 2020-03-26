package day12;

public class Won extends Figure {

	private int ban;
	private double area;
	@Override
	public void setArea(int... a) {
		ban = a[0];
		
		area = ban * ban * 3.14;

	}

	@Override
	public void toPrint() {
		System.out.printf("원의 반지름은 : %d 이고 넓이는 : %.2f 입니다.\n" ,ban,area);

	}

}
