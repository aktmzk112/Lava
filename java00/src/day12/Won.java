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
		System.out.printf("���� �������� : %d �̰� ���̴� : %.2f �Դϴ�.\n" ,ban,area);

	}

}
