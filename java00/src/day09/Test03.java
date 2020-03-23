package day09;

public class Test03 {
/*
 * 1���� �迭�� 
 * 'A' ~ 'E' ���� �ʱ�ȭ ���ִ� �Լ��� �����Ͽ� 
 * �������� ch�� �ʱ�ȭ�� ���ְ� 
 * 
 * �빮�ڸ� �Է��ϸ� �ҹ��ڷ� ��ȯ���ִ� �Լ��� ���� 
 * ch�� ���ڸ� �ҹ��ڷ� ���� �϶� 
 * 
 * ��ȭ�н�
 * 		���� �迭�� �Է��ϸ� 
 * 		���� �迭�� 'A' ~ 'E' �ʱ�ȭ ���ִ� ����� ���� �Լ��� �ۼ� �ϰ� ���༭ ���
 * 
 * 		
 */
	char[] ch;
	char[] ch2;
	public Test03() {
		
		setCh();
		for(char c : ch) {
			System.out.printf("%2c | ",c);
		}
		System.out.println();
		//���� ������ �ҹ��ڷ� ����
		for(int i=0; i<ch.length; i++) {
			char d = ch[i];
			char e = toSo(d);
			ch[i] = e;
		}
		
		//���
		for(char c : ch) {
			System.out.printf("%2c | ",c);
		}
		System.out.println();

		
		setCh();
		for(char c : ch) {
			System.out.printf("%2c | ",c);
		}
	}

	//���� �迭 �ʱ�ȭ �Լ�
	public void setCh() {
		ch = new char[5];
		for(int i=0; i<5; i++) {
			ch[i] = (char) ('A' + i);
		}
	}
	
	//����ڸ� �ҹ��ڷ� ��ȯ ���ִ� �Լ�
	public char toSo(char d) {
		char result = (char) (d + ('a'-'A'));
		
		return result;
	}
	
	public static void main(String[] args) {
		new Test03();
		
	}

}
