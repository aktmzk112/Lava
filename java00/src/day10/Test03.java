package day10;
/*
 	Nemo Ŭ������ �ټ��� ������ �迭�� �����
 	���� ���δ� 1~29���� �����ϰ� ���� �迭�� �ϼ�����
 	
 	�׸��� �� Nemo�� ����, ���� , ���̸� �������
 */
public class Test03 {
//	Nemo �迭������ ������
	Nemo[] nemo;
	
	//�׸� �ʱ�ȭ �ϴ� �Լ��� ������
	
	public void setNemo() {
		//���� �迭�� �ֱ�ȭ ���ش�
		nemo = new Nemo[5];
		
		//���� nemo���� �����ʹ� ä�������� �ʰ� �����Ͱ� �� �游 �������� �����̴�.
		//�� �濡 �����͸� �־����� 
		
		for(int i=0; i<nemo.length; i++) {
			//�ݺ����� �ѹ� �ݺ��ɶ����� nemoŬ������ �ν��Ͻ��� ���� ���濡 �־�����Ѵ�.
			nemo[i] = new Nemo();
			
			// Nemo �ν��Ͻ��� ����� ���µ� ���� ����,����,���� �� �Է������� ���� �����̴�.
			// ���� ���� ���� ���� �� 0���� ������ �Ǿ��ִ�.
			// ���� ���� ���� ���̸� ���� �Ѵ� �̰��� ����� ����� �����Ƿ� �� ����� ����� ���� 
			
			//���� ���� �ΰ��� �����.
			int garo = (int) (Math.random() * (29-1+1)+1);
			int sero = (int) (Math.random() * (29-1+1)+1);
			
			nemo[i].setVal(garo, sero);
			
		}
	} 
	public static void main(String[] args) {
		
		Test03 t = new Test03(); //���� �ɹ����� nemo�� ���õǾ� ���� �ʴ�
		
		Test03 t1 = new Test03(); //���� �ɹ����� nemo�� ���õǾ� ���� �ʴ�
	
		t.setNemo(); // nemo �� ����
		
		//����Ѵ�. �츮�� �ɹ������� ������ ������ִ� �Լ��� ����� ����.
		
		for(int i=0; i<t.nemo.length; i++) {
			t.nemo[i].toPrint();
		}
		System.out.println();
		System.out.println("--------");
		//t1�� ����Ѵ�
//		for(int i=0; i<t1.nemo.length; i++) {
//			
//			t1.nemo[i].toPrint();
//		} ���� ���õǾ� �����ʾ� ������ ����.
		
	}

}