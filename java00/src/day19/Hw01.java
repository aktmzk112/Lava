package day19;

import java.io.*;
import java.util.*;
public class Hw01 {

	public Hw01() {
		//1. ������ ��Ʈ�� ����
		FileOutputStream fout = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			fout = new FileOutputStream("src/day19/etc/hw01.txt");
			System.out.print("������ ���ڿ��� �Է� �ϼ��� : ");
			String str = sc.nextLine();
			byte[] b = str.getBytes();
			
			fout.write(b);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		
		}finally {
			
			try {
				fout.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		//���� ������ 
		
	
	}

	public static void main(String[] args) {
		new Hw01();
	
	}

}
