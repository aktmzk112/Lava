package day11;

/*
 * ����1] 
 * 		��Ŭ������ ���� ������ ������ Ŭ�����̴�. 
 * 		�� Ŭ������ ��ü�� �� �� �������� �Է¹޾Ƽ� ���� ���� ������
 * 	 	�Է��� �ǰ� Ŭ���� ���� �ϼ��� 
 * 		
 * 		�������� �Է��� �ȵ� ���� 10���� �Էµǰ� �ϼ��� this() ���
 */
public class Circle {
	int won;

	
	public Circle(){
		this(10);
	}
	
	public Circle(int won) {
		this.won = won;
	}
	
	public double won1() {
		return 2*won*3.14;
	}
	
	public double won2() {
		return won*=3.14;
	}
	
	public void toPrint() {
		System.out.println("���� ������ : " + won);
		System.out.println("���� �ѷ� : " + won1());
		System.out.println("���� ���� : " + won2());
		
		
	}
}
