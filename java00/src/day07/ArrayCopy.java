package day07;

import java.util.*;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,5};
		
		int[] num2 = num1; // 얕은 복사. 
		
//		float[] no = num1; //Heap Type 다르면 대입이 불가능 하다.
		
		num1[2] = 30;
		System.out.println("num1 : " + Arrays.toString(num1));
		System.out.println("num1 : " + Arrays.toString(num2));

	}

}
