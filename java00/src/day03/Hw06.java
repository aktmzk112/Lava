package day03;
import java.util.*;

public class Hw06 {
/*
 * ���� 6]
	 		������ ��带 �Է� �޾Ƽ� 
	 		�ش�⵵�� �������� ������� �Ǻ��Ͽ� ��� 
	 		
	 		��, ���׿����ڴ� ���
	 		
	 		���� 
	 			4�� ���� �������� 100���� �������� ������ 400���� ���� �������� ��
 */
	public Hw06() {
		solv();
	}
	//���� �Ǻ��ϴ� �Լ�
	public void solv() {
	while(true){
		// �Է� ���� �غ� 
		Scanner sc =new Scanner(System.in);
		// �޼��� ��� 
		System.out.print("�⵵�� �Է� �ض� !:");
		// �Է��� ���� ������ ��� 
		int year = sc.nextInt();
		// �������� ������� �Ǻ� 
		String result = (year % 4 !=0 ) ? ("���") : (
					(year % 100 != 0) ? ("����") : (
						(year % 400 == 0) ? ("����") : ("���")
							)
				);
		// ���
		System.out.println(result);
	}
	}
	public static void main(String[] args) {
		new Hw06();

	}

}
