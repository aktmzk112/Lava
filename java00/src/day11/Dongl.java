package day11;

public class Dongl extends Dohyung{
	int rad; 
	double arround;
	
	public Dongl() {
		this(1);
		
	}

	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public void setArround() {
		arround = 2 * rad * 3.14;
	}

	public void setArea() {
		area = rad * rad * 3.14;
	}
	// ����Լ� - Dohyung�� toPring() Overriding
	public void toPrint() {
		System.out.printf("���� ������ : %d\n���� �ѷ� : %.3f\n���� ���� : %.3f\n",rad , arround , area);
	}
}
