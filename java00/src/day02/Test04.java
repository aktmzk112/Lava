package day02;

public class Test04 {
	/*
	 	************
	  	������(Constructor)
	  	: Ŭ������ ��ü�� �� �� Ŭ������ �ɹ��� �����ߵ� �⺻���� �������̴�
	  	  �̶� �� �ɹ����� �⺻���� ���� ���ִ� ������ �ϴ°��� ������ �Լ�....
	  	  
	  	  ����]
	  	  	public Ŭ�����̸�(){
	  	  		����...
	  	  	}
	  	  
	  	  ***
	  	  ������ �Լ��� ��ȯ���� ����.
	  	  
	  	  ***
	  	  ������ �Լ��� �ϳ��� ���� ���� ������ 
	  	  �ڹ� ����ӽ��� �ڵ����� �⺻ ������ �Լ��� ���� ȣ�����ش�.
	  	  
	  	  ���� ������ �Լ��� �ϳ��� ����� 
	  	  �ڹ� ����ӽ��� �⺻ ������ �Լ��� ������ �ʴ´�.
	  	  
	  	  ����
	  	  ������ �Լ��� ���Ǹ� �ҰŸ�
	  	  �⺻ ������ �Լ��� ������ ������ ���� �� �صδ°��� ����.
	  	  
	 */
	
	/*
	 	�� ������
	 		: ������ ����� ũ�⸦ ���ؼ� ������ ��� ������.
	 	
	 	����]
	 		���п��� �񱳿��ڸ� ����ϵ���
	 		�ѹ��� �ΰ������� ���� ����

	 	��]
	 		int no = 10;
	 		
	 		1 <= no <= 20; ==> error
	 		
	 		==> (1 <= no) & (no <= 20); ==> ����
	 	
	 	�� ������ 
	 		������ ������ �����ؼ� �븮���� ���� ������
	 		
	 		����]
	 			& : �������� ��� ���ϰ�쿡 
	 			| : �������� �ϳ��� ���̸� ��
	 			! : ���� ������
	 			
	 			(���� ������)
	 			&& : �������� ��� ���ϰ�� ��.
	 			|| : �������� �ϳ��� ���̸� ��.
	 			
	 	
	 */
	public Test04() {
		test1();
		test2();
	}
	
	public static void main(String[] args) {
		new Test04();
		
	}

	public void test1() {
		char ch1 = 'A';
		char ch2 = 97+1;
		System.out.println("97 : "+ch2);
		int no1 = ch1;
		
		ch2 = (char)(no1 + 3); // no1�� int Ÿ���̹Ƿ� ��������ȯ�� �ʿ��ϴ�
		
		
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println(ch2);
		
	}
	
	public void test2() {
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println("1." + (bool1 & bool2));
		System.out.println("2. "+(bool1 | bool2));
		System.out.println("3. "+ !(bool1 & bool2));
		
		
		int no1 = 10;
		int no2 = 11;
		
		System.out.println("4. "+ ((no1 > no2) && (++no1 == no2)));
		System.out.println("4-1."+ no1);
		
		System.out.println("5. "+ ((no1 < no2) || (++no1 == no2)));
		System.out.println("5-1."+ no1);
		
		
		// ��Ʈ������
		System.out.println("6. "+(35 & 24));
		
	}
	
}
