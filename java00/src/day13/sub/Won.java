package day13.sub;

public class Won implements Moyang {
	private int ban;
	private double area;
	
	public Won() {
		
	}
	
	public Won(int no) {
		ban = no;
		setArea();
		toPrint();
		
	}
	@Override
	public void setArea() {
		area = ban * ban * 3.14;
	}

	@Override
	public void toPrint() {
		System.out.printf("���� �������� : [ %d ] ���̴� [ %.2f ] \n",ban,area );
	}

}
