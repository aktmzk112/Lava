package day02;

public class Test07 {
/*
  	�ܼ�â�� ����ϴ� ����� ���� �Լ� 
  		1.println(����) - ������ ������� ���� �ڵ����� �ٹٲ� ���ִ� �Լ�
  		2.print(����)	- ������ ����ϰ� �ٹٲ��� ���� �ʴ´�
  		3.printf(����,����,����,....)	- ������ ���Ŀ� �°� ������ִ� �Լ�
	
 
 
 */
	
	
	public Test07() {
		System.out.println("#####################");
		System.out.println("#####################");
		
		System.out.print("#####################\n");
		System.out.print("#####################\t");
		
		System.out.println("###########\t##########");
		System.out.println("\t#####################");
		System.out.println("-------------------------------------------------------");
		System.out.printf("------%5d------", 10 ); //10�� 5�ڸ��� �����
		System.out.printf("*****%.2f*****%n",3.141592); // �Ҽ����̶� 2�ڸ��� ǥ�� �Ѵ� 
	
		System.out.printf("%5s", "ȫ�浿");
	}
	public static void main(String[] args) {
		new Test07();

	}

}
