package day14;

public class Dongl {
	private int red;
	private double arround , area;
	public Dongl(int red) {
		this.red = red;
		setArroimd();
		setArea();
	}
	
	//�ѷ� �����ִ� �Լ�
	public void setArroimd() {
		arround = 2*3.14*red;
	}
	
	//���������ִ� �Լ�
	public void setArea() {
		area = 3.14*red * red;
	}
	
	//area �� ���������ڰ� private �̰� �̰��� Ŭ������������ ������ �����ϹǷ� �Լ��� ���� �����͸� ��ȯ����
	public double getArea() {
		return this.area;
	}

	//������ ������ ���� ������ �Ǵܵǵ��� equals�Լ��� �������̵� �غ���
	public boolean equals(Object obj) {
		//��ȯ�� ���� ���� ����� �ʱ�ȸ
		boolean bool = false;
		// �ԷµǴ� Dongl �ν��Ͻ��� ������Ʈ Ÿ������ �ڵ� ����ȯ�� �Ǽ� ����� �� ���̹Ƿ�
		// Dongl Ÿ������ ���� ����ȯ�� ���Ѽ� ����� ����ؾ� �ڴ�.
		Dongl d1 = (Dongl) obj;
		
		//Ÿ���� ��ȯ�� ��� ������ ������ ���غ���
		//�񱳴� ����� �ΰ��� �ʿ��ϴ�, �ϳ��� �Ű������� �Է� �޾Ҵ�, �׷� �ٸ� �ϳ���????
		bool = (this.area == d1.area) ? true : false;
		
		//��� ��ȯ
		return bool;
	}
}
