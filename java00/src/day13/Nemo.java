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
		System.out.printf("�簢���� ���δ� %d �̰� ���δ� %d �̰� ���̴� : %.2f �Դϴ�\n",garo,sero,area);
	}

}
