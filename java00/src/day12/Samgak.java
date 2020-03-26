package day12;

public class Samgak extends Figure {

	private int no1,no2;
	private double area;
	
	@Override
	public void setArea(int...a) {
		this.no1 = a[0];
		this.no2 = a[1];
		area = no1 * no2 * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.printf("ªÔ∞¢«¸¿« ≥Ù¿Ã : [ %d ]  πÿ∫Ø : [ %d ] ≥–¿Ã : [ %.2f ] \n",no1,no2,area);

	}

}
