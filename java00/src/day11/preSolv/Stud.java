package day11.preSolv;

/**
 *  �� Ŭ������ �л� �Ѹ��� �̸��� ���� ������ ������ �뵵�� Ŭ����
 * @author ������
 * @since 2020.03.23
 * 
 *
 */
public class Stud {
	//�� Ŭ������ �л� �Ѹ��� �������̹Ƿ�
	// �̸��� �־���Ѵ�
	String name;
	
	//���� ������ ������ �������� ���� ����
	
	int kor,eng,math, phys, cod;
	
	//�� Ŭ������ �ν��Ͻ��� �Ǵ� ����
	//�ش� �ν��Ͻ��� �����ָ� ���ð� ������ ������ ����.
	//�ɹ��� �ʱ�ȭ ������ �ϴ� �Լ��� ������ �Լ� �̹Ƿ� 
	//������ �Լ����� �ԷµǴ� �̸����� �ʱ�ȭ �Ѵ�
	//this�� ���� ����Ȱ� �ִ� ��ü�� �ڱ��ڽ��� ���ϴ� ����� �̴�.
	public Stud() {
		//�ƹ������͵� �Է����� ������ "������"��� �л��ǵ����ͷ� �ʱ�ȭ
//		this.kor = 100; => this() �Լ� ������ ����� ���� ������ ����.
//		this("������");
		
		setSubj();
	}
	
	public Stud(String name) {
		this();
		this.name = name;
	}
	// ���� ���� �Է����ִ� �Լ�
	// �츮�� �����ϰ� �Է�����
	public void setSubj() {
		kor = (int) (Math.random()*41+60);
		eng = (int) (Math.random()*41+60);
		math = (int) (Math.random()*41+60);
		phys= (int) (Math.random()*41+60);
		cod= (int) (Math.random()*41+60);
	}
	
	//�������ϴ� �Լ� . ������ ���� ������ ����.
	//���Լ��� ����Ǹ� ������ �ҷ����� 
	
	public int getSum() {
		//��������� ��ȯ
		
		return kor+eng+ math+ phys+cod;
		
	}
	
	//��� �����ִ� �Լ� 
	public double getAvg() {
		return getSum() / 5.;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %4d | %5.3f\n",name,kor,eng,math,phys,cod, getSum(), getAvg());
	}
}
