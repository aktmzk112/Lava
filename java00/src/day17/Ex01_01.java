package day17;

import java.util.*;

public class Ex01_01 {

	public Ex01_01() {
		ArrayList<String> nList = new ArrayList<String>();
		ArrayList<Stud> tList = new ArrayList<Stud>();
		nList.add("�ֵο�");
		nList.add("ȸ��");
		nList.add("����");
		nList.add("������");
		nList.add("�ݷ� ���ڵ�");

		int no = 1001;
		for (int i = 0; i < nList.size(); i++) {
			tList.add(new Stud());
			int ban = 1;
			int kor = (int) (Math.random() * 91 + 10);
			int eng = (int) (Math.random() * 91 + 10);
			int math = (int) (Math.random() * 91 + 10);
			int phy = (int) (Math.random() * 91 + 10);
			int cod = (int) (Math.random() * 91 + 10);

			tList.get(i).setName(nList.get(i));
			tList.get(i).setBan(ban);
			tList.get(i).setNo(no++);
			tList.get(i).setKor(kor);
			tList.get(i).setEng(eng);
			tList.get(i).setMath(math);
			tList.get(i).setPhysics(phy);
			tList.get(i).setCod(cod);
			tList.get(i).setTotal();

		}

		for (int i = 0; i < tList.size(); i++) {
			Collections.sort(tList);
			System.out.print("�̸� : " + tList.get(i).getName() + " ");
			System.out.print("�� : " + tList.get(i).getBan() + " ");
			System.out.print("�л���ȣ : " + tList.get(i).getNo() + " ");
			System.out.print("���� ���� : " + tList.get(i).getKor() + " ");
			System.out.print("���� ���� : " + tList.get(i).getEng() + " ");
			System.out.print("���� ���� : " + tList.get(i).getMath() + " ");
			System.out.print("���� ���� : " + tList.get(i).getPhysics() + " ");
			System.out.print("�ڵ� ���� : " + tList.get(i).getCod() + " ");
			System.out.print("����: " + tList.get(i).getTotal() + "\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------");
		}

	}

	public static void main(String[] args) {
		new Ex01_01();
	}

}
