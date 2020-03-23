package day10;

public class Test04 {

	public static void main(String[] args) {
		String str  = "rnasjdufrjdfs";
		
		int idx = str.lastIndexOf('f');
		System.out.println(idx);
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i) + " - " + i + "\n");
		}
	}
 
}
