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
		System.out.printf("�ﰢ���� ���̴� : %d �̰� �غ��� %d �̸� ���̴� : %.2f �Դϴ�.\n",no1,no2,area);
	}
}
