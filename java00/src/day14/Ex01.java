package day14;
/* ���� 2]
 	if - else if ������ ����Ͽ� 
 	
 	���̸� �Է¹޾Ƽ� �ʴ�, �̽ʴ�,....
 	�Ǻ����ִ� ���α׷� �ۼ� 	
*/

/*
 * �߰��н� ���� ����� �Լ��� �����Ͽ� �Ͻÿ�
 */
import javax.swing.*;

public class Ex01 {

	public Ex01() {
		String age = JOptionPane.showInputDialog("���̸� �Է��ϼ��� : ");
		int age2 =0;
		String msg ="";
		
		try {
			age2 = Integer.parseInt(age);	
			if (age2 < 10) {
				System.out.println("10 �� �̸� �Դϴ�");
			} else if (age2 >= 10 && age2 < 20) {
				System.out.println("10 �� �Դϴ�");
			} else if (age2 >= 20 && age2 < 30) {
				System.out.println("20 �� �Դϴ�");
			} else if (age2 >= 30 && age2 < 40) {
				System.out.println("30 �� �Դϴ�");
			} else if (age2 >= 40 && age2 < 50) {
				System.out.println("40 �� �Դϴ�");
			} else if (age2 >= 50 && age2 < 60) {
				System.out.println("50 �� �Դϴ�");
			} else {
				System.out.println("50�� �̻��Դϴ�");
			}
		}catch (Exception e) {
			msg = "���� ���°� �ƴմϴ�";
			System.out.println(msg);
		}
//		System.out.println(age2);
	}

	public static void main(String[] args) {

		new Ex01();
	}

}
