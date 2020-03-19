package day08.presolv;
/*
 * 문제 4] 
	전화번호를 입력하면 
	'-'를 기준으로 데이터를 분리하여 
	저장할 배열을 만들고 분리된 데이터를 순서에 맞게 입력하고 출력 
	indexOf()
	substring() 
	사용
	
 */

import java.util.Arrays;

import javax.swing.*;
public class Solv04 {

	public static void main(String[] args) {
		/*
		 *  전화번는 xxx-xxxx-xxxx의 형식으로 입력받을것이고 이 번호를 문자열로 저장을 하고
		 	문자열 중의 - 의 갯수만큼 반복을 하여 번호를 나누고 
		 	배열의 저장하면 된다.
		 */
		
		//1. 입력받아서 변수에 저장
			String phone = JOptionPane.showInputDialog("전화번호를 입력 하세요!!");
		//2. '-' 의 갯수를 카운트 하고 
			int cnt = 0;
			for(int i=0; i<phone.length(); i++) {
				char ch = phone.charAt(i);
				if( ch<'0' || ch >'9' ) {
					++cnt;
				}
			}
			
			
		//3. 분리된 문자열을 입력할 배열을 만들고
		// ==> 전화번호를 분리를 하게 되면 '-'의 갯수보다 1개가 더 많은 문자열로 분리가 된다.
		String[] arr = new String[cnt +1];
		
		//4. 배열에 문자열을 잘라서 입력
		//잘려진 문자열을 저장할 변수를 만든다
		//처음에는 전체 문자열 모두 저장이 되어야 한다
		String tmp = phone;
		int idx =0;
		for(int i=0; i<cnt; i++) {
			//'-' 의 인텍스를 알아낸다.
			for(int j=0; j<tmp.length(); j++) {
				if(tmp.charAt(j) < '0' || tmp.charAt(j) > '9') {
					idx = j;
					break;
				}
			}
			
			idx = tmp.indexOf('-');
			
			//이제 '-'의 인덱스는 알아냈으니 
			//'-' 이전까지 문자열을 추출해야한다.
			arr[i] = tmp.substring(0,idx);
			
			//뒷번호들 다시 잘라서 tmp 에 저장
			//다시 위 의 명령들 반복
			tmp = tmp.substring(idx+1);
			
			
			
		}
		arr[cnt] = tmp;
		//5. 출력!
		JOptionPane.showMessageDialog(null, "입력한 번호 :" + phone + "\n불리한배열 : "+Arrays.toString(arr));
		
	
		
	}

}
