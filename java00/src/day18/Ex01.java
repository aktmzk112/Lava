package day18;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.*;
public class Ex01 {
/*
 	문제 1]
 		1.Ex01.txt 저장된 데이터를 Properties의 담고 
 		2.key값을 모두 꺼내서 
 		3.데이터를 추출하고 
 		4.총점을 구해주세요 
 		5.메세지창을 띄어서 총점을 출력해주세요 
 		
 */
	public Ex01() {
		int sum=0;
		
		//1. Ex01.txt파일 읽어오는 작업 
		Properties prop = new Properties();
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			
			prop.load(fin);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//2. 키값 꺼내는 작업
//		Set set = prop.keySet();
		Set<Map.Entry<Object, Object>> set = prop.entrySet();
		
		Iterator<Map.Entry<Object, Object>> itor = set.iterator();
		
		while(itor.hasNext()) {
			Map.Entry<Object, Object> ent = itor.next();
			System.out.println(ent.getKey() +" = "+ent.getValue());
			sum += Integer.parseInt((String)ent.getValue());
			//꺼내온 데이터를 정수로 빠꾸고 sum에 더하는 작업
		}
		
		
		
		
		//3. 꺼내온 키값으로 데이터 출력
//		Iterator itor =  set.iterator();
//		
//		while(itor.hasNext()) {
//			String key = (String)itor.next();
//			System.out.println(key + "점수 : " + prop.get(key));
//			//꺼내온 데이터를 정수로 빠꾸고 sum에 더하는 작업
//			sum += Integer.parseInt((String) prop.get(key));
//		}
		
		//총점 출력
		JOptionPane.showMessageDialog(null, "총점은 : " + sum + "입니다");
		
		
		
	
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
