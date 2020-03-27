package day14;
/*
 * ���� 2] 

	�ﰢ�� Ŭ������ �ۼ��ϰ� 
	�ﰢ�� Ŭ������ �غ��� ���̸� �Է��ؼ� ��ü�� ���鵵�� �ۼ��ϰ�
	
	���� �غ��� ������ ���� �ﰢ���� �ǵ��� 
	equals �Լ��� �������̵� �ϰ� �׽�Ʈ �Ͻÿ�
	
	�Է��� JOptionPane���� �Ҽ��� �Լ��� ó�� 
	��µ� ���� �Ҽ��� �Լ��� ó�� 
	 
 */
public class Samgak  {
	private int no1,no2;
	private double area;
	
	public Samgak(int no1 , int no2) throws NumberFormatException{
		this.no1 = no1;
		this.no2 = no2;
		
		if(no1 < 0 || no2 < 0) {

			throw new NumberFormatException("ù��°"+no1+"�ι�°"+no2);
		}
		setArea();
	}
	
	public void setArea() {
		area = no1 * no2 * 0.5;
	}
	
	public double getArea() {
		
		return area;
	}
	
	public int getNo1() {
		return no1;
	}
	
	@Override
	public String toString() {
		
		return "�ﰢ���� �غ��� "+no1+", ���̰� "+no2+", ���̰� " +area+"�� �ﰢ���Դϴ�.!";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean bool = false;
		Samgak s1 = (Samgak) obj;
		bool = (this.no1 == s1.no1) ? (true) : (false);
		
		return bool;
	}

}
