package day15;
/*
 * ¹®Á¦1]
 * 	
 * 		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ¼­
 * 		ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÌ ÀÌ¸ŞÀÏ Çü½Ä¿¡ ¸Â´Â Áö °Ë»çÇÏ¼¼¿ä 
 * 		ÀÌ¸ŞÀÏ Çü½ÄÀº
 * 			¾ËÆÄºª°ú ¼ıÀÚ·Î 8ÀÚ ÀÌ»óÀ¸·Î ÇÏ°í @ µµ¸ŞÀÎÁÖ¼Ò.
 * 		Âü°í ] 
 * 			ÇÑ±Û Ã³¸® : [°¡-ÆR] - ÇÑ±ÛÀº ¾ÆÀÌµğ¿¡ ¾²Áö¸¶¼¼¿ä 
 * 
 * 	
 */

import java.util.regex.*;
import javax.swing.*;
public class Ex01 {

	public Ex01() {
		
		String mail = JOptionPane.showInputDialog("¸ŞÀÏÀ» ÀÔ·ÂÇÏ¼¼¿ä");
		Pattern pattern = Pattern.compile("^(\\w{8,})(@)(\\w*)(\\.[a-zA-Z]{2,})(\\.?[a-zA-Z]*)");

		Matcher match = pattern.matcher(mail);
		
		if(match.matches()) {
			System.out.println("Á¤»óÀûÀÎ ¸ŞÀÏÀÔ´Ï´Ù");
			
		}else {
			System.out.println("ºñÁ¤»óÀûÀÎ ¸ŞÀÏÀÔ´Ï´Ù.");
		}
		
		
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
