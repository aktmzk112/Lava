package day13.sub;

public class Samgak implements Moyang {
	private int width;
	private int height;
	private double area;
	
	public  Samgak() {

	}
	
	public  Samgak(int no1,int no2) {
		this.width = no1;
		this.height = no2;
		setArea();
		toPrint();
	}
	
	@Override
	public void setArea() {
		area = width * height * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.printf("ªÔ∞¢«¸¿« ≥Ù¿Ã : [ %d ]  πÿ∫Ø : [ %d ] ≥–¿Ã : [ %.2f ] \n",width,height,area);
	}

}
