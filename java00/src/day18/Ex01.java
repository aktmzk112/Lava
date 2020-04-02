package day18;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.*;
public class Ex01 {
/*
 	���� 1]
 		1.Ex01.txt ����� �����͸� Properties�� ��� 
 		2.key���� ��� ������ 
 		3.�����͸� �����ϰ� 
 		4.������ �����ּ��� 
 		5.�޼���â�� �� ������ ������ּ��� 
 		
 */
	public Ex01() {
		int sum=0;
		
		//1. Ex01.txt���� �о���� �۾� 
		Properties prop = new Properties();
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			
			prop.load(fin);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//2. Ű�� ������ �۾�
//		Set set = prop.keySet();
		Set<Map.Entry<Object, Object>> set = prop.entrySet();
		
		Iterator<Map.Entry<Object, Object>> itor = set.iterator();
		
		while(itor.hasNext()) {
			Map.Entry<Object, Object> ent = itor.next();
			System.out.println(ent.getKey() +" = "+ent.getValue());
			sum += Integer.parseInt((String)ent.getValue());
			//������ �����͸� ������ ���ٰ� sum�� ���ϴ� �۾�
		}
		
		
		
		
		//3. ������ Ű������ ������ ���
//		Iterator itor =  set.iterator();
//		
//		while(itor.hasNext()) {
//			String key = (String)itor.next();
//			System.out.println(key + "���� : " + prop.get(key));
//			//������ �����͸� ������ ���ٰ� sum�� ���ϴ� �۾�
//			sum += Integer.parseInt((String) prop.get(key));
//		}
		
		//���� ���
		JOptionPane.showMessageDialog(null, "������ : " + sum + "�Դϴ�");
		
		
		
	
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
