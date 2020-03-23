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
	// 출력함수 - Dohyung의 toPring() Overriding
	public void toPrint() {
		System.out.printf("원의 반지름 : %d\n원의 둘레 : %.3f\n원의 넓이 : %.3f\n",rad , arround , area);
	}
}
