package day02;

import java.util.*;

public class Test06 {
/*
  �����ϰ� ���� 11~33 �μ��� �߻���Ű��
  ���ڸ� �Է¹޾Ƽ� 
  �Է¹޴� ���ڰ� 1�̸� �ﰢ���� ���̸�
  					2�̸� �簢���� ���̸� �����ִ� ���α׷� �ۼ�
 */	
	
	public Test06() { //������ �Լ�
		//�Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		//�޽��� ���
		System.out.print("�ﰢ���� ���̴� 1, �簢�� ���̴� 2�� �Է��ϼ��� : ");
		int code = sc.nextInt();
		
		// �����ϰ� �μ��� �߻��ؼ� ������ ��´� 
		
		int no1 = (int)(Math.random()*(33-11+1))+11;
		int no2 = (int)(Math.random()*(33-11+1))+11;
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		// �ڵ尪�� 1�̸� �ﰢ�� ���ؼ� ����ϰ� 2�� �簢�� ���̸� ���
		/*
		  	�簢���� �ﰢ���� ������ �������� �ٸ��� ������ �Ѱ��� Ÿ������ ���� ���Ѿ� �Ѵ�.
		  	���⼭�� �Լ� ������ ����� ����� �뵵�θ� ����Ұ��̱� ������ 
		  	���ڿ��� ���� �ؼ� ��� 
		 */
		
		//�Ի󿬻�(���1)
//		String result = (code == 1) ? ("�ﰢ���� ���̴� : "+ samgak(no1,no2)+" �Դϴ�") : 
//							(
//								code == 2 ? ("�簢���� ���̴� : "+sagak(no1,no2)+" �Դϴ�"): ("����Կ��� ������")
//									);
		
		//���2]
//		double semo = samgak(no1,no2);
//		int	nemo = sagak(no1,no2);
//		
//		String result = (code == 1)? ("�ﰢ���� ���̴� "+ semo + " �Դϴ�") : (
//					(code ==2) ? ("�簢���� ���̴� "+ nemo +" �Դϴ�"): ("���忡�� ����")
//				);
		
		//��� 3]
		if (code == 1) {
			System.out.println("�ﰢ���� ���̴� "+ samgak(no1,no2) + "�Դϴ�.");
			
		}else if(code ==2) {
			System.out.println("�簢���� ���̴� "+ sagak(no1,no2)+"�Դϴ�");
		}else {
			System.out.println("����Կ��� ���ÿ�!!!!");
			
		}
		
		//���
		
//		System.out.println(result);
									
	}
	
	//�ﰢ�� ���� �����ִ� �Լ�
	public double samgak(int no1, int no2) {
		// ������ ���ؼ� ������ ���
		double area = no1 * no2 / (double)2;
		// ������ ��ȯ
		return area;
	}
	//�簢�� ���� �����ִ� �Լ�
	
	public int sagak(int no1 , int no2) {
		// ������ ���ؼ� ������ ���
		int area = no1 * no2;
		// ������ ��ȯ
		return area;
	}
	public static void main(String[] args) {
		new Test06();
	}

}
