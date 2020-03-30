package exam;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex01_pro {

	public Ex01_pro() {

		int len = 0;

		while (true) {

			// 숫자형태 문자열 입력
			String snum = JOptionPane.showInputDialog("배열의 길이를 입력하세요!");

			// 문자열을 정수로 변환

			try {
				len = Integer.parseInt(snum);
				// 이 라인을 읽는다면 위의 숫자로 변환과정이 무사히 진행이 된 것이므로
				// 이 반복문을 종료해준다.
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "숫자가 아닌 문자를 입력했습니다.");
				continue;
			}

		}
		// 이제 배열의 길이는 정해졌으니 배열을 만들고
		int[] num = new int[len];

		// 배열은 만들어 졌고 이제 배열에 숫자를 채워준다..
		loop: for (int i = 0; i < len; i++) {
			while (true) {
				String sno = JOptionPane.showInputDialog("숫자를 입력하세요!");
				try {
					int no = Integer.parseInt(sno);
					// 이 라인을 실행하는 경우는 위의 정수로 변환과정이 정장적으로 수행이 된 경우이다.
					// 배열에 ㅊ채워주면 된다
					num[i] = no;
					continue loop;
				} catch (Exception e) {
					// 이경우는 배열에 채울 숫자를 못만든 경우이므로
					// 숫자를 다시 만들어야 겠다.
					continue;
				}
			}

		}
		// 이제 배열은 완성이 되었으니 합을 구해주자
		int sum = getSum(num);
		
		// 출력하자
		JOptionPane.showMessageDialog(null,"num[] : "+  Arrays.toString(num) + "\n" + "sum: " + sum );
	}

	/*
	 * public int getSum(int[] arr) {
	 * 
	 * int sum=0; 
	 * for(int i=0; i < arr.length; i++)
	 *  { 
	 *  	sum += arr[i];
	 *   }
	 * 
	 * return sum; }
	 */
	public int getSum(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		new Ex01_pro();
	}

}
