package day04;

/*
 * ���� ��� ���ϱ�
 */
import java.util.*;
public class Test01 {

	
	
	public static void main(String[] args) {
		//�۾�����
		//0. �ʿ��� ���� ����
		Scanner sc;
		int year;
		String hae = "���";
		//1 �Է¹��� �غ�
		sc =  new Scanner(System.in);
		//2. �޼��� ���
		System.out.print("### ��⵵ ??? : ");
		//3. �⵵ ������ ������ ���
		year = sc.nextInt();
		
		//4. ���� ó���켭 �Ǵ�
		if(year % 400 ==0) {
			/*
			 *  400���� ���� �������¼��� ����Ǵ� �κ֤� 
			 *  �̰��� �̺��� �����Ű�� 
			 *  ��ü ���ǹ� ��ü�� �����̻��
			 */
				hae ="����";
		}else if(year % 100 == 0) {
			/*
			 *  �̺��� �����ϴ� ���� 400���� ����� �������� �ʴ� ���߿� 
			 *  100���� ������ �������� ���� ����Ǵ� �κ�
			 */
//				hae="���";
			
		}else if(year % 4== 0) {
			 	hae="����";
				
		}
			
		//5. ���
		System.out.println("�Է����� [ " + year + " ] �� [ " + hae + " ] �Դϴ�");

	}

}
