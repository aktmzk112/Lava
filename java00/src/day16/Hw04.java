package day16;

import java.util.*;
public class Hw04 {

	public Hw04() {
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
	
//		cal.set(2005, 7, 31);  
		cal.getTime();
		cal2.getTime();
		cal3.getTime();
		
		cal2.set(2005,1,31);
		cal3.set(2024,1,31);
//		cal.roll(cal.DAY_OF_MONTH,3); //roll�� �ִ����ڰ� �������� �ٽ� 1�Ϻ��� �����Ѵ� ���� ������ ����
		cal.add(cal.DAY_OF_MONTH, 3); //add�� ���ڿ� ���� �ٲ㺸��~!!!
		System.out.print(cal.get(cal.DAY_OF_MONTH)); //add�� �����ߴµ� ��ȭ�� ����
		System.out.println();
		System.out.println(cal.get(cal.YEAR)); //�⵵�������� ���
		System.out.println(cal.get(cal.MONTH)+1); // ���� ������ ��� +1�� �������
		System.out.println(cal.getActualMaximum(cal.DAY_OF_MONTH)); // �ش�� ������ ����.
		System.out.println("--------------------------------------");
		System.out.println(cal.before(cal2)); //����ð����� ������ �ð��̹Ƿ� false ��ȯ
		System.out.println(cal.before(cal3)); //����ð����� �̷��� �ð��̹Ƿ� true �� ��ȯ
		System.out.println("--------------------------------------");
		System.out.println(cal.after(cal2)); //����ð� ���� ������ �ð��̹Ƿ� true�� ��ȯ
		System.out.println(cal.after(cal3)); //����ð� ���� �̷��� �ð��̹Ƿ� false�� ��ȯ
	
	}



	public static void main(String[] args) {
		new Hw04();
	}

}
