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
		System.out.printf("���� �������� : %d �̰� ���̴� : %.2f �Դϴ�.\n" ,ban,area);
		
	}

}
