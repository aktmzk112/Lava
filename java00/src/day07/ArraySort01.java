package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * 		예제 ]
 * 			로또 한 게임을 만들어서 배열에 담고
 * 			낮은 번호부터 정렬해서 
 * 			담긴 데이터를 출력해 보자
 * 
 * 			로또 한 게임은 
 * 				1~45 까지의 숫자가 6개 가 필요하다.
 * 	
 */
public class ArraySort01 {

	public static void main(String[] args) {
		//할일
		//1. 정수 6개가 저장될 배열을 만든다.
		int[] lotto = new int[6];
		
		loop:
		for(int i=0; i<lotto.length; i++) {
			//2. 배열에 랜덤하게 정수를 만들어서 
			int no = (int)(Math.random()*(45 -1+1)+1);
			//3. 이전에 만들어진 같은 번호가 있는지 체크하고
			for(int j=0; j<i; j++) {
				if(lotto[j] == no) {
					i--;
					continue loop;
				}
			}
			//이경우를 실행하는 경우는 위의 반복문의 모두 실행이 된 경우고 
			//그 의미는 같은 번호가 이전에는 없다는 의미이므로 
			//4. 각 방에 그 번호를 저장 하고 
			
			lotto[i] = no;
		
		}
		
		//5. 출력
		JOptionPane.showMessageDialog(null, "*** 당첨번호 ***\n" + Arrays.toString(lotto));
		//6. 정렬하고
		for(int i=0; i<lotto.length-1; i++) {
			//여기서 비교할 데이터는 맨 마지막 데이터는 비교할 필요가 없으므로 맨마지막
			// 이전까지만 뽑아서 비교한다.
			
			//꺼낸 데이터 이후부터 맨 마지막 까지 하나씩 꺼내서 비교한다.
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		//7. 출력 
		JOptionPane.showMessageDialog(null, "<html><div style=\"color:red; text-align:center;\"> *** 당첨 예정 번호 ***</div></html>\n" + Arrays.toString(lotto));
	}

}
