package day15;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		int[] arr = {10,5,7,15,9};
		
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.fill(arr, 1924238293);
		System.out.println(Arrays.toString(arr));
	}

}
