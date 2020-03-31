package day17;

public class Samgak {
	
	//삼각형 변수 선언
	private int width;
	private int height;
	private double area;
	
	//기본생성자 함수
	public Samgak() {
	}
	
	//오버로딩
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}
	//오버 로딩
	public void setArea() {
		this.area = width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	

}
