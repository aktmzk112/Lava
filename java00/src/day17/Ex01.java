package day17;

import java.util.*;
import javax.swing.*;

public class Ex01 {

	public Ex01() {
		ArrayList<Stud> list = new ArrayList<Stud>();

		while (true) {
			String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���\n����� q�� �Է��ϼ���");
			if (name.equals("q")) break;
			String sban = JOptionPane.showInputDialog("���� �Է��ϼ���");
			int ban = Integer.parseInt(sban);
			String sno = JOptionPane.showInputDialog("�л���ȣ�� �Է��ϼ���");
			int no = Integer.parseInt(sno);
			
			int kor = (int) (Math.random() * 91 + 10);
			int eng = (int) (Math.random() * 91 + 10);
			int math = (int) (Math.random() * 91 + 10);
			int phy = (int) (Math.random() * 91 + 10);
			int cod = (int) (Math.random() * 91 + 10);

			list.add(new Stud());

			for (int i = 0; i < list.size(); i++) {
				list.get(i).setName(name);
				list.get(i).setBan(ban);
				list.get(i).setNo(no);
				list.get(i).setKor(kor);
				list.get(i).setEng(eng);
				list.get(i).setMath(math);
				list.get(i).setPhysics(phy);
				list.get(i).setCod(cod);
				list.get(i).setTotal();

				System.out.println("�̸� : " + list.get(i).getName());
				System.out.println("�� : " + list.get(i).getBan());
				System.out.println("�л���ȣ : " + list.get(i).getNo());
				System.out.println("���� ���� : " + list.get(i).getKor());
				System.out.println("���� ���� : " + list.get(i).getEng());
				System.out.println("���� ���� : " + list.get(i).getMath());
				System.out.println("���� ���� : " + list.get(i).getPhysics());
				System.out.println("�ڵ� ���� : " + list.get(i).getCod());
				System.out.println("����: " + list.get(i).getTotal());
			}
			


		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
