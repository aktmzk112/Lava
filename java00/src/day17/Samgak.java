package day17;

public class Samgak {
	
	//�ﰢ�� ���� ����
	private int width;
	private int height;
	private double area;
	
	//�⺻������ �Լ�
	public Samgak() {
	}
	
	//�����ε�
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
	//���� �ε�
	public void setArea() {
		this.area = width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	

}
