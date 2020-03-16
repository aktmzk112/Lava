package test01;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// Array
		System.out.println("[Array]");

		Info[] inforArr = new Info[5];
		
		for (int i =0; i<inforArr.length; i++) {
			
			Info in = new Info();
			String str = String.valueOf(i);
			
			in.setId(str);
			in.setPass(str);
			in.setName(str);
			in.setPhone(str);
			in.setEmail(str);
			
			inforArr[i] = in;
		}
		
		for(int i = 0; i < inforArr.length; i++) {
			System.out.println(inforArr[i].getId() + "");
			System.out.println(inforArr[i].getPass() + "");
			System.out.println(inforArr[i].getName() + "");
			System.out.println(inforArr[i].getPhone() + "");
			System.out.println(inforArr[i].getEmail() + "");
		}
		
		System.out.println("[ArrList]");
	 //ArrayList
		ArrayList<Info> list = new ArrayList<Info>();
		
		
			 Info in2 = new Info();
			 Info in3 = new Info();
//			 String str2 = String.valueOf(i);
			 
			 int a = (list.size()-1) +1;
			 System.out.println(a);
			 in2.setId("À¯ÅÂÈñ");
			 in2.setPass("1234");
			 in2.setName("À¯ÅÂÈñ");
			 in2.setPhone("12341424");
			 in2.setEmail("¾øÀ½");
		
			 list.add(in2);
			 
			 in3.setId("À¯ÅÂÈñ1");
			 in3.setPass("1234323");
			 in3.setName("À¯ÅÂÈñ3");
			 in3.setPhone("1234142414");
			 in3.setEmail("¾øÀ½11");
		
			 list.add(in3);
			
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getId() + "");
			System.out.println(list.get(i).getPass() + "");
			System.out.println(list.get(i).getName() + "");
			System.out.println(list.get(i).getPhone() + "");
			System.out.println(list.get(i).getEmail() + "");
		}
		
		
		
	}

}
