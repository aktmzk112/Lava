package day03;

public class Hw02 {

	public Hw02() {
//	 	���� 2]
//	 	0~255 ������ ���ڸ� ����� 
//	 	�� ���ڸ� �ڵ尪���� �ϴ� ���ڸ� ����
//	 	�ش繮�ڰ� ���������� �ƴ��� �Ǻ��ؼ� ����ϼ��� 
//	 	��, ���� ���ܻ縦 ó���ؼ� ó���ϼ��� 
		
	
		solv1();
	}
	
	// ���ڸ� �����ϰ� ���� ���ڸ� ���������� �ƴ��� �Ǻ��ϴ� �Լ�
	public void solv1() {
		//0~255 ���� ������ ���� ����
		int no = (int)(Math.random() * 256);
	
		//���ڷ� ����
		char ch = (char) no;
		
		//�Ǻ�
		String str = (ch >= 'A' && ch <= 'Z') ? ("���� �빮�� "+ch+" �Դϴ�."): (
					(ch >='a' && ch <= 'z' ) ? ("���� �ҹ��� "+ch+" �Դϴ�") : ("������ ���� : [ "+ch+" ] �� [ ������ �ƴ� ���� ] �Դϴ�.")
				);
		//���
		System.out.println(str);
	}

	public static void main(String[] args) {
		new Hw02();

	}

}