package day02;

public class Ex01_02 {

	public Ex01_02() {
//	 	���� 2]
//	 	0~255 ������ ���ڸ� ����� 
//	 	�� ���ڸ� �ڵ尪���� �ϴ� ���ڸ� ����
//	 	�ش繮�ڰ� ���������� �ƴ��� �Ǻ��ؼ� ����ϼ��� 
//	 	��, ���� ���ܻ縦 ó���ؼ� ó���ϼ��� 
	 	
		
		for(int i=0; i<=20; i++) {
		int num = (int)(Math.random() *(255-0+1))+0;
		char ch = (char) num;
		
		String str = (num >= 'A' && num <= 'Z') ? ("�빮���Դϴ�" + ch) :(
					(num >='a' && num <= 'z') ? ("�ҹ����Դϴ�" + ch) : ("���� �ƴϾ�!")
				) ;
		
		System.out.println(str);
		}
		
	}

	public static void main(String[] args) {
		new Ex01_02();

	}

}
