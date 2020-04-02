package day18;

import java.util.*;
import java.io.*;

public class Test01 {

/*
	sample.txt ������ �о Map���� �������� 
 *	
 */
	public Test01() {
		//Proerties ������ �����
		Properties prop = new Properties();
		
		// �ܺ� ���ϰ� ������ �����̴�.
		// �� �۾��� ���Ŀ� �� ������ IO���� ��Ȯ�� ��������
		// �ϴ� ������ �ڵ�
		FileInputStream fin = null; //������ ���� ���� ���ܰ� ������ ���̱� ������ �ϴ� null�� �ʱ�ȭ �ϰ�
									//try ������ ������ �����͸� �����Ѵ�
		
		try {
			fin = new FileInputStream("src/day18/Sample_ko.txt");
			//��δ� ���� ��θ� ����ؼ� �츮�� ���� �۾��ϴ� ������ (D:\\java\\git\\Lava\\java00\\src\\day18\\Sample.txt)�� �ص� �������
			//��Ŭ���� �ȿ� �����͸� ����� �̰��� �̸����� �ڽ��� ��θ� ���Ӱ� ���ؼ� ó���ϹǷ�
			//���� ���ó�� ������Ʈ ������ ��θ� ã���ָ� �ȴ�.
			
			//�� ������ ������ Properties�� �е����Ѵ�.
			prop.load(fin);
			// load �Լ��� ����Ǵ� ���� ������ ������ �о Map���� ó���� �س��Ҵ�
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//�������ʹ� ��ġ HashMap�� �����Ͱ� ����� �� ó�� ����ϸ� �ȴ�.
		// Properties ������ ���� ������ "="�� �������� ������ Ű���̵ǰ� �������� �����Ͱ� �ȴ�.
		//		id = increpas-cls2	����ϸ� map.put("id" , "increpas-cls2") ��� �Է��ѰͰ� �����ϴ�
		String name = (String)prop.get("name");
		System.out.println("������ ¦�� �̸� : " + name);
		System.out.println("���� : " + prop.get("age"));
		System.out.println("��ȭ��ȣ : " + prop.get("tel"));
		System.out.println("�ּ� : " + prop.get("addr"));
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
